--FUNCION PARA EFECTUAR UNA DESCARGA AL INSTANTE
select descarganow(9);


--FUNCION PARA REALIZAR LA DESCARGA POR CAPAS DEL INVENTARIO
CREATE OR REPLACE FUNCTION descargaNow(integer) RETURNS INTEGER AS $$
DECLARE
  CURSOR_ds CURSOR FOR SELECT ds.cns_ds,ds.id_articulo,ds.cantidad FROM salidas s, detalle_salida ds WHERE ds.no_salida=$1 and s.no_salida=ds.no_salida order by ds.cns_ds;
    tupla_ds record;  
  CURSOR_inv cursor for select cns_ent,id_articulo,existencia from inventario where id_articulo=tupla_ds.id_articulo order by cns_ent;
    tupla_inv record;
  CANT_EN_CAPA integer;
  cantidad float;
BEGIN
OPEN CURSOR_ds;
 LOOP 
 fetch CURSOR_ds into tupla_ds;
  exit when not found;  
  cantidad:=tupla_ds.cantidad; --total a descontar del inventario por articulo        
     OPEN CURSOR_inv;
          LOOP           
            fetch CURSOR_inv into tupla_inv; --recorrer las capas del inventario
            exit when not found;
                 CANT_EN_CAPA:=tupla_inv.existencia;
              IF(cantidad>0)THEN
	       IF(CANT_EN_CAPA<=cantidad)THEN --Si la cantida en la capa del inventario es menor a la de salida, se elimina el registro y se guarda el restante
	         cantidad:=cantidad-CANT_EN_CAPA;
	           INSERT into detalle_salida_capas(no_salida,cns_ds,cantidad,no_entrada) VALUES($1,tupla_ds.cns_ds,CANT_EN_CAPA,tupla_inv.cns_ent);
	           delete from inventario where cns_ent=tupla_inv.cns_ent and id_articulo=tupla_ds.id_articulo;	           
	       ELSE
		   CANT_EN_CAPA:=CANT_EN_CAPA-cantidad;
		   INSERT into detalle_salida_capas(no_salida,cns_ds,cantidad,no_entrada) VALUES($1,tupla_ds.cns_ds,cantidad,tupla_inv.cns_ent);
		   update inventario set existencia=CANT_EN_CAPA where cns_ent=tupla_inv.cns_ent and id_articulo=tupla_ds.id_articulo;
		   cantidad:=0;
	       END IF;
	        --raise notice'id Art:=%,Falta:=%',tupla_inv.id_articulo, cantidad;
              ELSE
               exit;
	      END IF;
          END LOOP;
	cantidad:=0;
    CLOSE CURSOR_inv;
 END LOOP; 	
CLOSE CURSOR_ds;
return 0;
end;
$$language'plpgsql';
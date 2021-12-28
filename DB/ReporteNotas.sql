--BUSQUEDA DETALLADA DE NOTAS
SELECT 
   fecha,n.nota_venta,a.id_articulo,dn.cantidad,a.descripcion,p.descripcion_p,dn.cantidad*i.precio_venta as subtotal,dn.cantidad*i.iva_v as iva, (dn.cantidad*i.precio_venta+dn.cantidad*i.iva_v) as total,c.nombre,id_ruta
FROM 
   notas n, detalle_nota dn, articulos a, inventario i, presentacion p, clientes c 
WHERE 
   (fecha between '14-05-2011' AND '22-05-2011') AND n.nota_venta=dn.nota_venta AND i.id_articulo=a.id_articulo AND dn.cns_art = i.cns_art and a.id_presentacion=p.id_presentacion AND n.id_cliente=c.id_cliente
ORDER BY 
    dn.cns_det_nota asc;


--BUSQUEDA GENERAL DE NOTAS
/*SELECT 
   *
FROM 
   notas
WHERE 
   (fecha between '14-05-2011' AND '22-05-2011')  */
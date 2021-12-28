--(PRESENTACIONES)
create sequence sig_presentacion;
create table presentacion(
 id_presentacion integer primary key default nextval('sig_presentacion'),
 descripcion_p   varchar
);

--(ARTICULOS)
create table articulos
(
id_articulo     numeric(15) primary key,
descripcion     varchar,
precio_venta    numeric(10,2),
iva_venta       numeric(3,2),
id_presentacion integer references presentacion
);

--(ENTRADAS)
create sequence sig_entrada;
create table entradas(
cns_ent integer primary key default nextval('sig_entrada'),
fecha_compra date default now(),
subtotal numeric(10,2),
descuento numeric(10,2),
sub_total numeric(10,2),
iva numeric(10,2),
total numeric(10,2),
cantidad numeric(10,2)
);

--(DETALLE DE ENTRADAS) 
create sequence sig_det_entrada;
create table detalle_entrada(
cns_det integer primary key default nextval('sig_det_entrada'),
cns_ent integer references entradas,
id_articulo numeric(15) references articulos,
cantidad numeric(10,3),
precio_compra numeric(10,2),
iva_c numeric(10,2)
);

--(INVENTARIO)
create sequence sig_registro_inventario;
create table inventario(
cns_inv         integer primary key default nextval('sig_registro_inventario'),
cns_ent         integer,
id_articulo     numeric(15) references articulos,
precio_compra   numeric(10,2),
iva_c           numeric(10,2),
existencia      numeric(11,3),
fecha_caducidad date
);

--(ESTADOS DE LA REPUBLICA)
create sequence sig_estado start with 32;
create table estado
(
id_estado   integer primary key default nextval('sig_estado'),
descripcion varchar
);

--(CIUDADES)
create sequence sig_ciudad start with 68;
create table ciudad
(
id_ciudad   integer primary key default nextval('sig_ciudad'),
id_estado   integer references estado,
descripcion varchar
);

--(EMPLEADOS)
create sequence sig_empleado;
create table empleado
(
id_empleado      integer primary key default nextval('sig_empleado'),
nombre           varchar,
rfc              varchar,
direccion        varchar,
telefono         varchar,
fecha_de_ingreso date,
sueldo_base      numeric(7,2)
);

--(RUTAS)
create sequence sig_ruta;
create table ruta
(
id_ruta       integer primary key default nextval('sig_ruta'),
id_trabajador integer references empleado,
descripcion   varchar
);

--(GIRO DEL NEGOCIO)
create sequence sig_actividad;
create table actividad(
id_actividad  integer primary key default nextval('sig_actividad'),
descr_act     varchar
);
--(CLIENTES)
create sequence sig_cliente;
create table clientes
(
id_cliente    integer primary key default nextval('sig_cliente'),
nombre        varchar,
negocio       varchar,
direccion     varchar,
rfc           varchar,
telefono      varchar,
id_ciudad     integer references ciudad,
limite_credito numeric(10,2),
dias_credito  integer,
id_ruta       integer references ruta,
prioridad     integer,
frecuentado   character(7),
id_actividad  integer references actividad,
fecha_registro date default now()
);

--(LIQUIDADO,PENDIENTE,CANCELADO)
create sequence sig_estatus_fact;
create table estatus_de_factura
(
cns_e       integer primary key default nextval('sig_estatus_fact'),
descripcion varchar
);
insert into estatus_de_factura(descripcion) values('LIQUIDADO'),('PENDIENTE'),('CANCELADO'),('PREVENTA');

--(CREDITO,CONTADO)
create sequence sig_concepto_fact;
create table concepto_de_factura(
cns_c       integer primary key default nextval('sig_concepto_fact'),
descripcion varchar
);
insert into concepto_de_factura(descripcion) values('CREDITO'),('CONTADO');

--(NOTAS DE VENTA)
create table notas(
 nota_venta  varchar primary key,
 fecha date  default current_timestamp,
 id_cliente  integer references clientes,
 id_ruta     integer references ruta,
 cant_tot    numeric(10,2),
 subtotal    numeric(10,2),
 descuento   numeric(10,2),
 sub_total   numeric(10,2),
 iva         numeric(10,2),
 total       numeric(10,2),
 id_estatus  integer references estatus_de_factura
);

--(DETALLE DE NOTAS)
create sequence sig_detalle_nota;
create table detalle_nota(
 cns_det_nota integer primary key default nextval('sig_detalle_nota'),
 nota_venta       varchar,
 id_articulo      numeric(15) references articulos,
 cantidad         numeric(10,2),
 subtotal         numeric(10,2),
 descuento        numeric(10,2),
 sub_total        numeric(10,2),
 iva              numeric(10,2),
 total            numeric(10,2),
 foreign key(nota_venta) references notas
);

--(PAGO DE NOTAS)
create sequence sig_pago_notas;
create table pago_notas(
 cns_liq integer primary key default nextval('sig_pago_notas'),
 fecha_pago date,
 nota_venta varchar references notas,
 cns_pago integer,
 importe numeric(10,2)
);

--(FACTURAS)
create table facturacion
(
no_factura varchar primary key,
fecha      date default current_timestamp,
subtotal   money,
iva        money,
total      money,
descuento  money,
observaciones varchar,
id_ruta     integer references ruta,
id_concepto integer references concepto_de_factura,
id_estatus  integer references estatus_de_factura,
id_cliente  integer references clientes
);

--(DETALLE DE FACTURAS)
create sequence sig_detalle_facturacion;
create table detalle_facturacion
(
 cns_det_fact  integer primary key default nextval('sig_detalle_facturacion'),
 no_factura    varchar,
 id_articulo   numeric(15) references articulos,
 cantidad      numeric(10,2),
 precio_venta  money,
 iva_venta     money,
 importe       money,
foreign key(no_factura) references facturacion
);

--(TIPO DE SALIDA - venta,merma)
create sequence sig_tipo_salida;
create table tipo_salida(
 id_tipo_salida  integer primary key default nextval('sig_tipo_salida'),
 descripcion     varchar
);
insert into tipo_salida(descripcion) values('VENTA'),('MERMA'),('TRANSFERENCIA');

--(SALIDAS DE INVENTARIO)
create sequence sig_salida;
create table salidas(
 no_salida   integer primary key default nextval('sig_salida'),
 fecha       date default current_timestamp,
 cant_tot    numeric(10,2),
 subtotal    numeric(10,2),
 descuento   numeric(10,2),
 sub_total   numeric(10,2),
 iva         numeric(10,2),
 total       numeric(10,2), 
 observaciones varchar,
 id_ruta         integer references ruta,
 id_tipo_salida  integer references tipo_salida 
);

--(DETALLE DE SALIDAS)
create sequence sig_detalle_salida;
create table detalle_salida(
 cns_ds       integer primary key default nextval('sig_detalle_salida'),
 no_salida    integer,
 id_articulo  numeric(15) references articulos,
 cantidad     numeric(10,2),
 precio_venta numeric(10,2),
 iva_venta    numeric(10,2),
 foreign key(no_salida) references salidas
);

--(DETALLE DE SALIDAS POR CAPA)
create sequence sig_detalle_salida_capa;
create table detalle_salida_capas(
 cns_ds_capa  integer primary key default nextval('sig_detalle_salida_capa'),
 no_salida    integer,
 cns_ds       integer, 
 cantidad     numeric(10,2),
 no_entrada   integer,
 foreign key(cns_ds) references detalle_salida
);

--(DEVOLUCIONES)
create sequence sig_devolucion;
create table devoluciones(
 cns_dev       integer primary key default nextval('sig_devolucion'),
 no_salida     integer references salidas,
 fecha         date default current_timestamp,
 subtotal      numeric(10,2),
 iva           numeric(10,2),
 total         numeric(10,2),
 observaciones varchar
);

--(DETALLE DE DEVOLUCION)
create sequence sig_det_dev;
create table detalle_devolucion(
 cns_detdev   integer primary key default nextval('sig_det_dev'),
 cns_dev      integer references devoluciones,
 id_articulo  numeric(15) references articulos,
 cantidad     numeric(10,3),
 precio_venta numeric(10,2),
 iva_venta    numeric(10,2)
);

--(IVA)
create table ivas(
 anio integer primary key,
 iva_en_ventas numeric(5,2),
 iva_en_compras numeric(5,2)
);

--(MOBILIARIO Y EQUIPO)
create table mobiliario_y_equipo(
 id_mob integer primary key,
 descripcion varchar,
 modelo varchar, 
 marca varchar,
 logo varchar,
 existencia float
);

--(COMODATOS)
create table comodatos(
 no_comod integer primary key,
 id_cliente integer references clientes, 
 total_mob integer,
 fecha_elaboracion date,
 fecha_cancelacion date,
 observaciones varchar
);
--(DETALLE DEL COMODATO)
create sequence sig_detalle_comodato;
create table detalle_comodato(
 cns_detcomod integer primary key default nextval('sig_detalle_comodato'),
 no_comod integer references comodatos,
 id_mob integer references mobiliario_y_equipo,
 cantidad integer,
 serie varchar
);

--FUNCION PARA REALIZAR LA DESCARGA POR CAPAS DEL INVENTARIO, recibe de parametro el numero de salida...
CREATE OR REPLACE FUNCTION descargaNow(integer) RETURNS INTEGER AS $$
DECLARE
  CURSOR_ds CURSOR FOR SELECT ds.cns_ds,ds.id_articulo,ds.cantidad FROM salidas s, detalle_salida ds WHERE ds.no_salida=$1 and s.no_salida=ds.no_salida order by ds.cns_ds;
    tupla_ds record;  
  CURSOR_inv cursor for select cns_ent,id_articulo,existencia from inventario where id_articulo=tupla_ds.id_articulo order by cns_ent;
    tupla_inv record;
  CANT_EN_CAPA float;
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
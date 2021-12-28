select 
  a.id_articulo,precio_compra,iva_c,ds.precio_venta,ds.iva_venta
from
  articulos a, detalle_salida ds, detalle_entrada de
where
  ds.id_articulo=a.id_articulo and ds.no_entrada=de.cns_ent and a.id_articulo=de.id_articulo
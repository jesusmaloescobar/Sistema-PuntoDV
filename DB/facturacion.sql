--consulta del cliente
/*
SELECT 
  cs.nombre,cs.direccion,cs.rfc,cs.telefono,ciud.descripcion AS ciudad, e.descripcion AS estado
FROM
  clientes cs, ciudad ciud, estado e
WHERE
  id_cliente=1 AND ciud.id_estado=e.id_estado AND cs.id_ciudad=ciud.id_ciudad;
*/

--consulta de facturas
/*SELECT 
  fact.fecha,fact.descuento,fact.subtotal,fact.iva,fact.total, fact.observaciones, rut.descripcion AS ruta, edf.descripcion as estatus
FROM
  facturacion fact, ruta rut, estatus_de_factura edf
WHERE
  fact.no_factura='1' AND fact.id_ruta=rut.id_ruta AND fact.id_estatus=edf.cns_e;
*/

--consulta del detalle de facturas
/*SELECT 
  df.cantidad,arts.id_articulo,arts.descripcion,pres.descripcion_p AS presentacion, i.precio_venta, df.cantidad*i.precio_venta AS importe
FROM 
  detalle_facturacion df, articulos arts, presentacion pres, inventario i  
WHERE 
  no_factura='1' AND i.id_articulo=arts.id_articulo AND arts.id_presentacion=pres.id_presentacion AND df.cns_art = i.cns_art order by df.cns_det_fact asc
*/

--consulta de notas
SELECT 
  arts.id_articulo,dn.cantidad
FROM 
  detalle_nota dn, articulos arts, inventario i  
WHERE 
  nota_venta='1' AND i.id_articulo=arts.id_articulo AND dn.cns_art = i.cns_art order by dn.cns_det_nota asc
  
  
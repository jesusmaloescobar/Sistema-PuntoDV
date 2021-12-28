SELECT a.id_articulo,a.descripcion,p.descripcion_p, i.precio_compra, i.iva_c, a.precio_venta, a.iva_venta,(select sum(existencia) where i.id_articulo=a.id_articulo) as total,(select sum(existencia) where i.id_articulo=a.id_articulo)*i.precio_compra as inversion 
FROM   inventario i,articulos a,presentacion p
WHERE  i.id_articulo=a.id_articulo and p.id_presentacion=a.id_presentacion 
GROUP  BY i.id_articulo,a.id_articulo,a.descripcion,p.descripcion_p, i.precio_compra, i.iva_c, a.precio_venta, a.iva_venta
ORDER  BY i.id_articulo;

/*SELECT 
    sum(precio_compra*existencia), 
    sum(iva_c*existencia), 
    sum(precio_compra*existencia+iva_c*existencia) 
FROM inventario i;*/
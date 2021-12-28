SELECT
   i.cns_art,a.descripcion,p.descripcion_p, i.precio_compra, i.iva_c, i.precio_venta, i.iva_v,existencia,i.fecha_caducidad,a.id_articulo
FROM
   inventario i
JOIN
    articulos a ON i.id_articulo=a.id_articulo, presentacion p
WHERE
   i.existencia>0 AND p.id_presentacion=a.id_presentacion AND a.descripcion like'A%'
ORDER BY 
   i.cns_art
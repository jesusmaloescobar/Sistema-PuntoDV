/*SELECT 
  ds.cns_art,ds.cantidad,art.descripcion, p.descripcion_p,i.iva_v, i.precio_venta
FROM 
  salidas s, detalle_salida ds,articulos art, inventario i, presentacion p
WHERE 
  s.no_salida=2 AND s.no_salida=ds.no_salida AND ds.cns_art=i.cns_art AND i.id_articulo=art.id_articulo AND art.id_presentacion=p.id_presentacion
*/

--buscar la existencia de un articulo en X salida
SELECT 
 cantidad 
FROM 
 detalle_salida ds
JOIN
 inventario i ON ds.cns_art=i.cns_art
WHERE 
 no_salida=2 AND i.id_articulo=1
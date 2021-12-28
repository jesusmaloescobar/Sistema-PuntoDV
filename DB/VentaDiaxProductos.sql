--REPORTE DE VENTAS POR PRODUCTOS
/*SELECT 
  fecha,
  a.id_articulo,
  (select sum(cantidad) from detalle_salida where cns_art=ds.cns_art) as cantidad,
  descripcion,
  p.descripcion_p,
  (select sum(cantidad) from detalle_salida where cns_art=ds.cns_art)*i.precio_venta as subtotal,
  (select sum(cantidad) from detalle_salida where cns_art=ds.cns_art)*i.iva_v as iva
FROM 
  salidas s,detalle_salida ds,inventario i, articulos a, presentacion p 
WHERE 
  fecha between '19-05-2011' and '22-05-2011' AND ds.no_salida=s.no_salida AND ds.cns_art=i.cns_art AND i.id_articulo=a.id_articulo AND a.id_presentacion=p.id_presentacion
GROUP BY 
  fecha,ds.cns_art,a.id_articulo,descripcion,precio_venta,iva_v,descripcion_p
ORDER BY fecha,id_articulo;*/

--LO MAS VENDIDO...
/*SELECT 
  fecha,
  a.id_articulo,
  (select sum(cantidad) from detalle_salida where cns_art=ds.cns_art) as cantidad,
  descripcion,
  p.descripcion_p,
  (select sum(cantidad) from detalle_salida where cns_art=ds.cns_art)*i.precio_venta as subtotal,
  (select sum(cantidad) from detalle_salida where cns_art=ds.cns_art)*i.iva_v as iva
FROM 
  salidas s,detalle_salida ds,inventario i, articulos a, presentacion p 
WHERE 
  fecha between '19-05-2011' and '19-05-2011' AND ds.no_salida=s.no_salida AND ds.cns_art=i.cns_art AND i.id_articulo=a.id_articulo AND a.id_presentacion=p.id_presentacion
GROUP BY 
  fecha,ds.cns_art,a.id_articulo,descripcion,precio_venta,iva_v,descripcion_p
ORDER BY cantidad desc;*/

--LO MENOS VENDIDO...
SELECT 
  fecha,
  a.id_articulo,
  (select sum(cantidad) from detalle_salida where cns_art=ds.cns_art) as cantidad,
  descripcion,
  p.descripcion_p,
  (select sum(cantidad) from detalle_salida where cns_art=ds.cns_art)*i.precio_venta as subtotal,
  (select sum(cantidad) from detalle_salida where cns_art=ds.cns_art)*i.iva_v as iva
FROM 
  salidas s,detalle_salida ds,inventario i, articulos a, presentacion p 
WHERE 
  fecha between '19-05-2011' and '22-05-2011' AND ds.no_salida=s.no_salida AND ds.cns_art=i.cns_art AND i.id_articulo=a.id_articulo AND a.id_presentacion=p.id_presentacion
GROUP BY 
  fecha,ds.cns_art,a.id_articulo,descripcion,precio_venta,iva_v,descripcion_p
ORDER BY cantidad asc;
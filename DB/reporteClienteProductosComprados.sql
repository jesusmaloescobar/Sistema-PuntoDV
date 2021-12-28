/*select sum (cantidad) 
  from 
    detalle_nota
  where id_articulo=1108; */
SELECT 
  dn.id_articulo,
  a.descripcion,
  p.descripcion_p,
  (select sum(cantidad) from detalle_nota where id_articulo=dn.id_articulo) as cantidad,
  (select sum(subtotal) from detalle_nota where id_articulo=dn.id_articulo) as ST,
  (select sum(descuento) from detalle_nota where id_articulo=dn.id_articulo) as DSCT,
  (select sum(sub_total) from detalle_nota where id_articulo=dn.id_articulo) as S_T,
  (select sum(iva) from detalle_nota where id_articulo=dn.id_articulo) as I,
  (select sum(total) from detalle_nota where id_articulo=dn.id_articulo) as T
FROM
  notas n, detalle_nota dn, articulos a, presentacion p
WHERE
  (n.fecha between '05-06-2011' and '05-06-2011') AND n.id_cliente=1 and n.nota_venta=dn.nota_venta AND dn.id_articulo=a.id_articulo AND a.id_presentacion=p.id_presentacion
GROUP BY dn.id_articulo,a.descripcion, p.descripcion_p,cantidad,ST,DSCT,S_T,I,T
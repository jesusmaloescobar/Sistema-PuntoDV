select 
  dn.id_articulo,
  a.descripcion,
  p.descripcion_p,
  sum(dn.cantidad) as cantidad,
  sum(dn.subtotal) as subtotal,
  sum(dn.descuento) as descuento,
  sum(dn.iva) as iva,
  sum(dn.total) as total 
from 
  notas n, detalle_nota dn, articulos a, presentacion p
where 
  fecha between '14-06-2011' and '07-07-2011' and id_cliente=0 and n.nota_venta=dn.nota_venta and n.id_estatus<3 and dn.id_articulo=a.id_articulo and a.id_presentacion=p.id_presentacion
group by
  dn.id_articulo,a.descripcion,p.id_presentacion,p.descripcion_p  
order by
  p.id_presentacion;
select 
  n.id_cliente,c.nombre,c.negocio,count(n.id_cliente)as veces_compra,sum(n.cant_tot)  as cantidad_comprada,sum(subtotal) as subtotal,sum(descuento) as descuento,sum(sub_total) as sub_total,sum(iva) as iva,sum(total) as total
from 
  notas n, clientes c 
where 
  n.id_cliente=c.id_cliente and n.id_estatus<3 and c.id_cliente in (select id_cliente from notas) and fecha between '01-01-2011' and '06-07-2011'
group by
  n.id_cliente,c.nombre,c.negocio
order by veces_compra desc;

--select sum(total) from notas where id_cliente=3829 and fecha between '01-01-2011' and '06-07-2011'
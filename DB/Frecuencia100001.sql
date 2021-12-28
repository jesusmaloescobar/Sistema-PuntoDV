select id_cliente,nombre,negocio,direccion,ci.descripcion from clientes c, ciudad ci where (SUBSTRING(frecuentado,1,1))='1' AND id_ruta=8 AND c.id_ciudad=ci.id_ciudad order by id_cliente
--select SUBSTRING((select frecuentado from clientes where id_cliente=0),1,1)
--select substring('Hola Mundo', 1,  2);
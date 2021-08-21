/*
1. Id de los clientes de Tunja. 
2. Id y la descripción de los productos que cuesten menos de $1500 pesos. 
3. Id y nombre de los clientes, cantidad vendida y la descripción del producto, 
	en las ventas en las cuales se vendieron más de 10 unidades. 
4. Id y nombre de los clientes que no aparecen en la tabla de ventas 
	(Clientes que no han comprado productos). 
5. Id y nombre de los clientes que han comprado todos los productos de la empresa. 
6. Id, nombre de cada cliente y la suma total (suma de cantidad) de los productos que ha comprado.
7. Id de los productos que no han sido comprados por clientes de Cali. 
8. Id de los productos que se han vendido a clientes de Medellín y que 
	también se han vendido a clientes de Bogotá. 
9. Nombre de las ciudades en las que se han vendido todos los productos. 
10. fecha de mayor venta 
*/	
-- 1. Id de los clientes de Tunja. 
select * from persona;
use mibase;
SELECT idpersona/*, nombre */FROM persona WHERE ciudad='Tunja';
SELECT idpersona FROM mydb.persona WHERE ciudad='Tunja';

-- 2. Id y la descripción de los productos que cuesten menos de $1500 pesos. 
select * from producto;
SELECT idProducto, descripcion FROM mydb.producto WHERE precio<=1500;
SELECT idProducto, nombre, precio  FROM mydb.producto WHERE precio<=1500 order BY precio;
SELECT idProducto, nombre, sum(precio)  FROM mydb.producto WHERE precio<=1500 group by precio;
-- 3. Id y nombre de los clientes, cantidad vendida y la descripción del producto, 
	-- en las ventas en las cuales se vendieron más de 10 unidades. 
    SELECT * FROM mydb.persona;
-- llave 
	SELECT * FROM mydb.factura T1 
    INNER JOIN mydb.persona T2 
    ON T1.Persona_idpersona = T2.idpersona and idpersona =123;
-- Fin
#ordenar por cantidad 
	SELECT * FROM mydb.factura T1 
		INNER JOIN mydb.persona T2 
	ON T1.Persona_idpersona = T2.idpersona and idpersona =123
		GROUP BY cantidad;
    
#atributos por tabla 
select * from factura;
select * from producto;
select * from persona;
SELECT idfactura, fecha, fecha2, persona.nombre, persona.apellido, producto.nombre, cantidad
FROM factura 
INNER JOIN persona 
    on idpersona = Persona_idpersona
INNER JOIN producto 
    on idProducto = Producto_idProducto
ORDER BY idfactura;
-- 3. Id y nombre de los clientes, cantidad vendida y la descripción del producto, 
	-- en las ventas en las cuales se vendieron más de 10 unidades. 
    
SELECT idfactura, persona.nombre, persona.apellido, sum(cantidad), producto.nombre 
FROM factura 
INNER JOIN persona 
    on idpersona = Persona_idpersona
INNER JOIN producto 
    on idProducto = Producto_idProducto 
where cantidad>10 group by  persona.nombre order by idFactura;
-- group by idpersona order by idFactura

-- 4. Id y nombre de los clientes que no aparecen en la tabla de ventas 
	-- (Clientes que no han comprado productos). 
SELECT idpersona, nombre, apellido from persona
where idpersona not in (select idpersona from factura INNER JOIN persona 
    on idpersona = Persona_idpersona group by idpersona);
    
-- 5. Id y nombre de los clientes que han comprado todos los productos de la empresa. 
select * from producto order by nombre;
select count(nombre) from Producto order by nombre;
-- lo agrupo 
select * from persona;
select idpersona, nombre, apellido, Producto_idProducto from factura INNER JOIN persona 
    on idpersona = Persona_idpersona group by idpersona, Producto_idProducto;

select idpersona, nombre from (select idpersona, nombre, count(idpersona) as cuenta from (
select idpersona, nombre, apellido, Producto_idProducto from factura INNER JOIN persona 
    on idpersona = Persona_idpersona group by idpersona, Producto_idProducto ) as t  group by t.idpersona)as t2 where t2.cuenta=3;
    
-- lo cuento  6. Id, nombre de cada cliente y la suma total (suma de cantidad) de los productos que ha comprado.
Select t.idpersona, t.nombre, t.apellido, count(t.nombre) from (select idpersona, nombre, apellido, count(nombre) as r from factura INNER JOIN persona 
    on idpersona = Persona_idpersona group by Producto_idProducto ) as t  group by t.nombre;

select * from producto;

select idpersona, nombre, apellido, sum(cantidad) as suma from (
select idpersona, nombre, apellido, Producto_idProducto, cantidad from factura INNER JOIN persona 
    on idpersona = Persona_idpersona group by idpersona, Producto_idProducto ) as t  group by t.idpersona;
    
 --   7. Id de los productos que no han sido comprados por clientes de Cali. 
select * from factura;
select * from persona;

SELECT idProducto
FROM factura 
INNER JOIN persona 
    on Persona_idpersona =idpersona 
INNER JOIN producto 
    on Producto_idProducto =idProducto where idProducto not in (SELECT idProducto
FROM factura 
INNER JOIN persona 
    on Persona_idpersona =idpersona 
INNER JOIN producto 
    on Producto_idProducto =idProducto where persona.ciudad='cali') group by idProducto

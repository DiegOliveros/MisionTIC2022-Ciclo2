/* 0. Ciudades de colombia */
SELECT * FROM sakila.city where country_id=24;
/* 1. Id de los clientes de Sogamoso. */
select * from  sakila.city where city_id = 487;
select * from  sakila.city where city = 'Sogamoso';
/* 1. Id de los clientes de Tunja. */
select * from  sakila.city where city = 'Tunja'; /*en este caso no trae registros pero funciona*/

/*2. Id y la descripción de las rentas de menos de $5 USD. */
SELECT * FROM sakila.rental inner join sakila.customer where customer.customer_id=rental.customer_id ;
SELECT rental_id, inventory_id, rental.customer_id, first_name, last_name FROM sakila.rental inner join sakila.customer where customer.customer_id=rental.customer_id ;
SELECT * FROM sakila.payment;
select * from sakila.rental;
select * from  sakila.payment inner join sakila.rental where payment.customer_id=rental.customer_id and amount>5;


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
/*
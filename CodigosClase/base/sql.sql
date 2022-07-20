/* la cantidad de pagos y la suma de todos los pagos que ha realizado el cliente 1 en la db de sakila*/
SELECT count(payment_id) as numpagos, sum(amount) as suma FROM sakila.payment where customer_id=1;

/* La suma de las cantidades de los pagos por cada uno de los clientes de sakila*/
select customer_id, sum(amount) as total from sakila.payment group by customer_id order by total;
/*numero de clientes de Sakila*/
select count(customer_id) as no_clientes from (select customer_id from sakila.payment group by customer_id) as t ;
select count(customer_id)as no_clientes from (select distinct customer_id from sakila.payment) as t;

/*la cantidad minima del total de pagos que ha realizado un cliente*/
select min(total) from (select customer_id, sum(amount) as total from sakila.payment group by customer_id) as t;

/*la suma de la cantidad de pagos realiazados por los clientes 6 y 7 */
select customer_id, sum(amount) from sakila.payment where customer_id>5 and customer_id<8 group by customer_id  ;

/*ejemplo de una consulta anidada x sobre w*/
select count(payment_id) from (select payment_id from sakila.payment) as x; 
select count(pagos) as resultado from (select payment_id as pagos from sakila.payment as w) as x; 

/*los primeros 1000 registros*/
select * from sakila.payment;
/*El total de registros en sakila*/
select count(customer_id) from sakila.payment;
/*la suma de las cantidades para todos los registros en sakila*/
select sum(amount) from sakila.payment;
select sum(amount) as suma_cantidad from sakila.payment;
/*Un registro en particular de sakila (registro 16000)*/
select * from sakila.payment where payment_id=16000;
/*seleccionar un rango de registros (pagos del 5 al 8)*/
select * from sakila.payment where payment_id>=5 and payment_id<=8;
/*seleccionar los pagos realizados por los clientes 6 y 7 */
select * from sakila.payment where customer_id>5 and customer_id<8;


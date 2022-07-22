SELECT * FROM sakila.actor where first_name='JULIA';
/* SI INICIA CON UNA LETRA EN este caso "O"*/
SELECT * FROM sakila.actor where first_name LIKE 'O%';
/*Actores con un apellido en particular*/
SELECT * FROM sakila.actor where last_name='JOHANSSON';
/*La tercera letra del apellido es A*/
SELECT * FROM sakila.actor where last_name like '__A%';
/*Nombrees que terminen en S*/
SELECT * FROM sakila.actor where first_name like '%S';
/*¿Cuáles ciudades de colombia hay en la base?
¿qué ciudades de colombia tienen actores?*/

select * from sakila.country; 
select * from city;
select country_id from country where country ="Colombia";
select * from city where country_id =24;
select city from city where country_id =(select country_id from country where country ="Colombia");
select city from city where country_id =(select country_id from country where country ="Afghanistan");
/*ciudades con nombres compuestos*/
select city from city where city like '%-%';
select city from city where city like '% %'; -- Allappuzha (Alleppey) 
/*cuántos nombres de actores que tienen 3 letras*/
select first_name from actor where length(first_name)=3;
/*¿Cuántas películas están en francés?*/ 
select count(title) from film where language_id = (select language_id from language where name="French");
/*promedio suma máximo minimo */
select avg(length) as duración from film;
select Max(length) as maxduración from film;
select min(length) as minduración from film;
select sum(length) as duracióntodas from film;
select * from film where length >=75 and length<=115 ;
select * from film where length between 75 and 115;
/*listar el nombre de la película y su actor*/
select * from film;
select * from actor;
select * from film_actor;
select title, first_name, last_name 
from film f, actor a, film_actor fa where f.film_id=fa.film_id and a.actor_id = fa.actor_id 









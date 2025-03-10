create database ecommercedb;
use ecommercedb;
create table products(p_id int primary key,p_name varchar(255),category varchar(50),price decimal(10,2),image_url varchar(7000));

insert into products values( 1,"iphone 16 pro","Mobiles",75000,"https://tse2.mm.bing.net/th?id=OIF.Hbs3H1nU3KEeGt0ZJ443pw&pid=Api&P=0&h=180"),
(2,"Samsung s24 ultra","Mobiles",90000,"https://tse1.mm.bing.net/th?id=OIP.s0exIaNvIbCKV2OQ3NOadQHaEK&pid=Api&P=0&h=180"),
(3,"Red Magic 9 pro","Mobiles",80000,"https://tse2.mm.bing.net/th?id=OIP._1Wje1s3s1DtI3ncTAEkmQHaHa&pid=Api&P=0&h=180"),
(4,"Iqoo Neo 10 pro","Mobiles",80000,"https://tse2.mm.bing.net/th?id=OIP._1Wje1s3s1DtI3ncTAEkmQHaHa&pid=Api&P=0&h=180");

select * from products;

update products set image_url="https://tse2.mm.bing.net/th?id=OIP.WlONQUt6xEhqa_oAjHvbdwHaHa&pid=Api&P=0&h=180" where p_id=4;
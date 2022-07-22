CREATE DATABASE  cooperativaunaldos;
DROP DATABASE cooperativaunaldos;
DROP TABLE Cliente;
USE cooperativaunaldos;


CREATE TABLE Cliente(
doccliente int,
nombre VARCHAR(40),
apellido VARCHAR(40),
correo VARCHAR(40),
celular VARCHAR(15),
direccion VARCHAR(40),
primary key(doccliente)
);

ALTER TABLE lineasCredito ADD COLUMN montomax int, 
ADD COLUMN plazomax int;
ALTER TABLE lineasCredito DROP column montomax;
ALTER TABLE lineasCredito CHANGE montomax montomaximo int;
ALTER TABLE lineasCredito ADD PRIMARY KEY (cod_Linea);


CREATE TABLE lineasCredito(
cod_linea int(3),
nombre varchar(40) NOT NULL UNIQUE
);



create table bicicletas(

	id int primary key,
    fabricante char(20),
    precioUnitario int,
    ano int,
    foreign key (fabricante) references fabricantes (fabricantes)
    );

insert into bicicletas values (1001,'Cannondale', 1200000, 2020);
insert into bicicletas values (1002,'Trek', 1450000, 2019);
insert into bicicletas values (1003,'Yeti', 2000000, 2020);
insert into bicicletas values (1004,'Fuji', 950000, 2021);
insert into bicicletas values (1005,'Bmc', 1950000, 1018);
create table compras(
id int primary key,
alias char(20),
fabricante char(20),
fecha char(30),
foreign key (alias) references clientes (alias),
foreign key (fabricante) references fabricantes (fabricantes)
);

insert into compras values ('01', 'lucky', 'Cannondale', '2012-10-25 20.00:00');
insert into compras values ('02', 'lucky', 'Trek', '2019-03-15 18:30:00');
insert into compras values ('03', 'lucky', 'Starker', '2019-05-20 20:30:00');
insert into compras values ('04', 'malopez', 'Cannondale', '2018-05-20 20:30:00');
insert into compras values ('05', 'malopez', 'Starker', '2020-01-20 20:30:00');
insert into compras values ('06', 'diva', 'Yeti', '2019-05-20 20:30:00');
insert into compras values ('07', 'diva', 'Fuji', '2018-06-22 21:30:00');
insert into compras values ('08',  'diva', 'Lucky Lion', '2020-03-17 15:30:20');
insert into compras values ('09',"dreamer" , "Lucky Lion" , '2020-03-17 15:30:20');
insert into compras values ('10',"dreamer",  "Be Electric" , '2020-04-10 18:30:20');
insert into compras values ('11',"ninja",  "Aima" , '2020-02-17 20:30:20');
insert into compras values ('12',"ninja" , "Starker" , '2020-02-20 16:30:20');
insert into compras values ('13',"ninja" , "Mec de Colombia" , '2020-03-27 18:30:20');
insert into compras values ('14',"rose",  "Atom Electric" , '2020-03-20 21:30:20');
insert into compras values ('15',"green" , "Yeti" , '2020-01-10 17:30:20');
insert into compras values ('16',"green" , "Trek" , '2020-02-15 20:30:20');
insert into compras values ('17',"green" , "Bmc" , '2020-03-17 18:30:20');
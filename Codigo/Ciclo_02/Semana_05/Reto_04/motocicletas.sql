create table motocicletas(
id int primary key,
fabricante char (20),
precio int,
autonomia int,
id_prov int,
foreign key (fabricante) references fabricantes (fabricante),
foreign key (id_prov) references  proveedor (prov_id)

);

insert into motocicletas values (2001, 'Starker', 18, 101);
select 'Consulta 1';
select fabricantes from fabricantes order by fabricantes;
select 'Consulta 2';
select fabricante, precioUnitario,ano from bicicletas where ano >=2019 order by fabricante;
select 'Consulta 3';
select fabricante from motocicletas where id_prov=101;
select 'Consulta 4';
select fabricante from compras where alias = 'lucky' order by fabricante;
select 'Consulta 5';
select clientes.alias, clientes.nombre, clientes.apellido from clientes, compras where compras.alias=clientes.alias and compras.fabricante= "Yeti"   order by   clientes.nombre;
select 'Consulta 6';
select count(fabricante) from bicicletas where ano>=2019;
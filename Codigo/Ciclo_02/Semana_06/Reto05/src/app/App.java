package app;

import myjdbc.MyJDBC;

public class App {
    public static MyJDBC myjdbc;
    private static String databaseName= "reto05";
    private static String username= "MinTic2022";
    private static String userPassword= "MinTic2022";

    public static void main(String[] args){
        myjdbc = new MyJDBC(databaseName, username, userPassword);
        System.out.println(myjdbc.ConnectionMyDB());
        Create();
        Read();
        Update();
        Delete();

    }
    public static void Create(){
        myjdbc.CREATE(myQuery= "insert into bicicletas values (1001,'Cannondale', 1200000, 2020);");
        myjdbc.CREATE(myQuery= "insert into bicicletas values (1002,'Trek', 1450000, 2019);");
        myjdbc.CREATE(myQuery= "insert into bicicletas values (1003,'Yeti', 2000000, 2020);");
        myjdbc.CREATE(myQuery= "insert into bicicletas values (1004,'Fuji', 950000, 2021);");
        myjdbc.CREATE(myQuery= "insert into bicicletas values (1005,'Bmc', 1950000, 1018);");

        myjdbc.CREATE(myQuery=  "insert into clientes values('lucky','Pedro','Perez','31855555');");
        myjdbc.CREATE(myQuery=  "insert into clientes values('malopez','Maria','Lopez','32698574');");
        myjdbc.CREATE(myQuery=  "insert into clientes values('diva','Ana','Diaz','31254879');");
        myjdbc.CREATE(myQuery=  "insert into clientes values('dreamer','Luis','Rojas','31245786');");
        myjdbc.CREATE(myQuery=  "insert into clientes values('ninja','Andres','Cruz','3115678432');");
        myjdbc.CREATE(myQuery=  "insert into clientes values('neon','Nelson','Ruiz','31265984');");
        myjdbc.CREATE(myQuery=  "insert into clientes values('rose','Claudia','Mendez','31265984');");
        myjdbc.CREATE(myQuery=  "insert into clientes values('green','Jorge','Rodriguez','326954878');");

        myjdbc.CREATE(myQuery=  "insert into fabricantes values ('Cannondale'),"+
                                 "('Trek'),"+
                                 "('Yeti'),"+
                                 "('Fuji'),"+
                                 "('Bmc'),"+
                                 "('Starker'),"+
                                 "('Lucky Lion'),"+
                                 "('Be Electric'),"+
                                 "('Aima'),"+
                                 "('Mec de Colombia'),"+
                                 "('Atom Electric');");
        myjdbc.CREATE(myQuery= "insert into proveedor values (101, 'Auteco','calle 7 No. 45-17', '05713224459'),"+
                                "(102, 'Hitachi', 'calle 19 No. 108-26', '05714223344'),"+
                                " (103, 'Bosch', 'carrera 68 No. 26-45', '05715678798'),"+
                                "(104, 'Teco', 'calle 77 No. 68-33', '05712213243'),"+
                                "(105, 'General Electric', 'calle 29 No. 26-12', '05717239919');");

        myjdbc.CREATE(myQuery= "insert into compras values ('01', 'lucky', 'Cannondale', '2012-10-25 20.00:00');");
        myjdbc.CREATE(myQuery= "insert into compras values ('02', 'lucky', 'Trek', '2019-03-15 18:30:00');");
        myjdbc.CREATE(myQuery= "insert into compras values ('03', 'lucky', 'Starker', '2019-05-20 20:30:00');");
        myjdbc.CREATE(myQuery= "insert into compras values ('04', 'malopez', 'Cannondale', '2018-05-20 20:30:00');");
        myjdbc.CREATE(myQuery= "insert into compras values ('05', 'malopez', 'Starker', '2020-01-20 20:30:00');");
        myjdbc.CREATE(myQuery= "insert into compras values ('06', 'diva', 'Yeti', '2019-05-20 20:30:00');");
        myjdbc.CREATE(myQuery= "insert into compras values ('07', 'diva', 'Fuji', '2018-06-22 21:30:00');");
        myjdbc.CREATE(myQuery= "insert into compras values ('08',  'diva', 'Lucky Lion', '2020-03-17 15:30:20');");
        myjdbc.CREATE(myQuery= "insert into compras values ('09','dreamer' , 'Lucky Lion', '2020-03-17 15:30:20');");
        myjdbc.CREATE(myQuery= "insert into compras values ('10','dreamer',  'Be Electric' , '2020-04-10 18:30:20');");
        myjdbc.CREATE(myQuery= "insert into compras values ('11','ninja',  'Aima' , '2020-02-17 20:30:20');");
        myjdbc.CREATE(myQuery= "insert into compras values ('12','ninja' , 'Starker' , '2020-02-20 16:30:20');");
        myjdbc.CREATE(myQuery= "insert into compras values ('13','ninja' , 'Mec de Colombia' , '2020-03-27 18:30:20');");
        myjdbc.CREATE(myQuery= "insert into compras values ('14','rose',  'Atom Electric' , '2020-03-20 21:30:20');");
        myjdbc.CREATE(myQuery= "insert into compras values ('15','green' , 'Yeti' , '2020-01-10 17:30:20');");
        myjdbc.CREATE(myQuery= "insert into compras values ('16','green', 'Trek' , '2020-02-15 20:30:20');");
        myjdbc.CREATE(myQuery= "insert into compras values ('17','green' , 'Bmc' , '2020-03-17 18:30:20');");


        myjdbc.CREATE(myQuery= "insert into motocicletas values (2001, 'Starker', 4200000, 18, 101);");
        myjdbc.CREATE(myQuery= "insert into motocicletas values (2002, 'Lucky Lion', 5600000, 14, 102);");
        myjdbc.CREATE(myQuery= "insert into motocicletas values (2003, 'Be Electric', 4600000, 26, 101);");
        myjdbc.CREATE(myQuery= "insert into motocicletas values (2004, 'Aima', 8000000, 36, 103);");
        myjdbc.CREATE(myQuery= "insert into motocicletas values (2005, 'Mec de Colombia', 5900000, 20, 104);");
        myjdbc.CREATE(myQuery= "insert into motocicletas values (2006, 'Atom Electric', 4500000, 12, 105);");

    }

    public static void Read(){
        String query;
        String[] listaCabeceras;
        /*Primer consulta*/
        System.out.println("Primer Consulta");
        query= "select * from fabricantes order by fabricantes;";
        listaCabeceras= new String[]{"fabricantes"};
        myjdbc.READ(query, listaCabeceras, cantidadCabeceras=1);

        /*Segunda consulta*/
        System.out.println("Segunda Consulta");
        query= "select * from bicicletas where ano >=2019 order by fabricante;";
        listaCabeceras= new String[]{"fabricante", "precioUnitario", "ano"};
        myjdbc.READ(query, listaCabeceras, cantidadCabeceras=3);

        /*Tercera consulta*/
        System.out.println("Tercera Consulta");
        query= "select * from motocicletas where id_prov=101;";
        listaCabeceras= new String[]{"fabricante"};
        myjdbc.READ(query, listaCabeceras, cantidadCabeceras=1);

        /*Cuarta consulta*/
        System.out.println("Cuarta Consulta");
        query= "select * from compras where alias = 'lucky' order by fabricante;";
        listaCabeceras= new String[]{"fabricante"};
        myjdbc.READ(query, listaCabeceras, cantidadCabeceras=1);

        /*Quinta consulta*/
        System.out.println("Quinta Consulta");
        query= "select * from clientes, compras where compras.alias=clientes.alias and compras.fabricante= \"Yeti\"   order by   clientes.nombre;";
        listaCabeceras= new String[]{"clientes.alias", "clientes.nombre", "clientes.apellido"};
        myjdbc.READ(query, listaCabeceras, cantidadCabeceras=3);

        /*Sexta consulta*/
        System.out.println("Sexta Consulta");
        query= "select count(fabricante) from bicicletas where ano>=2019;";
        listaCabeceras= new String[]{"count(fabricante)"};
        myjdbc.READ(query, listaCabeceras, cantidadCabeceras=1);


    }
    public static void Update(){
        String query;
        /* Actualizacion #1*/
        query="update bicicletas set ano =2017 where fabricante='Cannondale';";
        myjdbc.UPDATE(query);

        /* Actualizacion #2*/
        query="update clientes set celular = 3115678432 where alias='ninja';";
        myjdbc.UPDATE(query);


    }
    public static void Delete(){
        String query;

        /* Borrado #1*/
        query="delete from compras where alias = 'green' and fabricante='Trek';";
        myjdbc.DELETE(query);
    }
}

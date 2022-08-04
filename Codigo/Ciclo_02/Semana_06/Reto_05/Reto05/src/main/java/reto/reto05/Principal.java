package reto.reto05;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal {
     public static Scanner sc = new Scanner(System.in);
     
     public static void main(String[] args){
       conectar();
     }
     
    
     public static void menu(){
      /*try{
     System.out.println("******\n"+
     "1. Crear tablas de datos \n"+
     "++++++++++++++Modificación de datos+++++++++++++++\n"+
     "2. Ingresar los datos de la tabla de proveedores. \n"+
     "3. Ingresar los datos de la tabla de clientes  \n"+
     "4. Ingresar los datos de la tabla de fabricantes  \n"+
     "5. Ingresar los datos de la tabla de bicicletas  \n"+
     "6. Ingresar los datos de la tabla de motocicletas  \n"+
     "7. Ingresar los datos de la tabla de compras \n"+
     "++++++++++++++Modificación de datos+++++++++++++++\n"+
     "8. Modificar año.  \n"+
     "9. Modificar telefono.   \n"+
     "10. Borrar Intención de compra.  \n"+
     "++++++++++++++Consultas+++++++++++++++\n"+
     "11. Mostrar el listado de fabricantes.   \n"+
     "12. Mostrar información de fabricantes  bicicletas estrenadas en 2019.   \n"+
     "13. Mostrar fabricantes de motocicletas con motor Auteco.   \n"+
     "14. Mostrar fabricantes con intención de compra del cliente 'Lucky'.   \n"+
     "15. Mostrar clientes para bicicletas Yeti   \n"+
     "16. Cantidad de bicicletas fabricadas desde \"x\" año \n"+
     "++++++++++++++Finalización+++++++++++++++\n"+
     
     "Otro número para salir \n"+
     "++++++++++++++Modificación de datos+++++++++++++++\n"
     );
     System.out.print(">> ");
     String input = sc.nextLine();
     byte opcion = Byte.parseByte(input);
     
     switch(opcion){
     case 1:
     consultas.crearTables();
     break;
     case 2:
     proveedores.ingresarProveedor();
     break;
     case 3:
     clientes.ingresarClientes();
     break;
     case 4:
     fabricantes.ingresarFabricantes();
     break;
     case 5:
     bicicletas.ingresarBicicletas();
     break;
     case 6:
     motocicletas.ingresarMotocicletas();
     break;
     case 7:
     compras.ingresarCompras();
     break;
     case 8:
     motocicletas.ingresarMotocicletas();
     break;
     case 9:
     consultas.modificarCliente();
     break;
     case 10:
     consultas.borrarCompra();
     break;
     case 11:
     consultas.consultaFabricante();
     break;
     case 12:
     consultas.consultaBiciInfo();
     break;
     case 13:
     consultas.consultaMotoFabricante();
     break;
     case 14:
     consultas.consultaComprasBM();
     break;
     case 15:
     consultas.consultaComprasBCliente();
     break;
     case 16:
     consultas.consultaFabricanteBici();
     break;
     default:
     System.out.println("Cerrando");
     }
     }
     
     catch(Exception e){
     System.out.println("Cerrando");
     }
     
     */
     }
     
     public static Connection conectar(){
         String dbURL = "jdbc:mysql://127.0.0.1:3306/reto_04";
         String user = "root";
         String password = "";
         Connection con = null;
         try{
         con = DriverManager.getConnection(dbURL,user,password);
         if (con != null){
             System.out.println("Se ha conectado");
         }
          
             
         }catch(SQLException error){
             System.out.println("Error: "
             + error.getErrorCode() + " " + error.getMessage());
         }
         return con;
     }
}

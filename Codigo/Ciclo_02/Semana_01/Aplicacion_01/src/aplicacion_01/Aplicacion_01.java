/* 
Clase del 2022-06-22
Programción en Java

*/ 
package aplicacion_01;
import java.util.Scanner;
public class Aplicacion_01 {

  
    public static void main(String[] args) {
     
       
        
        Scanner obj=new Scanner(System.in);
        int edad;
        System.out.print("Digite su edad ");
        edad=obj.nextInt();
        if(edad<=18){
            System.out.print("Usted es menor de edad ");
        }
        else{
            System.out.print("Usted es mayor de edad ");
        }
                  
    }
    
}

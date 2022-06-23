/* 
Clase del 2022-06-22
Programción en Java

*/ 
package aplicacion_01;
import java.util.Scanner;
public class Aplicacion_01 {

  
    public static void main(String[] args) {
    Scanner captura=new Scanner(System.in);

    int num1,num2,resultado;
    System.out.print("Digite un número:");
    num1=captura.nextInt();
    System.out.print("Digite un número:");
    num2=captura.nextInt();
    resultado=num1 + num2;
    System.out.printIn("El resultado de la suma es "+resultado);

        
    }
    
}

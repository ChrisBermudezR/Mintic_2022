/*
 * En un estacionamiento cobran $ 1.500 por 
 * hora o fracción. Diseñe un algoritmo que 
 * determine cuanto debe pagar un cliente por 
 * el estacionamiento de su vehículo, conociendo 
 * el tiempo de estacionamiento en horas y minutos.
 * 
 */

/* 
Clase del 2022-06-22
Programción en Java

*/ 
package aplicacion_01;
import java.util.Scanner;
public class Aplicacion_01 {

  
    public static void main(String[] args) {
     
        Scanner obj=new Scanner(System.in);
        float horas;
        float minutos;
        float resultado1;
        float resultado2;
        System.out.print("Cuantas horas se demoró el cliente? ");
        horas=obj.nextInt();
        System.out.print("Cuantos minutos se demoró el cliente? ");
        minutos=obj.nextFloat()/60;
        if (horas==0){
            System.out.print("El precio total es $1500");
        } else if(horas>=1 && minutos>0){
                resultado1 =horas*1500;
                resultado2= resultado1+1500;
                System.out.print("El precio total es $"+resultado2);
        } else {
            resultado1 =horas*1500;
            System.out.print("El precio total es $"+resultado1);
        } 
        
    }
}
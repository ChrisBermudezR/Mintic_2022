/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
/**
 *
 * @author Christian Bermúdez R
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20220622;
import java.util.Scanner;
/**
 *
 * @author Christian Bermúdez R
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captura=new Scanner(System.in);
    
    int num1,num2,resultado;
    System.out.print("Digite un número:");
    num1=captura.nextInt();
    System.out.print("Digite otro número:");
    num2=captura.nextInt();
    resultado=num1 + num2;
    System.out.println("El resultado de la suma es "+resultado);
    }
    
}

/*
Calcular la calificación final de un estudiante, 
para realizar este algoritmo debe tener la clase 
principal y otra clase llamada Notas esta debe llevar un constructor. 
Los datos disponibles para lectura son 
calificación 1, equivale al 30% de la nota final, 
calificacion2, equivale al 20% de la nota final, 
calificacion3, equivale al 10% de la nota final, 
calificacion4, equivale al 40% de la nota final 
de cada uno de los cuatro exámenes presentados. 
La información que se debe imprimir es el promedio.
 */
package Ej20220713;

import javax.swing.JOptionPane;
        
public class Principal {

    public static void main(String[] args) {
       
        
        
        
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Inserte la nota 1: "));//Esto pide los datos en la clase pricipal
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Inserte la nota 2: "));
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Inserte la nota 3: "));
        float nota4 = Float.parseFloat(JOptionPane.showInputDialog("Inserte la nota 4: "));
        String nombre = JOptionPane.showInputDialog("Digite su nombre");
        
        Notas resultados = new Notas( nota1,  nota2,  nota3,  nota4,  nombre);// esto "Instancia" el constructor
        
        resultados.Calculos();//Esto llama un método de la clase Notas por medio de la x.
        System.out.println(resultados.toString());//metodo de impresión
        
        
    }
    
}

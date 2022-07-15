/*
En un estacionamiento cobran $ 1.500 por hora o fracción. 
Diseñe un algoritmo que determine cuanto debe pagar un cliente 
por el estacionamiento de su vehículo, conociendo el tiempo de 
estacionamiento en horas y minutos, el programa debe imprimir placa 
del vehículo y el tiempo en el parqueadero y total a pagar, para 
desarrollar este ejercicio debe contar con dos clases la clase principal y 
clase parqueadero esta debe tener un método constructor.
 */
package Parqueadero;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        
        int Hora = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas estuvo parqueado:  "));
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Inserte la nota 1: "));
        String placa = JOptionPane.showInputDialog("Digite la palca del automovil: ");
        float costo = 0;
         
        Parqueadero precio = new Parqueadero( Hora,  minutos,  placa,  costo);
        
        precio.Parqueadero();
        System.out.println(precio.toString());
         
    }
    
}

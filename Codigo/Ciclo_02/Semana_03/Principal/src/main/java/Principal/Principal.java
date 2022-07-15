
package Principal;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Digite el nombre del perro ");
         int raza = Integer.parseInt(JOptionPane.showInputDialog("escoja la raza.\n 1. Pincher\n 2. Bulldog"));
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Que edad tiene el perro: "));
        int peso = Integer.parseInt(JOptionPane.showInputDialog("Cuanto pesa? "));
        
        Perro p = new Perro( nombre,  raza,  peso,  edad);
        
        System.out.println(p.toString());
    }
    
}

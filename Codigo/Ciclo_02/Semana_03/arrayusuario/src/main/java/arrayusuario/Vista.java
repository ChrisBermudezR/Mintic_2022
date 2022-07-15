package arrayusuario;

import javax.swing.JOptionPane;

public class Vista {
   private int documento;
   private String nombre;
   private String apellido;
   private int edad;
   private float Estatura;
   
   public void pedirdatos(){
       
       documento=integer.parseint(JOptionPane.showInputDialog("Digite el número de documento"));
       nombre=JOptionPane.showInputDialog("Digite su nombre");
       apellido=JOptionPane.showInputDialog("Digite su apellido");
       edad=integer.parseint(JOptionPane.showInputDialog("Digite su edad"));
       Estatura = Float.parseFloat(JOptionPane.showInputDialog("Digite su estatura"));
       Controlador con =new Controlador();
       ArrayList<Usuario>listamostrar=new ArrayList<>();
       listamostrar=con.datos(documento, nombre, apellido, edad, Estatura);
   }
}

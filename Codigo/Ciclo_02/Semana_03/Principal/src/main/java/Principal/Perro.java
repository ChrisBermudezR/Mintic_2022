/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Christian Bermúdez R
 */
public class Perro {
    private String nombre;
    private int raza;
    private int peso;
    private int edad;
     public String mensaje;
     
    public Perro(String nombre, int raza, int peso, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }
    
    
   
    
    public void peso(){
        
        switch(raza){
        case 1:
        if(this.peso > 5){
            mensaje =" eres un gordito adorable!";
            
        }
        else {
            mensaje = " eres un atleta!";
            
        }
        case 2:
          if(this.peso > 30){
             mensaje =" eres un gordito adorable!";
            
        }
        else{
            mensaje = " eres un atleta!";
            
        }
        break;
    }
     
        
    
    }

    @Override
    public String toString() {
            return nombre + " tienes " +edad+ " años y " + mensaje;
    }
    
    
}

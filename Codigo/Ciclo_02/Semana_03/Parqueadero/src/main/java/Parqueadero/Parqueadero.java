/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parqueadero;

/**
 *
 * @author Christian Bermúdez R
 */
public class Parqueadero {
    private int Hora;
    private int minutos;
    private String placa;
    public float costo;

    public Parqueadero(int Hora, int minutos, String placa, float costo) {
        this.Hora = Hora;
        this.minutos = minutos;
        this.placa = placa;
        this.costo = costo;
    }

  
    
   
    public void Parqueadero(){
        
        if(Hora <= 0 && minutos > 0 && minutos < 60){
        costo = 1500f;
        }
        else if(Hora > 0 && minutos >= 0){
        costo=(Hora*1500f)+1500f;
        }
        /*else if(minutos > 60){
        minutos%%60;//Continuar con el perfeccionamiento de este ejercicio
        }*/
    }

    @Override
    public String toString() {
        return "El vehículo de placa " + placa +" estuvo parqueado por un tiempo de " + Hora + " hora/s y " + minutos + " minuto/s." + "El costo total del servicio es de: $ " + costo;
    }
    
    
}

package reto_02.estudiante;

import java.util.ArrayList;
import java.util.Scanner;


public class Registro {

    public static Scanner scan0;
    public static Posgrado posgrado;
    public static Pregrado pregrado;
    public static ArrayList<String> listaSalida;
    public static String[] listaEntrada;
    
    public static void main(String[] args) {
       scan0 = new Scanner(System.in);
       listaSalida = new  ArrayList<>();
       procesarComandos();
    }
  
    
    public static void agregarEstudiante(){
         if(listaEntrada[1].equals("Posgrado")){
            posgrado = new Posgrado(listaEntrada[2],
                    listaEntrada[3],
                    listaEntrada[4],
                    listaEntrada[5],
                    listaEntrada[6]);       
        }
        else if(listaEntrada[1].equals("Pregrado")){
            pregrado = new Pregrado(listaEntrada[2],
                    listaEntrada[3],
                    listaEntrada[4],
                    listaEntrada[5],
                    listaEntrada[6]);
    }
    
    }
    
    public static void listarEstudiante(){
       System.out.println("***Listado de estudiantes");
       for(String item:listaSalida){
       System.out.print(item);
       }
    }
    
     public static void procesarComandos(){
            listaEntrada = scan0.nextLine().split("&");
        do{
            if(listaEntrada[0].equals("1")){
            agregarEstudiante();
            }else if(listaEntrada[0].equals("2")){
                listarEstudiante();
            }
            listaEntrada = scan0.nextLine().split("&") ;
        }while(!listaEntrada[0].equals("3"));
        }
    
    
}

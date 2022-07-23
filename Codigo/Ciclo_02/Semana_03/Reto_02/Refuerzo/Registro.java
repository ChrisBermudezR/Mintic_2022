import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    /*Variables globales*/
    public static Scanner scan0;
    public static Elefante elefante;
    public static Conejo conejo;
    public static ArrayList<String> listaSalida;
    public static String[] listaEntrada;

     /*método principal*/
    public static void main(String[] args) {
        scan0 = new Scanner(System.in);
        listaSalida = new ArrayList<>();
        procesarComandos();
    }

    public static void listarAnimales(){
        System.out.print("***Listado de animales***");
        for(String item:listaSalida){
            System.out.print(item);
        }

    }
    public static void agregarAnimales(){
        if(listaEntrada[1].equals("Elefante")){
            elefante = new Elefante(listaEntrada[2],
                    listaEntrada[3],
                    listaEntrada[4],
                    listaEntrada[5],
                    listaEntrada[6]);
            listaSalida.add(elefante.toString());
        }
        else if(listaEntrada[1].equals("Conejo")){
            conejo = new Conejo(listaEntrada[2],
                    listaEntrada[3],
                    listaEntrada[4],
                    listaEntrada[5],
                    listaEntrada[6]);
            listaSalida.add(conejo.toString());
        }
    }
    public static void procesarComandos(){
        listaEntrada = scan0.nextLine().split("&");
        do {
            if(listaEntrada[0].equals("1")){
                agregarAnimales();
            }else if(listaEntrada[0].equals("2")){
                listarAnimales();
            }
            listaEntrada = scan0.nextLine().split("&");
        }while(!listaEntrada[0].equals("3"));
    }

}

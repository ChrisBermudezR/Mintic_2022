/*Super clase*/
/*Clase padre*/
public class Animal {
    /*Variables globales*/
    protected String nombre;
    protected String edad;
    protected String tipo;
    protected String color;

    public Animal(/*Variables locales*/ String name, String age, String tipo, String color){
        nombre = name;
        edad = age;
        this.tipo = tipo;
        this.color = color;
    }

    public String toString(){
        return "";
    }
}

/*subclase*/
/*Clase Hija*/
public class Conejo extends Animal{
    protected String numero_patas;

    public Conejo(String name, String age, String tipo, String color,
                  String numero_patas){
        super(name, age, tipo, color);
        this.numero_patas = numero_patas;
    }

    @Override
    public String toString() {
        return "\n\tAnimal Conejo" +
                "\n\tNombre: " + nombre +
                "\n\tEdad: " + edad +
                "\n\tTipo: " + tipo+
                "\n\tColor:"+ color+
                "\n\tNúmero patas: "+ numero_patas;
    }
}

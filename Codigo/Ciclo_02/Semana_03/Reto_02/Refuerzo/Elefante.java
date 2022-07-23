public class Elefante extends Animal{
    protected String numero_colmillos;

    public Elefante(String name, String age, String tipo, String color,
                  String colmillos){
        super(name, age, tipo, color);
        numero_colmillos = colmillos;
    }
    @Override
    public String toString() {
        return "\n\tAnimal Elefante" +
                "\n\tNombre: " + nombre +
                "\n\tEdad: " + edad +
                "\n\tTipo: " + tipo+
                "\n\tColor:"+ color+
                "\n\tNúmero patas: "+ numero_colmillos;
    }
}

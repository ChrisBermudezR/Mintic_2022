public class Posgrado extends Estudiante{
    protected String cantidad_creditos;
    
    public Posgrado(String nombre, String edad, String programa, String tipo_etnia, String cantidad_creditos){
                super( nombre,  edad,  programa,  tipo_etnia);
                this.cantidad_creditos = cantidad_creditos;
    }

    @Override
    public String toString() {
        return "\n\tEstudiante Posgrado" +
                "\n\t Nombre: " + nombre +
                "\n\t Edad: " + edad +
                "\n\t Programa: " + programa +
                "\n\t Etnia: " + tipo_etnia +
                "\n\t Creditos aprobados: " + cantidad_creditos;

   

   
    }
            
}

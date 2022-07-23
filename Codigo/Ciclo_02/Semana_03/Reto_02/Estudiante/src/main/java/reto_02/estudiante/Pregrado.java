package reto_02.estudiante;

public class Pregrado extends Estudiante{
    protected String modalidad;
    
    public Pregrado(String nombre, String edad, String programa, String tipo_etnia, String modalidad){
                super( nombre,  edad,  programa,  tipo_etnia);
                this.modalidad = modalidad;
    }
    
     @Override
    public String toString() {
        return "\n\tEstudiante Posgrado" +
                "\n\t Nombre: " + nombre +
                "\n\t Edad: " + edad +
                "\n\t Programa: " + programa +
                "\n\t Etnia: " + tipo_etnia +
                "\n\t Modalidad: " + modalidad;
    
    }
}

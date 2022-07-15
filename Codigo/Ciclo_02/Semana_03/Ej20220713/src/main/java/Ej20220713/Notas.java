
package Ej20220713;

public class Notas {
    
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private String nombre;
    public float promedio;
    
    public Notas(float nota1, float nota2, float nota3, float nota4, String nombre) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nombre = nombre;
    }

  
public void Calculos(){
    promedio = nota1*0.3f + nota2*0.2f + nota3*0.1f + nota2*0.4f;
    
}

    @Override
    public String toString() {
        return "El estudiante " + nombre + " tiene una nota final de " + promedio;//Este es el método para impremir en el principal
    }

  
   
}

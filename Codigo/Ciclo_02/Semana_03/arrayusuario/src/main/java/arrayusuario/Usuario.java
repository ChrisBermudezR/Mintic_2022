package arrayusuario;

public class Usuario {

   private int documento;
   private String nombre;
   private String apellido;
   private int edad;
   private float Estatura;

    public int getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public float getEstatura() {
        return Estatura;
    }

    public Usuario(int documento, String nombre, String apellido, int edad, float Estatura) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Estatura = Estatura;
    }
}

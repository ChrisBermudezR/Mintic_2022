
package arrayusuario;
import java.util.ArrayList;
public class Controlador {
    public ArrayList<Usuario>datos(int d, String n, String a, int e, float est){
        ArrayList<Usuario>lista=new ArrayList<>();
        Usuario usu=new Usuario(d,n,a,e,est);
        
        lista.add(usu)
    
    }
    
}

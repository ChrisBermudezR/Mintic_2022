
import java.util.ArrayList;


public class Obra {

    public Obra() {
    }
    
    public ArrayList<Integer> clases(ArrayList<Integer> listaCategorias) {
        ArrayList<Integer> listaNoRepetidos = new ArrayList<>();
        for(int categoria: listaCategorias) {            
            if (!listaNoRepetidos.contains(categoria)) {
                listaNoRepetidos.add(categoria);
            }            
        }
        return listaNoRepetidos;        
    }
    
    public ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> obrasFaltan, ArrayList<Integer> listaCategorias, int categoria) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int numero: obrasFaltan) {            
            if (listaCategorias.get(numero) == categoria) {
                lista.add(numero);
            }            
        }
        return lista;        
    }
    
    public ArrayList<Integer> noTengo(ArrayList<Integer> listaA, ArrayList<Integer> listaB) {
        ArrayList<Integer> listaResultado = new ArrayList<>();
        for (int numero: listaA) {
            if (!listaB.contains(numero)) {
                listaResultado.add(numero);
            }
        }        
        return listaResultado;
    }
    
    public Integer puedoCambiar(ArrayList<Integer> listaA, ArrayList<Integer> listaB) {
        int cantidad1 = noTengo(listaA, listaB).size();
        int cantidad2 = noTengo(listaB, listaA).size();
        
        if (cantidad1 < cantidad2) {
            return cantidad1;
        } else {
            return cantidad2;
        }        
    }
    
    
}

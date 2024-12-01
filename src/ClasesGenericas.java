
import java.util.ArrayList;
import java.util.List;

public class ClasesGenericas <T> {
    private List<T> elementos;
    
    public ClasesGenericas(){
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento){
        elementos.add(elemento);
    }

    public void eliminarElemento(T elemento){
        elementos.remove(elemento);
    }
    
    public List<T> obtenerElementos(){
        return elementos;
    }

    @Override
    public String toString(){
        return "ClasesGenericas " + " Elementos: " + elementos;
    }

    
}

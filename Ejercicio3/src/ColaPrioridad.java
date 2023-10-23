import java.util.Comparator;
import java.util.PriorityQueue;

public abstract class ColaPrioridad<E> {
    private PriorityQueue<E> cola;
    public ColaPrioridad(Comparator<E> comparador){
        cola = new PriorityQueue<E>(comparador);
    }
    public void insertar(E elem){
        cola.offer(elem);
    }
    public E extraer(){
        return cola.poll();
    }
    public boolean estaVacia(){
        return cola.isEmpty();
    }
}

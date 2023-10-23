import java.util.Comparator;
import java.util.Vector;

public class ComparadorCompuesto implements Comparator<Socio> {
    private Vector<Comparator<Socio>> comparadores = new Vector<>();

    public void addComparador (Comparator<Socio> comparador){
        comparadores.add(comparador);
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        for(Comparator<Socio> comparador: comparadores){
            int res = comparador.compare(o1, o2);
            if (res != 0)
                return res;
        }
        return 0;
    }
}

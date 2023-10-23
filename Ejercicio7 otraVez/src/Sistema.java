import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sistema {
    private List<Socio> socios;

    public Sistema() {
        this.socios = new ArrayList<>();
    }
    public void addSocio(Socio socio){
        socios.add(socio);
    }
    public List<Socio> getSocios() {
        return socios;
    }

    public List<Socio> getSociosMenoresEdad(){
        List<Socio> result = new ArrayList<>();
        for (Socio s: socios){
            if (s.getEdad()<18)
                result.add(s);
        }

        Comparator<Socio> compEdad = new ComparadorAscEdad();
        Collections.sort(result, compEdad);
        return result;
    }

    public List<Socio> getSociosCuotaImpaga(){
        List<Socio> result = new ArrayList<>();
        for (Socio s: socios){
            if (!s.isUltCuotaPaga()){
                result.add(s);
            }
        }

        Comparator<Socio> compApellido = new ComparadorAscApellido();
        Comparator<Socio> compNombre = new ComparadorAscNombre();
        ComparadorCompuesto comp = new ComparadorCompuesto();
        comp.addComparador(compApellido);
        comp.addComparador(compNombre);
        Collections.sort(result, comp);

        return result;
    }

    public List<Socio> getSociosAlquilerCancha(int canchaID){
        List<Socio> result = new ArrayList<>();
        for (Socio s: socios){
            if (s.contarAlquileresCancha(canchaID)>0){
                result.add(s);
            }
        }
        Comparator<Socio> comp = new ComparadorAscAlquilerCancha();
        Collections.sort(result, comp);
        return result;
    }
    public List<Socio> getSociosPagoMayor(int pago){
        List<Socio> result = new ArrayList<>();
        for (Socio s: socios){
            if (s.pagoAlquilerMayor(pago)){
                result.add(s);
            }
        }

        List<Socio> morosos = new ArrayList<>();
        for (int i = 0; i < result.size(); i++){
            if (!result.get(i).isUltCuotaPaga()){
                Socio aux = result.remove(i);
                morosos.add(aux);
            }
        }

        Comparator<Socio> compApellido = new ComparadorAscApellido();
        Comparator<Socio> compNombre = new ComparadorAscNombre();
        ComparadorCompuesto comparadorCompuesto = new ComparadorCompuesto();
        comparadorCompuesto.addComparador(compApellido);
        comparadorCompuesto.addComparador(compNombre);
        Collections.sort(result, comparadorCompuesto);
        Collections.sort(morosos, comparadorCompuesto);
        result.addAll(morosos);
        return result;
    }
}

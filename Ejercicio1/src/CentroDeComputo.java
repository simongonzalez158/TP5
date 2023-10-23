import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CentroDeComputo {
    private List<Proceso> procesos;
    private List<Computadora> computadoras;
    public CentroDeComputo(){
        this.procesos = new ArrayList<Proceso>();
        this.computadoras = new ArrayList<Computadora>();
    }
    public void addProceso(Proceso P){
        procesos.add(P);
        if (procesos.size()>1) {
            procesos.sort((p1, p2) -> Integer.compare(p2.getReqMemoria(), p1.getReqMemoria()));
        }
    }
    public void addComputadora(Computadora C){
        computadoras.add(C);
        if (computadoras.size()>1){
            computadoras.sort((c1, c2) -> Integer.compare(c2.getRapidez(), c1.getRapidez()));
        }
    }

    public void asignarProcesoAComputadora(){
        int indiceComputadora = 0;
        int indiceProceso = 0;
        while (indiceProceso < procesos.size() && indiceComputadora < computadoras.size()){
            Computadora computadoraActual = computadoras.get(indiceComputadora);
            Proceso procesoActual = procesos.get(indiceProceso);
            if (computadoraActual.getRapidez() >= procesoActual.getReqMemoria()){
                if (computadoraActual.getProcesoAsignado() == null) {
                    computadoras.remove(indiceComputadora);
                    procesos.remove(indiceProceso);
                    computadoraActual.setProcesoAsignado(procesoActual);
                    addComputadora(computadoraActual);
                } else {
                    indiceComputadora++;
                }
            } else {
                indiceProceso++;
            }
        }
    }

    @Override
    public String toString() {
        return "CentroDeComputo{" +
                "procesos=" + procesos +
                "\n computadoras=" + computadoras +
                '}';
    }
}

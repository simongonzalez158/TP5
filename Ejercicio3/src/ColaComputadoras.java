public class ColaComputadoras extends ColaPrioridad<Computadora>{
    public ColaComputadoras(){
        super((c1, c2) -> c2.getRapidez() - c1.getRapidez());
    }

    public void asignarProceso(Proceso p){
        if (!estaVacia()) {
            Computadora compu = extraer();
            compu.setProcesoAsignado(p);
            insertar(compu);
        }
    }
}

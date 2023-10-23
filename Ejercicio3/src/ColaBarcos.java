public class ColaBarcos extends ColaPrioridad<Barco>{
    public ColaBarcos(){
        super((b1, b2) -> b2.getCapacidad() - b1.getCapacidad());
    }
    public void cargarBarco(Camion camion){
        if (!estaVacia()) {
            Barco barco = extraer();
            barco.setCapacidad(barco.getCapacidad() - camion.getDiasCargado());
            insertar(barco);
        }
    }
}

public class FiltroEspacio extends Filtro{
    private int espacio;
    public FiltroEspacio(int espacio){
        this.espacio = espacio;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getEspacio()>this.espacio;
    }
}

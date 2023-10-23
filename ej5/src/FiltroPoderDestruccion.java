public class FiltroPoderDestruccion extends Filtro{
    private int poderDestruccion;
    public FiltroPoderDestruccion(int poderDestruccion){
        this.poderDestruccion = poderDestruccion;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getPoderDestruccion()>this.poderDestruccion;
    }
}

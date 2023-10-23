public class FiltroFortaleza extends Filtro{
    private int fortaleza;
    public FiltroFortaleza(int fortaleza){
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getFortaleza() > this.fortaleza;
    }
}

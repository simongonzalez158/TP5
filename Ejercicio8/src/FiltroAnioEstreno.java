public class FiltroAnioEstreno extends Filtro{
    private int anioEstreno;
    public FiltroAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getAnoEstreno()<anioEstreno;
    }
    // si pelicula es menor a un anio especifico
}

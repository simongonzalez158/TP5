public class FiltroTitulo extends Filtro{
    private String palabra;
    public FiltroTitulo(String p){
        this.palabra = p;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getTitulo().contains(palabra);
    }
}

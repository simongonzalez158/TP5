public class FiltroDirector extends Filtro{
    private String director;

    public FiltroDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getDirector().equals(director);
    }
}

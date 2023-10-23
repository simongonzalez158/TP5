public class FiltroGenero extends Filtro{
    private String genero;
    public FiltroGenero(String genero){
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getGeneros().contains(genero);
    }
}

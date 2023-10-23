public class FiltroDuracionMenor extends Filtro{
    private int duracion;

    public FiltroDuracionMenor(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getDuracion()<duracion;
    }
    // devuelve si es menor a cierta duracion
}

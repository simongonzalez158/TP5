public class Not extends Filtro{
    private Filtro filtro;
    public Not (Filtro filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return !this.filtro.cumple(pelicula);
    }
}

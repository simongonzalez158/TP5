public class FiltroActor extends Filtro{
    private String actor;

    public FiltroActor(String actor) {
        this.actor = actor;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getActores().contains(actor);
    }
}

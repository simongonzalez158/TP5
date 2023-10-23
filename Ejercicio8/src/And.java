public class And extends Filtro{
    private Filtro f1, f2;
    public And (Filtro f1, Filtro f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return this.f1.cumple(pelicula) && this.f2.cumple(pelicula);
    }
}
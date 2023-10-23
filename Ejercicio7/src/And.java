public class And extends Filtro{
    private Filtro f1;
    private Filtro f2;
    public And(Filtro f1, Filtro f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Socio socio) {
        return this.f1.cumple(socio) && this.f2.cumple(socio);
    }
}

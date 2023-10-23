public class Not extends Filtro{
    private Filtro filtro1, filtro2;
    public Not(Filtro filtro1, Filtro filtro2){
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean cumple(Ficha f) {
        return !this.filtro1.cumple(f);
    }
}

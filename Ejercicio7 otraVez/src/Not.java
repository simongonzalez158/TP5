public class Not extends Filtro{
    private Filtro filtro;
    public Not (Filtro filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Socio socio) {
        return !this.filtro.cumple(socio);
    }
}

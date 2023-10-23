public class FiltroCancha extends Filtro{
    private int idCancha;
    public FiltroCancha (int idCancha){
        this.idCancha = idCancha;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.contarAlquileresCancha(idCancha)>0;
    }
}

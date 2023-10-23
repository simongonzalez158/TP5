public class FiltroAlquilerCancha extends Filtro{
    private int id;
    public FiltroAlquilerCancha (int id){
        this.id = id;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.getAlquileresHechos().contains(id);
    }
}

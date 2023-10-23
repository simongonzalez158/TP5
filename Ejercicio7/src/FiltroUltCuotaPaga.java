public class FiltroUltCuotaPaga extends Filtro{
    @Override
    public boolean cumple(Socio socio) {
        return socio.isUltCuotaPaga();
    }
}

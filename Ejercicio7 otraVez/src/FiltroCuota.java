public class FiltroCuota extends Filtro{
    private boolean cuota;
    public FiltroCuota(boolean cuota){
        this.cuota = cuota;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.isUltCuotaPaga() == cuota;
    }
    /*
    @Override
    public boolean cumple(Socio socio) {
        return !socio.isUltCuotaPaga();
    }
     */
    // retorna true si no la pago, false si la pago
}

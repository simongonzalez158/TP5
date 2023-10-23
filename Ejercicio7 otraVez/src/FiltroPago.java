public class FiltroPago extends Filtro{
    private float pago;
    public FiltroPago(float pago){
        this.pago = pago;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.pagoAlquilerMayor(pago);
    }
}

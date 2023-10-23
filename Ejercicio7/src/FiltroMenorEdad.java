public class FiltroMenorEdad extends Filtro{
    @Override
    public boolean cumple(Socio socio) {
        return socio.getEdad()<18;
    }
}

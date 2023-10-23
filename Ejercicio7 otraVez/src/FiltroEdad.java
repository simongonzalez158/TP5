public class FiltroEdad extends Filtro{
    private int edad;
    public FiltroEdad(int edad){
        this.edad = edad;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.getEdad() < edad;
    }
}

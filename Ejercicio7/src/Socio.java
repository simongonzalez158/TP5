import java.util.List;

public class Socio {
    private String nombreApellido;
    private int edad;
    private boolean ultCuotaPaga;
    private List<CanchaAlquiler> alquileresHechos;
    public Socio(String nombreApellido, int edad, boolean ultCuotaPaga){
        this.nombreApellido = nombreApellido;
        this.edad = edad;
        this.ultCuotaPaga = ultCuotaPaga;
    }
    public void addAlquiler(CanchaAlquiler C){
        alquileresHechos.add((C));
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isUltCuotaPaga() {
        return ultCuotaPaga;
    }

    public List<CanchaAlquiler> getAlquileresHechos() {
        return alquileresHechos;
    }
}

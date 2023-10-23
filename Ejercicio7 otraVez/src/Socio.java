import java.util.ArrayList;
import java.util.List;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean ultCuotaPaga;
    private List<Alquiler> alquileresHechos;
    public Socio(String nombre, String apellido, int edad, boolean ultCuotaPaga){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ultCuotaPaga = ultCuotaPaga;
        this.alquileresHechos = new ArrayList<>();
    }
    public void addAlquiler(Alquiler C){
        alquileresHechos.add((C));
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isUltCuotaPaga() {
        return ultCuotaPaga;
    }

    public List<Alquiler> getAlquileresHechos() {
        return alquileresHechos;
    }
    public int contarAlquileresCancha(int canchaID){
        int cantVecesAlquilada=0;
        for(Alquiler alquiler: alquileresHechos){
            if (alquiler.getId() == canchaID){
                cantVecesAlquilada++;
            }
        }
        return cantVecesAlquilada;
    }
    public boolean pagoAlquilerMayor(float pago){
        for (Alquiler alquiler: alquileresHechos){
            if (alquiler.getMontoPago()>pago)
                return true;
        }
        return false;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<String> preferenciasClasificacion;
    private List<String> preferenciasSobre;
    public Usuario(String n){
        this.nombre = n;
        this.preferenciasClasificacion = new ArrayList<>();
        this.preferenciasSobre = new ArrayList<>();
    }
    public void addPrefClasif(String clasificacion){
        preferenciasClasificacion.add(clasificacion);
    }
    public void addPrefSobre(String sobre){
        preferenciasSobre.add(sobre);
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getPreferenciasClasificacion() {
        return preferenciasClasificacion;
    }

    public List<String> getPreferenciasSobre() {
        return preferenciasSobre;
    }
}

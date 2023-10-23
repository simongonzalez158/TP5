import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Socio> socios;
    private List<Cancha> canchas;
    public Sistema(){
        this.socios = new ArrayList<>();
        this.canchas = new ArrayList<>();
    }
    public void addSocio(Socio socio){
        socios.add(socio);
    }
    public void addCancha(Cancha cancha){
        canchas.add(cancha);
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public List<Cancha> getCanchas() {
        return canchas;
    }
}

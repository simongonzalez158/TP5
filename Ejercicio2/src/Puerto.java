import java.util.*;

public class Puerto {
    private List<Barco> barcos;
    private List<Camion> camiones;
    public Puerto(){
        this.barcos = new ArrayList<>();
        this.camiones = new ArrayList<>();
    }
    public void addCamion(Camion c){
        camiones.add(c);
        Collections.sort(camiones);
    }
    public void addBarco(Barco b){
        barcos.add(b);
        Collections.sort(barcos);
    }
    public void cargarBarcoDescargarCamion(){
        while(!camiones.isEmpty() && !barcos.isEmpty()) {
            Camion camion = camiones.remove(0);
            Barco barco = barcos.remove(0);
            System.out.println("Se carga el barco: " + barco + " con el camion " + camion);
        }
    }

    @Override
    public String toString() {
        return "Puerto{" +
                "barcos=" + barcos +
                ", camiones=" + camiones +
                '}';
    }
}

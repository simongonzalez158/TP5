public class Proceso implements Comparable<Proceso>{
    private String nombre;
    private int reqMemoria;
    public Proceso (String nombre, int reqMemoria){
        this.nombre = nombre;
        this.reqMemoria = reqMemoria;
    }

    public int getReqMemoria() {
        return reqMemoria;
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", reqMemoria=" + reqMemoria +
                '}';
    }

    public int compareTo(Proceso otroProceso){
        return otroProceso.getReqMemoria() - this.getReqMemoria();
    }
}
public class Barco implements Comparable<Barco>{
    private int capacidad;
    public Barco (int capacidad){
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "capacidad=" + capacidad +
                '}';
    }

    public int compareTo(Barco otroBarco){
        //return Integer.compare(getCapacidad(), otroBarco.getCapacidad());
        return otroBarco.getCapacidad() - this.getCapacidad();
    }
}
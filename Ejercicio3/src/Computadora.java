public class Computadora implements Comparable<Computadora>{
    private int rapidez;
    private Proceso procesoAsignado; // la computadora tiene un proceso
    public Computadora(int rapidez){
        this.rapidez = rapidez;
    }

    public int getRapidez() {
        return rapidez;
    }

    public Proceso getProcesoAsignado() {
        return procesoAsignado;
    }

    public void setProcesoAsignado(Proceso procesoAsignado) {
        this.procesoAsignado = procesoAsignado;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "rapidez=" + rapidez +
                ", procesoAsignado=" + procesoAsignado +
                '}';
    }

    @Override
    public int compareTo(Computadora otraComputadora) {
        return otraComputadora.getRapidez() - this.getRapidez();
    }
}
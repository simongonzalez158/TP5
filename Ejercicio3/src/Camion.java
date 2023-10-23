public class Camion implements Comparable<Camion>{
    private int diasCargado;
    public Camion (int diasCargado){
        this.diasCargado = diasCargado;
    }

    public int getDiasCargado() {
        return diasCargado;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "diasCargado=" + diasCargado +
                '}';
    }

    @Override
    public int compareTo(Camion otroCamion) {
        //return Integer.compare(getDiasCargado(), otroCamion.getDiasCargado());
        return otroCamion.getDiasCargado() - this.getDiasCargado();
    }
}
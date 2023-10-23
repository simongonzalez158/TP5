public class Ficha {
    private int fortaleza;
    private int espacio;
    private int poderDestruccion;
    public Ficha(int fortaleza, int espacio, int poderDestruccion){
        this.fortaleza = fortaleza;
        this.espacio = espacio;
        this.poderDestruccion = poderDestruccion;
    }

    public int getFortaleza() {
        return fortaleza;
    }
    public int getEspacio() {
        return espacio;
    }
    public int getPoderDestruccion() {
        return poderDestruccion;
    }
}

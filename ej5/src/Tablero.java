import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private int puntajeRequerido;
    private int nivel;
    private List<Ficha> fichas;
    private int dificultad;
    public Tablero(int puntajeRequerido, int nivel){
        this.puntajeRequerido = puntajeRequerido;
        this.nivel = nivel;
        this.fichas = new ArrayList<>();
        this.dificultad = calcularDificultad();
    }
    private int calcularDificultad(){
        int sumaFortaleza = 0, sumaPoder = 0;
        for (Ficha f: fichas){
            sumaPoder += f.getFortaleza();
            sumaFortaleza += f.getPoderDestruccion();
        }
        return sumaFortaleza/sumaPoder;
    }
    public List<Ficha> fichasPoder(int n){
        List<Ficha> result = new ArrayList<>();
        for (Ficha f: fichas){
            if (f.getPoderDestruccion()>n){
                result.add(f);
            }
        }
        return result;
    }
    public List<Ficha> fichasOcupan(int n){
        List<Ficha> result = new ArrayList<>();
        for (Ficha f: fichas){
            if (f.getEspacio()>n){
                result.add(f);
            }
        }
        return result;
    }
    public List<Ficha> fichasFortaleza(int n){
        List<Ficha> result = new ArrayList<>();
        for (Ficha f: fichas){
            if (f.getFortaleza()>n){
                result.add(f);
            }
        }
        return result;
    }
    public List<Ficha> buscarFicha(Filtro filtro){
        List<Ficha> fichasQueCumplen = new ArrayList<>();
        for (Ficha ficha: fichas){
            if (filtro.cumple(ficha)){
                fichasQueCumplen.add(ficha);
            }
        }
        return fichasQueCumplen;
    }
}

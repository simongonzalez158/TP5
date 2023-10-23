import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    List<Pelicula> peliculas;
    public Plataforma(){
        this.peliculas = new ArrayList<>();
    }
    public void addPelicula(Pelicula p){
        peliculas.add(p);
    }
    public ArrayList<Pelicula> buscarPelicula(Filtro buscadorPelicula) {
        ArrayList<Pelicula> peliculasPorCondicion = new ArrayList<>();

        for (Pelicula p:peliculas) {
            if (buscadorPelicula.cumple(p)){
                peliculasPorCondicion.add(p);
            }
        }
        return peliculasPorCondicion;
    }
}

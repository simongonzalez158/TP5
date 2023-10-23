import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private List<String> generos;
    private String director;
    private List<String> actores;
    private int anoEstreno;
    private int duracion;
    private int edadMinima;

    public Pelicula(String titulo, String sinopsis, String director, int anoEstreno, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.generos = new ArrayList<>();
        this.director = director;
        this.actores = new ArrayList<>();
        this.anoEstreno = anoEstreno;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public List<String> getGeneros() {
        return generos;
    }
    public String getDirector() {
        return director;
    }
    public List<String> getActores() {
        return actores;
    }
    public int getAnoEstreno() {
        return anoEstreno;
    }
    public int getDuracion() {
        return duracion;
    }
    public int getEdadMinima() {
        return edadMinima;
    }
}

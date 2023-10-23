import java.util.ArrayList;
import java.util.List;

public class Noticia {
    private String titulo;
    private String clasificacion;
    private CuerpoNoticia cuerpo;

    public Noticia(String titulo, String clasificacion, CuerpoNoticia cuerpo){
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.cuerpo = cuerpo;

    }
    public String getTitulo() {
        return titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public CuerpoNoticia getCuerpo() {
        return cuerpo;
    }
}

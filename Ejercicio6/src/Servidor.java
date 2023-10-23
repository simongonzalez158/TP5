import java.util.ArrayList;
import java.util.List;

public class Servidor {
    private List<Noticia> noticias;
    private List<Usuario> suscripciones;
    public Servidor(){
        this.noticias = new ArrayList<>();
        this.suscripciones = new ArrayList<>();
    }
    public void addNoticia(Noticia n){
        noticias.add(n);
        remitirNoticia(n); // ver si algun usuario tiene preferencia la clasificacion de la noticia y de lo que habla la noticia
    }
    public void addSuscripcion(Usuario u){
        suscripciones.add(u);
    }
    public List<Usuario> remitirNoticia(Noticia n){
        List<Usuario> result = new ArrayList<>();
        for (Usuario usuario: suscripciones){
            //Filtro f1 = new FiltroClasificacion(n.getClasificacion());
            //Filtro f2 = new FiltroTitulo(n.getTitulo());
            //Filtro and = new And(f1, f2);
            //if (and.cumple(n)){
            if (usuario.getPreferenciasClasificacion().contains(n.getClasificacion()) && usuario.getPreferenciasSobre().contains(n.getTitulo())) {
                result.add(usuario);
            }
        }
        return result;
    }
}

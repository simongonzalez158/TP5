public class FiltroCuerpoNoVacio extends Filtro{
    @Override
    public boolean cumple(Noticia noticia) {
        return !noticia.getCuerpo().getTexto().isEmpty();
    }
    // retorna true si no esta vacio, retorna false si esta vacio
}

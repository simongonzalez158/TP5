public class FiltroCuerpo extends Filtro{
    private String palabra;
    public FiltroCuerpo(String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getCuerpo().getTexto().contains(palabra);
    }
}

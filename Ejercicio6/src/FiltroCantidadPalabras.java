public class FiltroCantidadPalabras extends Filtro{
    private int numPalabras;
    public FiltroCantidadPalabras(int numPalabras){
        this.numPalabras = numPalabras;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        String[] palabras = noticia.getCuerpo().getTexto().split(" ");
        return palabras.length<numPalabras;
    }
}

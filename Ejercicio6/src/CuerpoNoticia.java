public class CuerpoNoticia {
    private boolean tieneImagenes;
    private boolean tieneVideos;
    private String texto;

    public CuerpoNoticia(boolean imagenes, boolean videos, String texto) {
        this.tieneImagenes = imagenes;
        this.tieneVideos = videos;
        this.texto = texto;
    }

    public boolean getImagenes() {
        return tieneImagenes;
    }

    public boolean getVideos() {
        return tieneVideos;
    }

    public String getTexto() {
        return texto;
    }
}

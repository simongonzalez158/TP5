public class FiltroClasificacion extends Filtro{
    private String clasificacion;
    public FiltroClasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return this.clasificacion.equals(noticia.getClasificacion());
    }
}

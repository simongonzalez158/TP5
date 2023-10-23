import java.util.Date;

public class CanchaAlquiler extends Cancha{
    private Date fecha;
    private float montoPago;
    public CanchaAlquiler(int id, Date fecha, float montoPago){
        super(id);
        this.fecha = fecha;
        this.montoPago = montoPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getMontoPago() {
        return montoPago;
    }
}

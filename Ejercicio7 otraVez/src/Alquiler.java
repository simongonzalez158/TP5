import java.util.Date;

public class Alquiler {
    private int id;
    private Date fecha;
    private float montoPago;
    public Alquiler(int id, Date fecha, float montoPago){
        this.id = id;
        this.fecha = fecha;
        this.montoPago = montoPago;
    }

    public Date getFecha() {
        return fecha;
    }
    public float getMontoPago() {
        return montoPago;
    }
    public int getId() {
        return id;
    }
}

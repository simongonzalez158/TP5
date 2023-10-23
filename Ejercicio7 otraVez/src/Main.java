import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un sistema de control del club
        Sistema sistema = new Sistema();

        // Crear algunos socios
        Socio socio1 = new Socio("Juan", "Pérez", 20, true);
        Socio socio2 = new Socio("María", "Gómez", 16, false);
        Socio socio3 = new Socio("Luis", "Martínez", 25, true);
        Socio socio4 = new Socio("Ana", "Rodríguez", 18, true);

        // Registrar alquileres
        socio1.addAlquiler(new Alquiler(1, new Date(), 600));
        socio2.addAlquiler(new Alquiler(2, new Date(), 350));
        socio2.addAlquiler(new Alquiler(3, new Date(), 450));
        socio3.addAlquiler(new Alquiler(1, new Date(), 550));
        socio3.addAlquiler(new Alquiler(2, new Date(), 400));
        socio4.addAlquiler(new Alquiler(3, new Date(), 300));

        // Agregar socios al sistema
        sistema.addSocio(socio1);
        sistema.addSocio(socio2);
        sistema.addSocio(socio3);
        sistema.addSocio(socio4);

        // Consultas
        System.out.println("Socios con cuota impaga:");
        List<Socio> cuotaImpaga = sistema.getSociosCuotaImpaga();
        for (Socio s : cuotaImpaga) {
            System.out.println(s.getApellido() + ", " + s.getNombre());
        }

        System.out.println("\nSocios menores de edad:");
        List<Socio> menoresEdad = sistema.getSociosMenoresEdad();
        for (Socio s : menoresEdad) {
            System.out.println(s.getApellido() + ", " + s.getNombre() + " (Edad: " + s.getEdad() + ")");
        }

        System.out.println("\nSocios que alquilaron la cancha N°1:");
        List<Socio> alquilaronCancha1 = sistema.getSociosAlquilerCancha(1);
        for (Socio s : alquilaronCancha1) {
            System.out.println(s.getApellido() + ", " + s.getNombre());
        }

        System.out.println("\nSocios que pagaron más de $500:");
        List<Socio> pagoMayor500 = sistema.getSociosPagoMayor(500);
        for (Socio s : pagoMayor500) {
            System.out.println(s.getApellido() + ", " + s.getNombre());
        }
    }
}
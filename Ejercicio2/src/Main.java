// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Camion C1 = new Camion(10);
        Camion C2 = new Camion(15);
        Camion C3 = new Camion(3);

        Barco B1 = new Barco(25);
        Barco B2 = new Barco(12);
        Barco B3 = new Barco(30);

        Puerto P1 = new Puerto();
        P1.addCamion(C1);
        P1.addCamion(C2);
        P1.addCamion(C3);
        P1.addBarco(B1);
        P1.addBarco(B2);
        P1.addBarco(B3);

        // System.out.println(P1);
        P1.cargarBarcoDescargarCamion();
    }
}
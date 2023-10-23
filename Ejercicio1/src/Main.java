// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CentroDeComputo centro = new CentroDeComputo();

        Computadora C1 = new Computadora(150);
        Computadora C2 = new Computadora(130);
        Computadora C3 = new Computadora(200);
        Computadora C4 = new Computadora(100);

        Proceso P1 = new Proceso("juego", 100);
        Proceso P2 = new Proceso("editor", 200);
        Proceso P3 = new Proceso("navegador", 50);
        Proceso P4 = new Proceso("juego AAA", 300);

        centro.addComputadora(C1);
        centro.addComputadora(C2);
        centro.addComputadora(C3);
        centro.addComputadora(C4);

        centro.addProceso(P1);
        centro.addProceso(P2);
        centro.addProceso(P3);
        centro.addProceso(P4);

        System.out.println(centro);
        centro.asignarProcesoAComputadora();
        System.out.println("\n");
        System.out.println(centro);
    }
}
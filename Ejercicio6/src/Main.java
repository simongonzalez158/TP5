// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crear un servidor de noticias
        Servidor servidor = new Servidor();

        // Crear algunas noticias y agregarlas al servidor
        Noticia noticia1 = new Noticia("Noticia 1", "Deportes", new CuerpoNoticia(false, true, "Texto de deportes"));
        Noticia noticia2 = new Noticia("Noticia 2", "Política", new CuerpoNoticia(true, false, "Texto de política"));
        servidor.addNoticia(noticia1);
        servidor.addNoticia(noticia2);

        // Crear usuarios y agregar sus preferencias
        Usuario usuario1 = new Usuario("Usuario1");
        usuario1.addPrefClasif("Deportes");
        usuario1.addPrefSobre("Noticia 1");

        Usuario usuario2 = new Usuario("Usuario2");
        usuario2.addPrefClasif("Política");
        usuario2.addPrefSobre("Noticia 2");

        servidor.addSuscripcion(usuario1);
        servidor.addSuscripcion(usuario2);

        // Imprimir noticias que coinciden con las preferencias de los usuarios
        for (Usuario usuario : servidor.remitirNoticia(noticia1)) {
            System.out.println("Noticia 1 enviada a " + usuario.getNombre());
        }
        for (Usuario usuario : servidor.remitirNoticia(noticia2)) {
            System.out.println("Noticia 2 enviada a " + usuario.getNombre());
        }
    }
}
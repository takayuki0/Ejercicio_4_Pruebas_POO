import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Catalogo miCatalogo = new Catalogo();
    miCatalogo.llenarCatalogo();
    miCatalogo.mostrarCatalogo();
    miCatalogo.buscarTitulo("Braindead");
    miCatalogo.eliminarProducto(4);
    miCatalogo.mostrarCatalogo();
    miCatalogo.buscarTitulo("Braindead");


    }
}
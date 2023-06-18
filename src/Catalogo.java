import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Producto> productos;

    public Catalogo() {
        productos = new ArrayList();
    }


    public void llenarCatalogo() {
        Persona autorLibro1 = new Persona("Sun", "Tzu");
        Persona autorLibro2 = new Persona("Robert", "Kiyosaki");
        Persona autorLibro3 = new Persona("Robin", "S. Sharma");

        Persona protagonistaPeli1 = new Persona("Timothy", "Balme");
        Persona directorPeli1 = new Persona("Peter", "Jackson");
        Persona protagonistaPeli2 = new Persona("Elijah", "Wood");
        Persona directorPeli2 = new Persona("Peter", "Jackson");
        Persona protagonistaPeli3 = new Persona("Tom", "Hanks");
        Persona directorPeli3 = new Persona("Robert", "Zemeckis");

        productos.add(0, new Libro(autorLibro1, "El Arte de la Gerra", 25));
        productos.add(1, new Libro(autorLibro2, "Padre Rico Padre Pobre", 30));
        productos.add(2, new Libro(autorLibro3, "El Club de las 5 de la Mañana", 40));
        productos.add(3, new Pelicula("Braindead", protagonistaPeli1, directorPeli1, 45));
        productos.add(4, new Pelicula("The Lord of the Ring", protagonistaPeli2, directorPeli2, 60));
        productos.add(5, new Pelicula("Forrest Gump", protagonistaPeli3, directorPeli3, 65));
    }

    public void mostrarCatalogo() {
        System.out.println(productos);
    }

    //A continuación esta clase deberá tener los siguientes métodos
    //Agrega el Producto p al catálogo.
    public void agregar(Producto p) {
    }

    //Elimina el producto cuyo identificador único es id.
    public void eliminarProducto(Integer id) {
        productos.remove(id - 1);
    }

    //Devuelve, contenidos en un Catalogo, a todos los Productos cuyo título es titulo.
    public void buscarTitulo(String titulo) {
        int contador = 0;
        for (Producto producto : productos) {
            if (producto.getTituloProducto().equals(titulo)) {
                System.out.println("Titulo Encontrado:\n" + producto.toString());
            } else {
                contador++;
            }
        }
        if (contador == productos.size()) {
            System.out.println("El título: " + titulo + " no se encuentra disponible");
        }
    }

    //Devuelve, contenidos en un Catalogo, a todos los Productos cuyo autor, director o protagonista, según sea el caso, es p.
    public void buscarPersona(Persona p) {

    }


}

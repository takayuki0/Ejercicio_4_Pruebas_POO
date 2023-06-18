public class Libro extends Producto {
    private Persona autorLibro;

    public Libro(Persona autorLibro, String tituloProducto, float precioProducto) {
        super(tituloProducto, precioProducto);
        this.autorLibro = autorLibro;
    }

    public Persona getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(Persona autorLibro) {
        this.autorLibro = autorLibro;
    }

    @Override
    public String toString() {
        return "\nLibro: " + getTituloProducto() +
                "\nLibro ID: " + getProductoId() +
                "\nAutor: " + autorLibro.getNombre() + " " + autorLibro.getApellido() +
                "\nPrecio €: " + getPrecioProducto() +
                "\n__________________________________________";
    }
}

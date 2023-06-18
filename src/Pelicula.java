public class Pelicula extends Producto {
    private Persona protagonistaPelicula;
    private Persona directorPelicula;

    public Pelicula(String tituloProducto, Persona protagonistaPelicula, Persona directorPelicula, float precioProducto) {
        super(tituloProducto, precioProducto);
        this.protagonistaPelicula = protagonistaPelicula;
        this.directorPelicula = directorPelicula;

    }


    public Persona getProtagonistaPelicula() {
        return protagonistaPelicula;
    }

    public void setProtagonistaPelicula(Persona protagonistaPelicula) {
        this.protagonistaPelicula = protagonistaPelicula;
    }

    public Persona getDirectorPelicula() {
        return directorPelicula;
    }

    public void setDirectorPelicula(Persona directorPelicula) {
        this.directorPelicula = directorPelicula;
    }


    @Override
    public String toString() {
        return "\nPelícula: " + getTituloProducto() +
                "\nPelícula ID: " + getProductoId() +
                "\nProtagonista: " + protagonistaPelicula.getNombre() + " " + protagonistaPelicula.getApellido() +
                "\nDirector: " + directorPelicula.getNombre() + " " + directorPelicula.getApellido() +
                "\nPrecio €: " + getPrecioProducto() +
                "\n__________________________________________";
    }
}

package libros;
class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;
    private String isbn;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion, String genero, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.isbn = isbn;
    }

    // Métodos get
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public String getIsbn() {
        return isbn;
    }

    // Métodos set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Método toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", genero='" + genero + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}




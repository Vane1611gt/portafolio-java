package libros;
public class Biblioteca {
    public static void main(String[] args) {
        Libro[] libros = new Libro[10];

        libros[0] = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico", "978-0307474728");
        libros[1] = new Libro("1984", "George Orwell", 1949, "Distopía", "978-0451524935");
        libros[2] = new Libro("El nombre del viento", "Patrick Rothfuss", 2007, "Fantasía", "978-8401337208");
        libros[3] = new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001, "Misterio", "978-8408172178");
        libros[4] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Novela", "978-0060934347");
        libros[5] = new Libro("Orgullo y prejuicio", "Jane Austen", 1813, "Romántico", "978-1503290563");
        libros[6] = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954, "Fantasía", "978-0618640157");
        libros[7] = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, "Fantasía", "978-0439708180");
        libros[8] = new Libro("Matar a un ruiseñor", "Harper Lee", 1960, "Novela", "978-0060935467");
        libros[9] = new Libro("El alquimista", "Paulo Coelho", 1988, "Aventura", "978-0061122415");

        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}




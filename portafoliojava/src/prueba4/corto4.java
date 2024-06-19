package prueba4;

// Definición de la clase Estudiante
class corto4 {
    private String nombre;
    private String correo;
    private int nota;
    private boolean activo;

    public void Estudiante( String nombre, String correo, int nota, boolean activo) {
        this.nombre = nombre;
        this.correo = correo;
        this.nota = nota;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}

// Definición de la clase Curso
class Curso {
    private String nombre;
    private String categoria;
    private String periodo;

    public Curso(String nombre, String categoria, String periodo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.periodo = periodo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPeriodo() {
        return periodo;
    }
}

// Clase principal con el método main
class Corto4 {
    public static void main(String[] args) {
        // Crear 5 estudiantes
        Estudiante[] estudiantes = {
                new Estudiante("Juan Pérez", "juan.perez@example.com", 7, true),
                new Estudiante("Ana García", "ana.garcia@example.com", 6, true),
                new Estudiante("Luis Fernández", "luis.fernandez@example.com", 7, false),
                new Estudiante("María López", "maria.lopez@example.com", 6, true),
                new Estudiante("Carlos Martínez", "carlos.martinez@example.com", 7, false)
        };

        // Crear 4 cursos
        Curso[] cursos = {
                new Curso("Matemáticas", "Ciencias", "2023-2024"),
                new Curso("Lenguaje", "Humanidades", "2023-2024"),
                new Curso("Ciencias Naturales", "Ciencias", "2023-2024"),
                new Curso("Educación Física", "Deportes", "2023-2024")
        };

        // Imprimir el listado de alumnos (nombre, correo)
        System.out.println("Listado de alumnos:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getClass() + ", Correo: " + estudiante.getClass());
        }

        // Imprimir el listado de cursos
        System.out.println("\nListado de cursos:");
        for (Curso curso : cursos) {
            System.out.println("Nombre: " + curso.getNombre() + ", Categoría: " + curso.getCategoria() + ", Periodo: " + curso.getPeriodo());
        }
    }
}

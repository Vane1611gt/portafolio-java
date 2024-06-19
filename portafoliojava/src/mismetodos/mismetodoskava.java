package colegios;

import mismetodos.Curso;
import prueba4.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class ListaAlumnos {
    public static void program() {
        System.out.println("Información de alumnos y cursos:");

        // Estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan Pérez", "juan.perez@example.com", 7, true));
        estudiantes.add(new Estudiante("Ana García", "ana.garcia@example.com", 6, true));
        estudiantes.add(new Estudiante("Luis Fernández", "luis.fernandez@example.com", 7, false));
        estudiantes.add(new Estudiante("María López", "maria.lopez@example.com", 6, true));
        estudiantes.add(new Estudiante("Carlos Martínez", "carlos.martinez@example.com", 7, false));

        // Cursos
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Matemáticas", "Ciencias", "2023-2024"));
        cursos.add(new Curso("Lenguaje", "Humanidades", "2023-2024"));
        cursos.add(new Curso("Ciencias Naturales", "Ciencias", "2023-2024"));
        cursos.add(new Curso("Educación Física", "Deportes", "2023-2024"));

        // Listado de alumnos
        System.out.println("\nListado de alumnos:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getClass() + ", Correo: " + estudiante.getCorreo());
        }

        // Listado de cursos
        System.out.println("\nListado de cursos:");
        for (Curso curso : cursos) {
            System.out.println("Nombre: " + curso.getClass() + ", Categoría: " + curso.getCategoria() + ", Periodo: " + curso.getPeriodo());
        }
    }

    public static void main(String[] args) {
        program();
    }
}

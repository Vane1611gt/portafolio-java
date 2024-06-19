package lista;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import static mismetodos.ListadodeOpciones.cargarOpciones;

public class ListaDeCompras {
    public static void programa() {
        String[] opciones = {"Lista de compras", "Salir"};
        cargarOpciones(); // Asumiendo que esta función está definida en otra parte

        Scanner scanner = new Scanner(System.in);
        System.out.print("[?] ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                crearLista();
                break;
            case 2:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void crearLista() {
        List<String> listaNombres = new ArrayList<>();
        List<Double> listaPrecios = new ArrayList<>();

        // Pedir un producto y su precio
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Producto: ");
            String nombre = scanner.nextLine(); // Consumimos la línea anterior
            System.out.println("Precio: ");
            Double precio = scanner.nextDouble(); // Consumimos el valor decimal
            scanner.nextLine(); // Limpiamos el buffer para evitar problemas con la próxima lectura

            // Agrega a la lista vacía
            listaNombres.add(nombre);
            listaPrecios.add(precio);
        }

        // Mostrar lista
        System.out.println(listaNombres + " --> " + listaPrecios);
    }

    public static void main(String[] args) {
        programa();
    }
}

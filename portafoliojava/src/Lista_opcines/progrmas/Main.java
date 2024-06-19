package Lista_opcines.progrmas; // Corrección del nombre del paquete

import calculadora1.Mate;
// Corrección del nombre de la clase
// Corrección del nombre de la clase

import java.util.Scanner;

public class Main {
    public static Lista_opcines.progrmas.ListadodeOpciones ListaOpciones;

    public static void main( String[] args) {
        // lista de opciones
        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit/Celsius", "kilometros a metros",
                "Calcular edad", "Lista de compras",
                "Opción_7", "Opción_8",
                "Opción_9", "Salir"
        };

        boolean programa = true;
        do {
            Object Banner = new Object();
            Banner.equals(); // Asegúrate de que la clase Banner esté definida o importada
            ListaOpciones.cargarOpciones(listaDeOpciones); // Asegúrate de que la clase ListaOpciones esté definida o importada

            Scanner intoOpcion = new Scanner(System.in);
            System.out.print("[?] ");
            int opcion = intoOpcion.nextInt();
            System.out.println("-----------------------------------------------------");

            // cargar opción del usuario
            switch (opcion) {
                case 1:
                    Mate.sumar(); // Asegúrate de que la clase Mate esté definida o importada
                    break;
                case 2:
                    IMC.programaIMC(); // Asegúrate de que la clase IMC esté definida o importada
                    break;
                case 3:
                    Celsius.sumar(); // Asegúrate de que la clase Celsius esté definida o importada
                    break;
                case 4:
                    Mate Metros;
                    Metros.sumar(); // Asegúrate de que la clase Metros esté definida o importada
                    break;
                case 5:
                    Mate CalcularEdad = null;
                    CalcularEdad.sumar(); // Asegúrate de que la clase CalcularEdad esté definida o importada
                    break;
                case 6:
                    ListaDeCompras.programa(); // Asegúrate de que la clase ListaDeCompras esté definida o importada
                    break;
                case 7:
                    System.out.println("opcion7");
                    break;
                case 8:
                    System.out.println("opcion8");
                    break;
                case 9:
                    System.out.println("opcion9");
                    break;
                case 10:
                    programa = false;
                    break;
            }
        } while (programa);

        intoOpcion.close(); // Cerrar el Scanner para evitar fugas de memoria
    }
}

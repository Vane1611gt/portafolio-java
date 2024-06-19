package calculadora1;

import java.util.Scanner;

public class Mate {
    private static int opcion;

    public static void ejecutarCalculadora() {
        String[] listaDeOperaciones = {
                "suma", "resta",
                "multiplicación", "división",
        };

        // Mostrar las opciones de operaciones disponibles
        for (int i = 0; i < listaDeOperaciones.length; i++) {
            System.out.printf("[%d] %s", i + 1, listaDeOperaciones[i]);

            for (int j = 0; j < (20 - listaDeOperaciones[i].length()); j++) {
                System.out.print(" ");
            }
            if ((i + 1) % 2 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Leer la opción seleccionada por el usuario
        Scanner scannerOpcion = new Scanner(System.in);
        System.out.print("[?] ");
        int opcion = scannerOpcion.nextInt();

        // Ejecución de la operación seleccionada
        switch (opcion) {
            case 1:
                Scanner entrada1 = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int numero1 = entrada1.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int numero2 = entrada1.nextInt();
                System.out.println("Resultado: " + sumar(numero1, numero2));
                break;

            case 2:
                Scanner entrada2 = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int numero3 = entrada2.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int numero4 = entrada2.nextInt();
                System.out.println("Resultado: " + restar(numero3, numero4));
                break;

            case 3:
                Scanner entrada3 = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int numero5 = entrada3.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int numero6 = entrada3.nextInt();
                System.out.println("Resultado: " + multiplicar(numero5, numero6));
                break;

            case 4:
                Scanner entrada4 = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int numero7 = entrada4.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int numero8 = entrada4.nextInt();
                System.out.println("Resultado: " + dividir(numero7, numero8));
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: División por cero.");
            return 0;
        }
        return num1 / num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        ejecutarCalculadora();


        //opciones
        switch (opcion){
            case 1:
                Mate.programa();

        }
    }

    private static void programa () {
    }
}


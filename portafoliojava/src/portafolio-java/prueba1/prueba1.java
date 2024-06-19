package prueba1;

import java.util.Scanner;

public class prueba1 {

    // Método para convertir de kilogramos a libras
    public static double kgToLb(double kg) {
        return kg * 2.20462;
    }

    // Método para convertir de litros a galones
    public static double lToGal(double l) {
        return l * 0.264172;
    }

    // Método para solicitar al usuario los datos por consola
    public static void solicitarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1. Kilogramos a Libras");
        System.out.println("2. Litros a Galones");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la cantidad en kilogramos:");
                double kg = scanner.nextDouble();
                double lb = kgToLb(kg);
                System.out.println(kg + " kilogramos equivale a " + lb + " libras.");
                break;
            case 2:
                System.out.println("Ingrese la cantidad en litros:");
                double l = scanner.nextDouble();
                double gal = lToGal(l);
                System.out.println(l + " litros equivale a " + gal + " galones.");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        solicitarDatos();
    }
}
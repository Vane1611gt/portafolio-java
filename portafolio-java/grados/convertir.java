package grados;

import java.util.Scanner;

public class convertir {


    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }


    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura seguida de la unidad (F para Fahrenheit, C para Celsius): ");
        String input = scanner.nextLine().trim().toUpperCase();

        int inputLength = input.length();

        if (inputLength > 1) {

            char unit = input.charAt(inputLength - 1);
            double value = Double.parseDouble(input.substring(0, inputLength - 1));

            if (unit == 'F') {
                double celsius = fahrenheitToCelsius(value);
                System.out.println(value + " grados Fahrenheit son " + celsius + " grados Celsius.");
            } else if (unit == 'C') {
                double fahrenheit = celsiusToFahrenheit(value);
                System.out.println(value + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
            } else {
                System.out.println("Unidad no válida. Por favor, ingrese 'F' para Fahrenheit o 'C' para Celsius.");
            }
        } else {
            System.out.println("Entrada no válida. Por favor, ingrese un valor numérico seguido de la unidad (F o C).");
        }

        scanner.close();
    }
}


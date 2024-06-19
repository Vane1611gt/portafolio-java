package covertir;

import java.util.Scanner;

public class moneda {

    public static void main(String[] args) {
        iniciarPrograma();
    }

    public static void iniciarPrograma() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Quetzales a Dolares");
            System.out.println("2. Dolares a Quetzales");
            System.out.println("3. Quetzales a Pesos Mexicanos");
            System.out.println("4. Pesos Mexicanos a Quetzales");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirQuetzalesADolares(scanner);
                    break;
                case 2:
                    convertirDolaresAQuetzales(scanner);
                    break;
                case 3:
                    convertirQuetzalesAPesosMexicanos(scanner);
                    break;
                case 4:
                    convertirPesosMexicanosAQuetzales(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }

    public static void convertirQuetzalesADolares(Scanner scanner) {
        System.out.print("Ingresa la cantidad en Quetzales: ");
        double quetzales = scanner.nextDouble();
        double tasaQuetzalDolar = 0.13;
        double dolares = quetzales * tasaQuetzalDolar;
        System.out.println(quetzales + " Quetzales son " + dolares + " Dolares.");
    }

    public static void convertirDolaresAQuetzales(Scanner scanner) {
        System.out.print("Ingresa la cantidad en Dolares: ");
        double dolares = scanner.nextDouble();
        double tasaDolarQuetzal = 7.75;
        double quetzales = dolares * tasaDolarQuetzal;
        System.out.println(dolares + " Dolares son " + quetzales + " Quetzales.");
    }

    public static void convertirQuetzalesAPesosMexicanos(Scanner scanner) {
        System.out.print("Ingresa la cantidad en Quetzales: ");
        double quetzales = scanner.nextDouble();
        double tasaQuetzalPesoMexicano = 2.59;
        double pesosMexicanos = quetzales * tasaQuetzalPesoMexicano;
        System.out.println(quetzales + " Quetzales son " + pesosMexicanos + " Pesos Mexicanos.");
    }

    public static void convertirPesosMexicanosAQuetzales(Scanner scanner) {
        System.out.print("Ingresa la cantidad en Pesos Mexicanos: ");
        double pesosMexicanos = scanner.nextDouble();
        double tasaPesoMexicanoQuetzal = 0.39;
        double quetzales = pesosMexicanos * tasaPesoMexicanoQuetzal;
        System.out.println(pesosMexicanos + " Pesos Mexicanos son " + quetzales + " Quetzales.");
    }

    public static class convertir {


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
}


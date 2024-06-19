package IMC;

import java.util.Scanner;
public class imc {
    public static double CalcularIMC(double peso, double altura){
        double IMC = peso/(altura*altura);
        return IMC;
    }

    public static void programaIMC(){

        Scanner intDato= new Scanner(System.in);
        System.out.print("Peso: ");
        double peso = intDato.nextDouble();
        System.out.print("Altura: ");
        double altura = intDato.nextDouble();

        double respuetaIMC = CalcularIMC(peso, altura);

    }
}
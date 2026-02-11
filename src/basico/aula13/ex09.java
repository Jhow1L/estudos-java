package basico.aula13;

import java.util.Scanner;

public class ex09 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.println("Digite a temperatura em Farenheit: ");
        fahrenheit = scan.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + "° Fahrenheit é igual a " + celsius + "° celsius;");
    }
}

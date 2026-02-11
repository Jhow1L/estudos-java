package basico.aula13;

import java.util.Scanner;

public class ex10 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em graus celsius: ");
        celsius = scan.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "° celsius é igual a " + fahrenheit + "° fahrenheit;");

    }
}

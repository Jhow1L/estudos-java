package loaine.cursojavabasico.aula13;

import java.util.Scanner;

public class ex03  {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número a: ");
        double n1 = scan.nextDouble();

        System.out.println("Digite o número b: ");
        double n2 = scan.nextDouble();

        System.out.println("O resultado da soma desses dois números é: " + (n1 + n2));
    }
}

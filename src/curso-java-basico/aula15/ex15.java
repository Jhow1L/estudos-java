package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex15 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double lado1, lado2, lado3, soma;

        System.out.println("Digite o primeiro lado do triângulo: ");
        lado1 = scan.nextDouble();

        System.out.println("Digite o segundo lado do triângulo: ");
        lado2 = scan.nextDouble();

        System.out.println("Digite o terceiro lado do triângulo: ");
        lado3 = scan.nextDouble();

        if ((lado1 + lado2 > lado3) || (lado1 + lado3 > lado2) || (lado2 + lado3 > lado1)) {

            System.out.print("Esses valores formam um ");

            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triâ-ngulo Equilátero");
            } else if (lado1 == lado2 || lado3 == lado2 || lado3 == lado1) {
                System.out.println("Triângulo Isósceles");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("Triângulo Escaleno");
            }
        }

        else {
            System.out.println("Esses valores não formam um triângulo");
        }
    }
}

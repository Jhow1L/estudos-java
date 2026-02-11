package loaine.cursojavabasico.aula13;

import java.util.Scanner;

public class ex06 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        double raio, area;

        System.out.println("Digite o raio do círculo: ");
        raio = scan.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é igual a: " + area);
    }
}

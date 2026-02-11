package loaine.cursojavabasico.aula13;

import java.util.Scanner;

public class ex12 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double altura, pesoIdeal;

        System.out.println("Digite sua altura em metros: ");
        altura = scan.nextDouble();

        pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal: " + pesoIdeal);
    }
}

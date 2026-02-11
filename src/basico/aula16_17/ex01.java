package cursojavabasico.aula16_17;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;

        do {
            System.out.printf("Digite uma nota de 0 a 10: ");
            nota = scan.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.printf("Nota inválida! Digite novamente.\n");
            } else {
                System.out.printf("Você digitou: %.2f", nota);
                break;
            }

        }
        while (true);
    }

}

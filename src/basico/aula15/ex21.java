package basico.aula15;

import java.util.Scanner;

public class ex21 {
    public static void main() {
        Scanner scan = new Scanner(System.in);

        int valorSaque, n1, n5, n10, n50, n100;

        System.out.print("Digite o valor que você deseja sacar: R$");
        valorSaque = scan.nextInt();

        n100 = valorSaque / 100;
        n50 = (valorSaque % 100) / 50;
        n10 = (valorSaque % 50) / 10;
        n5 = (valorSaque % 10) / 5;
        n1 = (valorSaque % 5);

        System.out.println("Nota de 100: " + n100);
        System.out.println("Nota de 50: " + n50);
        System.out.println("Nota de 10: " + n10);
        System.out.println("Nota de 5: " + n5);
        System.out.println("Nota de 1: " + n1);

    }
}

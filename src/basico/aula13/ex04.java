package cursojavabasico.aula13;

import java.util.Scanner;

public class ex04 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double n1, n2, n3, n4, media;

        System.out.println("Digite a primeira nota: ");
        n1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        n3 = scan.nextDouble();

        System.out.println("Digite a quarta nota: ");
        n4 = scan.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A sua média é: " + media);

    }
}

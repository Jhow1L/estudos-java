package basico.aula13;

import java.util.Scanner;

public class ex07 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double lado, area;

        System.out.println("Digite o lado do quadrado: ");
        lado = scan.nextDouble();

        area = Math.pow(lado, 2);

        System.out.println("A área desse quadrado = " + area);
        System.out.println("O dobro da área desse quadrado é = " + (area * 2));


    }
}

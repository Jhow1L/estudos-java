package loaine.cursojavabasico.aula13;

import java.util.Scanner;

public class ex11 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        int x, y;
        double z;

        System.out.println("Digite um número inteiro: ");
        x = scan.nextInt();

        System.out.println("Digite outro número inteiro: ");
        y = scan.nextInt();

        System.out.println("Digite um número real: ");
        z = scan.nextDouble();

        System.out.println((x * 2) + (y / 2));
        System.out.println((x * 3) + z);
        System.out.println(Math.pow(z, 3));
    }
}

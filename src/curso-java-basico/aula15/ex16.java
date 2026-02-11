package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex16 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double a, b, c, delta, raiz1, raiz2;

        System.out.println("Digite o valor de A: ");
        a = scan.nextDouble();

        if (a == 0){
            System.out.println("A equação não é de segundo grau");
            System.exit(0);
        }

        System.out.println("Digite o valor de B: ");
        b = scan.nextDouble();

        System.out.println("Digite o valor de C: ");
        c = scan.nextDouble();

        delta = (Math.pow(b, 2)) - (4 * a * c);


        if (delta < 0){
            System.out.println("A equação não possui raizes reais");
            System.exit(0);
        }

        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta == 0){
            System.out.println("A equação possui apenas uma raiz real");
            System.out.println(raiz1);
        }
        else if (delta > 0){
            System.out.println("A equação possui duas raizes reais");
            System.out.println(raiz1);
            System.out.println(raiz2);
        }
    }
}

package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex02 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double n;

        System.out.println("Digite um valor: ");
        n = scan.nextDouble();

        if (n >= 0){
            System.out.println("Valor positivo");
        }
        else {
            System.out.println("Valor negativo");
        }

    }
}

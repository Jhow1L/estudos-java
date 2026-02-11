package loaine.cursojavabasico.aula16_17;

import java.util.Scanner;

public class ex49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        double j = 1, soma = 0;

        System.out.printf("Digite o número de termos desejado: ");
        n = scan.nextInt();

        for (double i = 1; n >= i; i++){
            soma += i / j;

            j += 2;
        }

        System.out.printf("Soma: %f", soma);

    }
}

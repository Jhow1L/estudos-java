package cursojavabasico.aula16_17;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, fatorial = 1;

        System.out.printf("Digite um número inteiro: ");
        n = scan.nextInt();

        System.out.printf("%d! = ", n);

        for (int i = n; i > 0; i--){
            if (i < n){
                System.out.printf("* ");
            }

            System.out.printf("%d ", i);

            fatorial = fatorial * i;

        }

        System.out.printf("= %d", fatorial);
    }
}

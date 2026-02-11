package loaine.cursojavabasico.aula16_17;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, divisoes = 0;

        System.out.printf("Digite um número inteiro: ");
        numero = scan.nextInt();

        if(numero <= 1){
            System.out.printf("Não existem números primos.\n");
            System.exit(1);
        }

        System.out.printf("De %d a 1: \n", numero);

        for (; numero >= 2; numero--) {

            boolean teste = true;

            for (int i = 2; numero > i; i++) {
                divisoes += 1;
                if (numero % i == 0) {
                    teste = false;
                    break;
                }
            }

            if (teste){
                System.out.printf("%d é primo\n", numero);
            }

        }

        System.out.printf("Divisões necessárias para descobrir todos os primos: %d", divisoes);
    }
}

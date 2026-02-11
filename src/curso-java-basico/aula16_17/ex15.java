package loaine.cursojavabasico.aula16_17;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int anterior = 1, atual = 1, proximo, quantidade;

        while (true) {
            System.out.printf("Quantos termos de fibonacci você deseja ver? (Mínimo 2) ");
            quantidade = scan.nextInt();

            if (quantidade < 2) {
                System.out.printf("Quantidade inválida! Tente novamente...\n");
            } else {
                break;
            }
        }

        System.out.printf("%d ", anterior);
        System.out.printf("%d ", atual);

        while (quantidade > 2){
            proximo = anterior + atual;
            System.out.printf("%d ", proximo);
            anterior = atual;
            atual = proximo;
            quantidade--;
        }


    }
}

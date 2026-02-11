package basico.aula16_17;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, n2, menor, maior, soma = 0;

        System.out.printf("Digite o primeiro número: ");
        n1 = scan.nextInt();
        System.out.printf("Digite o segundo número: ");
        n2 = scan.nextInt();

        menor = Math.min(n1, n2);
        maior = Math.max(n1, n2);

        while (menor < (maior - 1)){
            menor++;
            System.out.printf("%d ", menor);
            soma += menor;
        }

        System.out.printf("\nA soma desses números é: %d", soma);

    }
}

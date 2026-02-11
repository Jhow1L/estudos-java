package cursojavabasico.aula16_17;

import java.util.Scanner;

public class ex43 {
    static void mostrarCardapio(){
        System.out.printf("\n---------  CARDAPIO  ----------\n");
        System.out.printf("100 - Cachorro Quente (R$ 1,20)\n");
        System.out.printf("101 - Bauru Simples   (R$ 1,30)\n");
        System.out.printf("102 - Bauro Com Ovo   (R$ 1,50)\n");
        System.out.printf("103 - Hambúrger       (R$ 1,20)\n");
        System.out.printf("104 - Cheeseburguer   (R$ 1,30)\n");
        System.out.printf("105 - Refrigerante    (R$ 1,00)\n");
        System.out.printf("-------------------------------\n\n");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalPagar = 0;
        int opcao;

        do {
            mostrarCardapio();

            int quantidade = 0;

            System.out.printf("Escolha uma opção: (0 para sair) ");
            opcao = scan.nextInt();

            if (opcao >= 100 && opcao <= 105){
                System.out.printf("Digite a quantidade desejada: ");
                quantidade = scan.nextInt();
            }

            switch (opcao){
                case 100: totalPagar += (1.20 * quantidade); break;
                case 101: totalPagar += (1.30 * quantidade); break;
                case 102: totalPagar += (1.50 * quantidade); break;
                case 103: totalPagar += (1.20 * quantidade); break;
                case 104: totalPagar += (1.30 * quantidade); break;
                case 105: totalPagar += (1.00 * quantidade); break;
                case 0: break;
                default:
                    System.out.printf("Opção inválida!\n");
            }

            System.out.printf("Total a pagar: R$%.2f\n", totalPagar);

        }
        while (opcao != 0);


    }
}

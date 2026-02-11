package cursojavabasico.aula16_17;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double popA = 0, popB = 0, taxCrescimentoA, taxCrescimentoB;
        int ano = 0;

        while(true){
            System.out.printf("Digite a população inicial do país A: ");
            popA = scan.nextDouble();
            System.out.printf("Digite a taxa de crescimento do país A: ");
            taxCrescimentoA = scan.nextDouble();

            System.out.printf("Digite a população inicial do país B: ");
            popB = scan.nextDouble();
            System.out.printf("Digite a taxa de crescimento do país B: ");
            taxCrescimentoB = scan.nextDouble();

            if(popA < 0 || popB < 0 || taxCrescimentoA < 0 || taxCrescimentoB < 0 || taxCrescimentoA <= taxCrescimentoB){
                System.out.printf("Erro! Aperte enter para tentar novamente...\n");
                scan.nextLine();
                scan.nextLine();
            }
            else{
                break;
            }
        }

        while (popA < popB){
            popA = (popA / 100 * taxCrescimentoA) + popA;
            popB = (popB / 100 * taxCrescimentoB) + popB;
            ano++;
        }

        System.out.printf("Quantidade de anos para o país A superar o país B: %d anos\n", ano);
        System.out.printf("População final do país A: %.0f\n", popA);
        System.out.printf("População final do país B: %.0f\n", popB);


    }
}

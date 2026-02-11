package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------");
        System.out.println("               Até 5 Kg               Acima de 5 Kg               ");
        System.out.println("Morango     R$ 2,50 por Kg           R$ 2,20 por Kg                ");
        System.out.println("Maçã        R$ 1,80 por Kg           R$ 1,50 por Kg                ");
        System.out.println("------------------------------------------------------------------\n");

        final double PRECO_MACA_ATE_5 = 1.80;
        final double PRECO_MACA_ACIMA_5 = 1.50;
        final double PRECO_MORANGO_ATE_5 = 2.50;
        final double PRECO_MORANGO_ACIMA_5 = 2.20;

        double maca, morango, valorTotal, desconto = 0;

        System.out.println("Digite quantos quilos de morango você deseja comprar: ");
        morango = scan.nextDouble();

        System.out.println("Digite quantos quilos de maça você deseja comprar: ");
        maca = scan.nextDouble();

        if (maca <= 5){
            valorTotal = maca * PRECO_MACA_ATE_5;
        }
        else{
            valorTotal = maca * PRECO_MACA_ACIMA_5;
        }

        if (morango <= 5){
            valorTotal = valorTotal + (morango * PRECO_MORANGO_ATE_5);
        }
        else{
            valorTotal = valorTotal + (morango * PRECO_MORANGO_ACIMA_5);
        }

        if ((maca + morango) > 8 || valorTotal > 25){
            desconto = valorTotal * 0.10;
        }

        valorTotal -= desconto;

        System.out.printf("Preço total: R$%.2f", valorTotal);

    }
}

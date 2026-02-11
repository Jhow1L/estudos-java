package cursojavabasico.aula13;

import java.util.Scanner;

public class ex16 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double metrosQuadrados, lata = 18, precolata = 80, litrosTinta, qtdLatas, precoTotal;

        System.out.println("Digite a area total de pintura em metros: ");
        metrosQuadrados = scan.nextDouble();

        litrosTinta = metrosQuadrados / 3;
        qtdLatas = litrosTinta / lata;
        precoTotal = qtdLatas * precolata;

        System.out.println("Quantidade de latas necessária: " + qtdLatas);
        System.out.println("Preço total: R$" + precoTotal);


    }
}

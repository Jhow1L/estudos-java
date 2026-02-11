package loaine.cursojavabasico.aula13;

import java.util.Scanner;

public class ex17 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double metrosQuadrados, lata = 18, galao = 3.6, litrosTinta, qtdLatas, qtdGalao, precoTotalL, precoTotalG;

        System.out.println("Digite a area total de pintura em metros: ");
        metrosQuadrados = scan.nextDouble();

        litrosTinta = metrosQuadrados / 6;
        qtdLatas = litrosTinta / lata;
        qtdGalao = litrosTinta / galao;

        precoTotalL = qtdLatas * 80;
        precoTotalG = qtdGalao * 25;

        System.out.println("Quantidade de latas necessárias: " + qtdLatas);
        System.out.println("Preço total: R$" + precoTotalL + "\n");

        System.out.println("Quantidade de galões necessários: " + qtdGalao);
        System.out.println("Preço total: R$" + precoTotalG);


    }
}

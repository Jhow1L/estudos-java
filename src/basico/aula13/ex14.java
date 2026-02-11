package cursojavabasico.aula13;

import java.util.Scanner;

public class ex14 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double peso, excesso = 0, multa = 0;

        System.out.println("Digite a quantidade de quilos que você pescou: ");
        peso = scan.nextDouble();

        if (peso > 50){
            excesso = peso - 50;
            multa = excesso * 4;
        }


        System.out.println("Excesso: " + excesso + "kg");
        System.out.println("Multa: R$" + multa);
    }
}

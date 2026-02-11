package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex08 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double produto1, produto2, produto3;

        System.out.print("Digite o preço do primeiro produto: R$");
        produto1 = scan.nextDouble();

        System.out.print("Digite o preço do segundo produto: R$");
        produto2 = scan.nextDouble();

        System.out.print("Digite o preço do terceiro produto: R$");
        produto3 = scan.nextDouble();

        if (produto1 <= produto2 && produto1 <= produto3){
            System.out.println("Você deve comprar o primeiro produto porque ele é o mais barato");
        }
        else if (produto2 <= produto1 && produto2 <= produto3){
            System.out.println("Você deve comprar o segundo produto porque ele é o mais barato");
        }
        else if (produto3 <= produto1 && produto3 <= produto2){
            System.out.println("Você deve comprar o terceiro produto porque ele é o mais barato");
        }
    }
}

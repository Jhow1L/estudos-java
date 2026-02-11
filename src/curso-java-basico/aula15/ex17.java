package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex17 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        int ano;

        System.out.println("Digite um ano qualquer: ");
        ano = scan.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println("Esse é um ano bissexto");
        }
        else {
            System.out.println("Não é um ano bissexto");
        }
    }
}

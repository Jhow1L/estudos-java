package cursojavabasico.aula15;

import java.util.Scanner;

public class ex13 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("Digite um número correspondente a um dia da semana: ");
        n = scan.nextInt();

        switch (n){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabádo");
                break;
            default:
                System.out.println("Número inválido!");
        }
    }
}

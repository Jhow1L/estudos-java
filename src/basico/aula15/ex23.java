package cursojavabasico.aula15;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n;

        System.out.println("Digite um número: ");
        n = scan.nextDouble();


        if (n % 1 == 0){
            System.out.println("Esse é um número inteiro");
        }
        else {
            System.out.println("Esse é um número decimal");
        }
    }
}

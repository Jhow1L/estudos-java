package basico.aula15;

import java.util.Scanner;

public class ex01 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double n1, n2;

        System.out.println("Número A: ");
        n1 = scan.nextDouble();

        System.out.println("Número B: ");
        n2 = scan.nextDouble();

        if (n1 > n2){
            System.out.println("A é maior que B");
        }
        else if (n2 > n1){
            System.out.println("B é maior que A");
        }
        else {
            System.out.println("A e B são iguais");
        }


    }
}

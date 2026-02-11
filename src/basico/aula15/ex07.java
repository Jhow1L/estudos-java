package cursojavabasico.aula15;

import java.util.Scanner;

public class ex07 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("X: ");
        n1 = scan.nextDouble();

        System.out.println("Y: ");
        n2 = scan.nextDouble();

        System.out.println("Z: ");
        n3 = scan.nextDouble();

        if (n1 > n2 && n1 > n3){
            System.out.println("X é o maior");
        }
        else if (n2 > n3 && n2 > n1){
            System.out.println("Y é o maior");
        }
        else if (n3 > n1 && n3 > n2){
            System.out.println("Z é o maior");
        }

        if (n1 <= n2 && n1 <= n3){
            System.out.println("X é o menor");
        }
        else if (n2 <= n1 && n2 <= n3){
            System.out.println("Y é o menor");
        }
        else if (n3 <= n1 && n3 <= n2){
            System.out.println("Z é o menor");
        }
    }
}

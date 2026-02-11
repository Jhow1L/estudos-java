package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex22 {
    public static void main() {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("Digite um número: ");
        n = scan.nextInt();

        if (n % 2 == 0){
            System.out.println("Esse número é par");
        }
        else {
            System.out.println("Esse número é impar");
        }
    }
}

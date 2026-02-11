package loaine.cursojavabasico.aula19;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];
        boolean ehPalindromo = true;

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 5;
        a[6] = 4;
        a[7] = 3;
        a[8] = 2;
        a[9] = 1;

        for (int i = 0; i < a.length / 2; i++){
            if (a[i] != a[a.length - i - 1]){
                ehPalindromo = false;
                break;
            }
        }

        System.out.printf((ehPalindromo) ? "É Palindromo" : "Não é Palindromo");
    }
}

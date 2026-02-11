package basico.aula19;

import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];

        for (int i = 0; i < a.length; i++){
            System.out.printf("Digite um número inteiro: ");
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length - 1; j++){
                if (a[j] >= a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }

            }

        }

        for (int n : a){
            System.out.printf("%d ", n);
        }
    }
}

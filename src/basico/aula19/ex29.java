package cursojavabasico.aula19;

import java.util.Random;
import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        for (int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(0, 10);
            b[i] = rand.nextInt(10, 20);
        }

        for (int i = 0; i < c.length / 2; i++){
            c[i] = a[i];
            c[i + (a.length)] = b[i];
        }

        for (int n : c){
            System.out.println(n);
        }

    }
}

package cursojavabasico.aula15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex09 {
    static void main() {
        Scanner scan = new Scanner(System.in);

          Double numeros[];
          int n = 3;
          numeros = new Double[n];
          int i;

          for(i = 0; i < n; i++){
              System.out.println("Digite o " + (i + 1) + "° número: ");
              numeros[i] = scan.nextDouble();
          }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("Decrescente: " + Arrays.toString(numeros));


    }
}

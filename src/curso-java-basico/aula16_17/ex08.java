package loaine.cursojavabasico.aula16_17;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, maior = Integer.MIN_VALUE;

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o %d° número: ", i + 1);
            numero = scan.nextInt();

            if (numero > maior || i == 0) maior = numero;
        }


        System.out.printf("O maior número entre eles é: %d", maior);
    }
}

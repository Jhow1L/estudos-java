package loaine.cursojavabasico.aula16_17;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;

        while (true){
            System.out.printf("Digite um número de 1 a 10: ");
            numero = scan.nextInt();

            if (numero < 1 || numero > 10){
                System.out.printf("Número inválido! Tente novamente.\n");
            }
            else {
                break;
            }
        }

        for (int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }
}

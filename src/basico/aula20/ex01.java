package basico.aula20;

import java.util.Random;

public class ex01 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[][] matriz = new int[4][4];

        int indice1 = 0, indice2 = 0, maiorValor = 0;

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("Indice %d | Valores: ", i);
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(100);
                System.out.printf("%d ", matriz[i][j]);

                if (matriz[i][j] >= maiorValor) {
                    maiorValor = matriz[i][j];
                    indice1 = i;
                    indice2 = j;
                }
            }
            System.out.printf("\n");
        }

        System.out.printf("O maior número entre esses vetores é: %d\n", maiorValor);
        System.out.printf("A posição dele é: %d - %d", indice1, indice2);

    }
}

package loaine.cursojavabasico.aula27;

import java.util.Scanner;

public class TabuleiroVelha {

    Scanner scan = new Scanner(System.in);

    String[][] tabuleiro = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
    };
    int linha = -1;
    int coluna = -1;
    boolean vezJogador1 = true;
    int jogadas = 0;


    void imprimirTabuleiro() {

        System.out.printf("   0   1   2\n");

        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.printf("%d ", i);
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.printf("[%s] ", tabuleiro[i][j], j);

            }
            System.out.printf("\n");
        }
    }

    void rodada() {
        while (true) {
            String marcador = (vezJogador1) ? "O" : "X";

            System.out.printf("Vez do jogador %d(%s)\n", (vezJogador1) ? 1 : 2, marcador);

            while (true) {
                System.out.printf("Linha: ");
                linha = scan.nextInt();

                if (linha >= 0 && linha <= 2) {
                    break;
                } else {
                    System.out.printf("Linha inválida! Digite novamente...\n");
                }

            }

            while (true) {
                System.out.printf("Coluna: ");
                coluna = scan.nextInt();

                if (coluna >= 0 && coluna <= 2) {
                    break;
                } else {
                    System.out.printf("Coluna inválida! Digite novamente...\n");
                }

            }

            if (tabuleiro[linha][coluna].equalsIgnoreCase(" ")) {
                tabuleiro[linha][coluna] = marcador;
                jogadas++;
                break;
            } else {
                System.out.printf("Espaço ocupado! Tente novamente...");
            }
        }


    }

    boolean verificarVitoria() {
        if ((!tabuleiro[0][0].equals(" ") && tabuleiro[0][0].equals(tabuleiro[0][1]) && tabuleiro[0][0].equals(tabuleiro[0][2])) ||
                (!tabuleiro[1][0].equals(" ") && tabuleiro[1][0].equals(tabuleiro[1][1]) && tabuleiro[1][0].equals(tabuleiro[1][2])) ||
                (!tabuleiro[2][0].equals(" ") && tabuleiro[2][0].equals(tabuleiro[2][1]) && tabuleiro[2][0].equals(tabuleiro[2][2])) ||
                (!tabuleiro[0][0].equals(" ") && tabuleiro[0][0].equals(tabuleiro[1][0]) && tabuleiro[0][0].equals(tabuleiro[2][0])) ||
                (!tabuleiro[0][1].equals(" ") && tabuleiro[0][1].equals(tabuleiro[1][1]) && tabuleiro[0][1].equals(tabuleiro[2][1])) ||
                (!tabuleiro[0][2].equals(" ") && tabuleiro[0][2].equals(tabuleiro[1][2]) && tabuleiro[0][2].equals(tabuleiro[2][2])) ||
                (!tabuleiro[0][0].equals(" ") && tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[0][0].equals(tabuleiro[2][2])) ||
                (!tabuleiro[0][2].equals(" ") && tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[0][2].equals(tabuleiro[2][0]))) {
            System.out.printf("Temos um vencedor: Jogador %d\n", (vezJogador1) ? 1 : 2);
            return true;
        } else if (jogadas == 9) {
            System.out.printf("Empate!");
            return true;
        }

        vezJogador1 = !vezJogador1;
        return false;
    }

}

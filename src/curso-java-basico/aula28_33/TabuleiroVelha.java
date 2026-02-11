package loaine.cursojavabasico.aula28_33;

import java.util.Scanner;

public class TabuleiroVelha {

    Scanner scan = new Scanner(System.in);

    private String[][] tabuleiro;
    private int linha = -1;
    private int coluna = -1;
    private boolean vezJogador1;
    private int jogadas;

    public TabuleiroVelha() {
        tabuleiro = new String[][]{
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };
        vezJogador1 = true;
        jogadas = 0;
    }

    public TabuleiroVelha(String[][] tabuleiro, int linha, int coluna, boolean vezJogador1, int jogadas) {
        this.tabuleiro = tabuleiro;
        this.linha = linha;
        this.coluna = coluna;
        this.vezJogador1 = vezJogador1;
        this.jogadas = jogadas;
        this.tabuleiro = new String[][]{
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };
        this.vezJogador1 = true;
        this.jogadas = 0;
    }

    public String[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(String[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public boolean isVezJogador1() {
        return vezJogador1;
    }

    public void setVezJogador1(boolean vezJogador1) {
        this.vezJogador1 = vezJogador1;
    }

    public int getJogadas() {
        return jogadas;
    }

    public void setJogadas(int jogadas) {
        this.jogadas = jogadas;
    }



    public void imprimirTabuleiro() {

        System.out.printf("   0   1   2\n");

        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.printf("%d ", i);
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.printf("[%s] ", tabuleiro[i][j], j);

            }
            System.out.printf("\n");
        }
    }

    public void rodada() {
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

    public boolean verificarVitoria() {
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

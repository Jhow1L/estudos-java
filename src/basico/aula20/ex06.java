package cursojavabasico.aula20;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] tabuleiro = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };



        int linha = -1, coluna = -1;
        boolean vezJogador = true;
        int jogadas = 0;



        while (jogadas < 9){

            System.out.printf("   0   1   2\n");

            for (int i = 0; i < tabuleiro.length; i++){
                System.out.printf("%d ", i);
                for (int j = 0; j < tabuleiro[i].length; j++){
                    System.out.printf("[%s] ", tabuleiro[i][j], j);

                }
                System.out.printf("\n");
            }



            while (true){

                String marcador = (vezJogador) ? "O" : "X";

                System.out.printf("Vez do jogador %d\n", (vezJogador) ? 1 : 2);

                while(true){
                    System.out.printf("Linha: ");
                    linha = scan.nextInt();

                    if (linha >= 0 && linha <=2){
                        break;
                    }
                    else{
                        System.out.printf("Linha inválida! Digite novamente...\n");
                    }

                }

                while(true){
                    System.out.printf("Coluna: ");
                    coluna = scan.nextInt();

                    if (coluna >= 0 && coluna <=2){
                        break;
                    }
                    else{
                        System.out.printf("Coluna inválida! Digite novamente...\n");
                    }

                }

                if (tabuleiro[linha][coluna].equalsIgnoreCase(" ")){
                    tabuleiro[linha][coluna] = marcador;
                    break;
                }
                else{
                    System.out.printf("Espaço ocupado!");
                }


            }

            jogadas++;

            if (!tabuleiro[0][0].equals(" ") && tabuleiro[0][0].equals(tabuleiro[0][1]) && tabuleiro[0][0].equals(tabuleiro[0][2])) {
                System.out.printf("Temos um vencedor: %d", (vezJogador) ? 1 : 2);
                break; // Encerra o jogo
            }
            else if (!tabuleiro[1][0].equals(" ") && tabuleiro[1][0].equals(tabuleiro[1][1]) && tabuleiro[1][0].equals(tabuleiro[1][2])){
                System.out.printf("Temos um vencedor: %d", (vezJogador) ? 1 : 2);
                break; // Encerra o jogo
            }
            else if (!tabuleiro[2][0].equals(" ") && tabuleiro[2][0].equals(tabuleiro[2][1]) && tabuleiro[2][0].equals(tabuleiro[2][2])){
                System.out.printf("Temos um vencedor: %d", (vezJogador) ? 1 : 2);
                break; // Encerra o jogo
            }
            else if (!tabuleiro[0][0].equals(" ") && tabuleiro[0][0].equals(tabuleiro[1][0]) && tabuleiro[0][0].equals(tabuleiro[2][0])) {
                System.out.printf("Temos um vencedor: Jogador %d\n", (vezJogador) ? 1 : 2);
                break;
            }
            else if (!tabuleiro[0][1].equals(" ") && tabuleiro[0][1].equals(tabuleiro[1][1]) && tabuleiro[0][1].equals(tabuleiro[2][1])) {
                System.out.printf("Temos um vencedor: Jogador %d\n", (vezJogador) ? 1 : 2);
                break;
            }
            else if (!tabuleiro[0][2].equals(" ") && tabuleiro[0][2].equals(tabuleiro[1][2]) && tabuleiro[0][2].equals(tabuleiro[2][2])) {
                System.out.printf("Temos um vencedor: Jogador %d\n", (vezJogador) ? 1 : 2);
                break;
            }
            else if (!tabuleiro[0][0].equals(" ") && tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[0][0].equals(tabuleiro[2][2])) {
                System.out.printf("Temos um vencedor: Jogador %d\n", (vezJogador) ? 1 : 2);
                break;
            }
            else if (!tabuleiro[0][2].equals(" ") && tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[0][2].equals(tabuleiro[2][0])) {
                System.out.printf("Temos um vencedor: Jogador %d\n", (vezJogador) ? 1 : 2);
                break;
            }
            else if (jogadas == 9){
                System.out.printf("Empate!");
            }

            vezJogador = !vezJogador;



        }

        System.out.printf("   0   1   2\n");

        for (int i = 0; i < tabuleiro.length; i++){
            System.out.printf("%d ", i);
            for (int j = 0; j < tabuleiro[i].length; j++){
                System.out.printf("[%s] ", tabuleiro[i][j], j);

            }
            System.out.printf("\n");
        }




    }










}

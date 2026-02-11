package basico.aula27;

public class TesteTabuleiroVelha {
    public static void main(String[] args) {

        loaine.cursojavabasico.aula27.TabuleiroVelha jogo1 = new loaine.cursojavabasico.aula27.TabuleiroVelha();

        while (true) {
            jogo1.imprimirTabuleiro();
            jogo1.rodada();
            if (jogo1.verificarVitoria()) {
                jogo1.imprimirTabuleiro();
                break;
            }
        }
    }
}

package cursojavabasico.aula56;

public class Teste {
    public static void main(String[] args) {

        loaine.cursojavabasico.aula56.OperacoesMatematicas[] operacoes = loaine.cursojavabasico.aula56.OperacoesMatematicas.values();

        double x = 2, y = 3;

        for (loaine.cursojavabasico.aula56.OperacoesMatematicas operacao : operacoes){
            System.out.printf("Operação: %.2f %s %1.2f | Resultado: %f\n", x, operacao, y, operacao.executarOperacao(x, y));
        }
    }
}

package intermediario.aula56;

public enum OperacoesMatematicas {

    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private String operacao;

    private OperacoesMatematicas(String operacao) {
        this.operacao = operacao;
    }

    public abstract double executarOperacao(double x, double y);

    @Override
    public String toString() {
        return operacao;
    }
}

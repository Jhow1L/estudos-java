package basico.aula37_43.exercicios.ex01;

public class ContaEspecial extends loaine.cursojavabasico.aula37_43.exercicios.ex01.ContaBancaria {
    private double limite;

    ContaEspecial(double valor){
        setLimite(valor);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor){
        if (getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            return true;
        }
        else {
            if (valor <= (getSaldo() + getLimite())){
                setSaldo(getSaldo() - valor);
                return true;
            }

            return false;
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + getLimite() +
                ", nomeCliente='" + getNomeCliente() + '\'' +
                ", numConta='" + getNumConta() + '\'' +
                ", saldo=" + getSaldo() +
                '}';
    }
}

package basico.aula37_43.exercicios.ex01;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    ContaBancaria(){

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean depositar(double valor){
        if (valor > 0){
            saldo += valor;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

package cursojavabasico.aula37_43.exercicios.ex01;

public class ContaPoupanca extends loaine.cursojavabasico.aula37_43.exercicios.ex01.ContaBancaria {
    private double taxaRendimento;
    private double mesRendimento;

    ContaPoupanca(double taxa){
        setTaxaRendimento(taxa);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public double getMesRendimento() {
        return mesRendimento;
    }

    public void setMesRendimento(double mesRendimento) {
        this.mesRendimento = mesRendimento;
    }

    public void calcularNovoSaldo(){
        this.mesRendimento = (getSaldo() / 100) * getTaxaRendimento();
        setSaldo(getSaldo() + getMesRendimento());
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "mesRendimento=" + getMesRendimento() +
                ", nomeCliente='" + getNomeCliente() + '\'' +
                ", numConta='" + getNumConta() + '\'' +
                ", saldo=" + getSaldo() +
                '}';
    }
}

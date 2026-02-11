package cursojavabasico.aula37_43.exercicios.ex02;

public class PessoaFisica extends loaine.cursojavabasico.aula37_43.exercicios.ex02.Contribuinte {
    private String cpf;

    public PessoaFisica(String nome, String telefone, String email, double renda, String cpf) {
        super(nome, telefone, email, renda);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void calcularImposto(){
        if (getRenda() >= 0 && getRenda() <= 1400){
            setValorImposto(getRenda() * 0);
        }
        else if (getRenda() > 1400 && getRenda() <= 2100){
            setValorImposto(getRenda() * 0.10 - 100);
        }
        else if (getRenda() > 2100 && getRenda() <= 2800){
            setValorImposto(getRenda() * 0.15 - 270);
        }
        else if (getRenda() > 2800 && getRenda() <= 3600){
            setValorImposto(getRenda() * 0.25 - 500);
        }
        else if (getRenda() > 3600){
            setValorImposto(getRenda() * 0.30 - 700);
        }
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + getCpf() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", renda=" + getRenda() +
                ", valorImposto=" + getValorImposto() +
                '}';
    }
}

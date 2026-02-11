package loaine.cursojavabasico.aula37_43.exercicios.ex02;

public class PessoaJuridica extends loaine.cursojavabasico.aula37_43.exercicios.ex02.Contribuinte {
    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String email, double renda, String cnpj) {
        super(nome, telefone, email, renda);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void calcularImposto(){
        setValorImposto(this.getRenda() * 0.10);
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + getCnpj() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", renda=" + getRenda() +
                ", valorImposto=" + getValorImposto() +
                '}';
    }
}

package loaine.cursojavabasico.aula37_43.exercicios.ex02;

public abstract class Contribuinte {
    private String nome;
    private String telefone;
    private String email;
    private double renda;
    private double valorImposto;

    public Contribuinte(String nome, String telefone, String email, double renda) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

    public abstract void calcularImposto();

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", renda=" + renda +
                ", valorImposto=" + valorImposto +
                '}';
    }
}

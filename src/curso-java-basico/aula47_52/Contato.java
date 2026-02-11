package loaine.cursojavabasico.aula47_52;

public class Contato {
    private static int contador = 0;

    private int identificador;
    private String nome;
    private String telefone;

    Contato(){
        contador++;
        this.identificador = contador;
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

    @Override
    public String toString() {
        return "Contato{" +
                "identificador=" + identificador +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}

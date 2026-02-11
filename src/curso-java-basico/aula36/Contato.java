package loaine.cursojavabasico.aula36;

public class Contato {
    private String nome;
    private loaine.cursojavabasico.aula36.Telefone[] telefones;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public loaine.cursojavabasico.aula36.Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(loaine.cursojavabasico.aula36.Telefone[] telefones) {
        this.telefones = telefones;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostrarInformacoes(){
        System.out.printf("Nome: %s\n", getNome());
        System.out.printf("Telefones:\n");
        for (int i = 0; i < telefones.length; i++) {
            telefones[i].mostrarTelefone();
        }
        System.out.printf("Email: %s\n", getEmail());
    }
}

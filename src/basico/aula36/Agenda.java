package cursojavabasico.aula36;


public class Agenda {
    private String name;
    private loaine.cursojavabasico.aula36.Contato[] contatos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public loaine.cursojavabasico.aula36.Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(loaine.cursojavabasico.aula36.Contato[] contatos) {
        this.contatos = contatos;
    }

    public void mostrarContatos(){
        for (int i = 0; i < contatos.length; i++){
            System.out.printf("----------------\n");
            contatos[i].mostrarInformacoes();
            System.out.printf("----------------\n");
        }
    }
}

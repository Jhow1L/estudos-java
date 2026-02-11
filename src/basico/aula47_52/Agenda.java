package basico.aula47_52;

public class Agenda {
    private loaine.cursojavabasico.aula47_52.Contato contatos[];

    Agenda(int valor){
        contatos = new loaine.cursojavabasico.aula47_52.Contato[valor];
    }

    public void adicionarContato(loaine.cursojavabasico.aula47_52.Contato contato) throws loaine.cursojavabasico.aula47_52.AgendaCheiaException {
        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++){
            if(contatos[i] == null){
                contatos[i] = contato;
                cheia = false;
                break;
            }
        }
        if(cheia){
            throw new loaine.cursojavabasico.aula47_52.AgendaCheiaException();
        }
    }

    public int consultarContato(String nome) throws loaine.cursojavabasico.aula47_52.ContatoNaoExisteException {
        boolean contatoNaoExiste = true;
        for (int i = 0; i < contatos.length; i++){
            if(contatos[i] != null){
                if(contatos[i].getNome().equalsIgnoreCase(nome)){
                    contatoNaoExiste = false;
                    return i;
                }
            }
        }
        if(contatoNaoExiste){
            throw new loaine.cursojavabasico.aula47_52.ContatoNaoExisteException(nome);
        }
        return -1;
    }
}

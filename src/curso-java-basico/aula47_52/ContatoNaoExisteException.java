package loaine.cursojavabasico.aula47_52;

public class ContatoNaoExisteException extends Exception{

    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato){
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Nenhum contato com o nome (" + nomeContato + ") encontrado.";
    }
}

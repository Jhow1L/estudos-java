package cursojavabasico.aula74;

public class Semaforo {

    private loaine.cursojavabasico.aula74.CoresSemaforo cor;
    private int tempoEspera;
    private boolean ligado;

    Semaforo(){
        this.cor = loaine.cursojavabasico.aula74.CoresSemaforo.VERMELHO;
        this.tempoEspera = loaine.cursojavabasico.aula74.CoresSemaforo.VERMELHO.getTempoEspera();
    }

    public loaine.cursojavabasico.aula74.CoresSemaforo getCor() {
        return cor;
    }

    public void setCor(loaine.cursojavabasico.aula74.CoresSemaforo cor) {
        this.cor = cor;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public synchronized void mudarCor() {
        if (cor.equals(loaine.cursojavabasico.aula74.CoresSemaforo.VERDE)) {
            this.cor = loaine.cursojavabasico.aula74.CoresSemaforo.AMARELO;
            this.tempoEspera = loaine.cursojavabasico.aula74.CoresSemaforo.AMARELO.getTempoEspera();
        } else if (cor.equals(loaine.cursojavabasico.aula74.CoresSemaforo.AMARELO)) {
            this.cor = loaine.cursojavabasico.aula74.CoresSemaforo.VERMELHO;
            this.tempoEspera = loaine.cursojavabasico.aula74.CoresSemaforo.VERMELHO.getTempoEspera();
        } else {
            this.cor = loaine.cursojavabasico.aula74.CoresSemaforo.VERDE;
            this.tempoEspera = loaine.cursojavabasico.aula74.CoresSemaforo.VERDE.getTempoEspera();
        }
    }

    public synchronized void ligarSemaforo(){
        this.ligado = true;
    }

    public synchronized void desligarSemaforo(){
        this.ligado = false;
    }
}

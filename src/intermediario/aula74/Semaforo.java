package intermediario.aula74;

public class Semaforo {

    private CoresSemaforo cor;
    private int tempoEspera;
    private boolean ligado;

    Semaforo(){
        this.cor = CoresSemaforo.VERMELHO;
        this.tempoEspera = CoresSemaforo.VERMELHO.getTempoEspera();
    }

    public CoresSemaforo getCor() {
        return cor;
    }

    public void setCor(CoresSemaforo cor) {
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
        if (cor.equals(CoresSemaforo.VERDE)) {
            this.cor = CoresSemaforo.AMARELO;
            this.tempoEspera = CoresSemaforo.AMARELO.getTempoEspera();
        } else if (cor.equals(CoresSemaforo.AMARELO)) {
            this.cor = CoresSemaforo.VERMELHO;
            this.tempoEspera = CoresSemaforo.VERMELHO.getTempoEspera();
        } else {
            this.cor = CoresSemaforo.VERDE;
            this.tempoEspera = CoresSemaforo.VERDE.getTempoEspera();
        }
    }

    public synchronized void ligarSemaforo(){
        this.ligado = true;
    }

    public synchronized void desligarSemaforo(){
        this.ligado = false;
    }
}

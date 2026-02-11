package cursojavabasico.aula74;

public enum CoresSemaforo {
    VERDE(2000), AMARELO(1000), VERMELHO(4000);

    private int tempoEspera;

    public int getTempoEspera() {
        return tempoEspera;
    }


    private CoresSemaforo(int tempo){
        this.tempoEspera = tempo;
    }
}

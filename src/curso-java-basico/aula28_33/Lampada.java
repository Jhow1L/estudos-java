package loaine.cursojavabasico.aula28_33;

public class Lampada {

    private String marca;
    private String tipo; //(incandescente, fluorescente, LED)
    private String tensao;
    private String cor;
    private int potencia; //watts
    private double preco;
    private double vidaUtil;
    private int garantia;

    boolean ligada;

    public Lampada() {
    }

    public Lampada(String marca, String tipo, String tensao, String cor, int potencia, double preco, double vidaUtil, int garantia, boolean ligada) {
        this.marca = marca;
        this.tipo = tipo;
        this.tensao = tensao;
        this.cor = cor;
        this.potencia = potencia;
        this.preco = preco;
        this.vidaUtil = vidaUtil;
        this.garantia = garantia;
        this.ligada = ligada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(double vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }


    public void ligarLampada() {
        setLigada(true);
    }

    public void desligarLampada() {
        setLigada(false);
    }

    public void mostrarEstado() {
        if (isLigada()) {
            System.out.printf("A lampada está ligada!");
        } else {
            System.out.printf("A lampada está desligada.");
        }
    }

}

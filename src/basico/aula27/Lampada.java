package cursojavabasico.aula27;

public class Lampada {

    String marca;
    String tipo; //(incandescente, fluorescente, LED)
    String tensao;
    String cor;
    int potencia; //watts
    double preco;
    double vidaUtil;
    int garantia;

    boolean ligada;

    void ligarLampada(){
        ligada = true;
    }

    void desligarLampada(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada){
            System.out.printf("A lampada está ligada!");
        }
        else {
            System.out.printf("A lampada está desligada.");
        }
    }

}

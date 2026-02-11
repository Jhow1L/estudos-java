package loaine.cursojavabasico.aula34;

public class Contador {

    static private int cont;

    public Contador(){
        cont++;
    }

    public static int getN() {
        return cont;
    }

    public static void setN(int n) {
        Contador.cont = n;
    }

    public static void zerar(){
        setN(0);
    }

    public static void incrementar(){
        cont++;
    }

    public int retornarN(){
        return cont;
    }
}

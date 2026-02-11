package cursojavabasico.aula34;

public class TesteContador {
    public static void main(String[] args) {

        loaine.cursojavabasico.aula34.Contador.incrementar();
        System.out.printf("%d\n", loaine.cursojavabasico.aula34.Contador.getN());

        loaine.cursojavabasico.aula34.Contador.zerar();
        System.out.print(loaine.cursojavabasico.aula34.Contador.getN());

        System.out.printf("\n");

        loaine.cursojavabasico.aula34.Contador cont = new loaine.cursojavabasico.aula34.Contador();
        cont.incrementar();
        System.out.print(cont.retornarN());


    }
}

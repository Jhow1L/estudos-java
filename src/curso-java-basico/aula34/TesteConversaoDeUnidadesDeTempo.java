package loaine.cursojavabasico.aula34;

public class TesteConversaoDeUnidadesDeTempo {
    public static void main(String[] args) {

        System.out.printf("Segundos\n");
        System.out.print(loaine.cursojavabasico.aula34.ConversaoDeUnidadesDeTempo.minutosParaSegundos(420));
        System.out.printf("\nMinutos\n");
        System.out.print(loaine.cursojavabasico.aula34.ConversaoDeUnidadesDeTempo.horasParaMinutos(6.8));
        System.out.printf("\nHoras\n");
        System.out.print(loaine.cursojavabasico.aula34.ConversaoDeUnidadesDeTempo.diasParaHoras(9));
        System.out.printf("\nDias\n");
        System.out.print(loaine.cursojavabasico.aula34.ConversaoDeUnidadesDeTempo.mesesParaDias(8));
        System.out.printf("\nDias - Ano\n");
        System.out.print(loaine.cursojavabasico.aula34.ConversaoDeUnidadesDeTempo.anosParaDias(20));


    }
}

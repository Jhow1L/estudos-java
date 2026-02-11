package basico.aula16_17;

public class ex04 {
    public static void main(String[] args) {

        final double TAXA_CRESCIMENTO_A = 1.030; //3%
        final double TAXA_CRESCIMENTO_B = 1.015; //1,5%

        double popA = 80000, popB = 200000;
        int ano = 0;

        System.out.printf("População inicial do país A: %.0f\n", popA);
        System.out.printf("População inicial do país B: %.0f\n", popB);

        while (popA < popB){
            popA *= TAXA_CRESCIMENTO_A;
            popB *= TAXA_CRESCIMENTO_B;
            ano++;
        }

        System.out.printf("Quantidade de anos para o país A superar o país B: %d anos\n", ano);
        System.out.printf("População final do país A: %.0f\n", popA);
        System.out.printf("População final do país B: %.0f\n", popB);


    }
}

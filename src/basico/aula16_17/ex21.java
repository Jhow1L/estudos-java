package basico.aula16_17;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        boolean teste = true;

        System.out.printf("Digite um número inteiro: ");
        n = scan.nextInt();

        if(n <= 1){
            teste = false;
        }

        for (int i = 2; n > i; i++){
            if(n % i == 0){
                teste = false;
                break;
            }
        }

        if (teste){
            System.out.printf("Primo");
        }
        else{
            System.out.printf("Não é primo");
        }

    }
}

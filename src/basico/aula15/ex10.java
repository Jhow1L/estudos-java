package cursojavabasico.aula15;

import java.util.Scanner;

public class ex10 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        String periodo;

        System.out.println("Em que período você estuda? (M-Matutino, V-Vespertino ou N-Noturno) ");
        periodo = scan.nextLine().toUpperCase();

        switch (periodo){
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }



    }
}

package cursojavabasico.aula15;

import java.util.Scanner;

public class ex04 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        String letra;

        System.out.println("Digite uma letra: ");
        letra = scan.next().toUpperCase();

        switch (letra){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Vogal"); break;
            default:
                System.out.println("Consoante");

        }
    }
}

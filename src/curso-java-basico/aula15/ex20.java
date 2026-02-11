package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex20 {
    public static void main() {
        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Nota 1: ");
        nota1 = scan.nextDouble();

        System.out.println("Nota 2: ");
        nota2 = scan.nextDouble();

        System.out.println("Nota 3: ");
        nota3 = scan.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media == 10){
            System.out.println("Aprovado com distinção");
        }
        else if (media < 7){
            System.out.println("Reprovado");
        }
        else if (media >= 7){
            System.out.println("Aprovado");
        }

        System.out.println("Média final: " + media);
    }
}

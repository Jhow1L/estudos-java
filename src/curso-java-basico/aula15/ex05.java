package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex05 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media == 10){
            System.out.println("Aprovado com distinção");
        }
        else if (media >= 7){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }


    }
}

package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex14 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.print("Conceito: ");

        if (media == 9 || media == 10){
            System.out.println("A");
            System.out.println("Aprovado");
        }
        else if (media >= 7.5 && media < 9){
            System.out.println("B");
            System.out.println("Aprovado");
        }
        else if (media >= 6 && media < 7.5){
            System.out.println("C");
            System.out.println("Aprovado");
        }
        else if (media >= 4 && media < 6.0){
            System.out.println("D");
            System.out.println("Reprovado");
        }
        else if (media >= 0 && media < 4){
            System.out.println("E");
            System.out.println("Reprovado");
        }

    }
}

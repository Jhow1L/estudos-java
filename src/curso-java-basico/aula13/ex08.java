package loaine.cursojavabasico.aula13;

import java.util.Scanner;

public class ex08 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double valorHora, qtdHoras, salarioTotal;

        System.out.println("Digite quanto você ganha por hora: ");
        valorHora = scan.nextDouble();

        System.out.println("Digite quantas horas você trabalhou esse mês: ");
        qtdHoras = scan.nextDouble();

        salarioTotal = valorHora * qtdHoras;

        System.out.println("Seu sálario esse mês é igual a: R$" + salarioTotal);
    }
}

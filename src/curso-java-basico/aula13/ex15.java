package loaine.cursojavabasico.aula13;

import java.util.Scanner;

public class ex15 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double valorHora, horasTrabalhadas, salarioTotal, inss, sindicato, salarioLiquido, ir;

        System.out.println("Digite o valor que você ganha por hora: R$");
        valorHora = scan.nextDouble();

        System.out.println("Digite quantas horas você trabalhou esse mês: ");
        horasTrabalhadas = scan.nextDouble();

        salarioTotal = valorHora * horasTrabalhadas;
        ir = salarioTotal / 100 * 11;
        inss = salarioTotal / 100 * 8;
        sindicato = salarioTotal / 100 * 5;
        salarioLiquido = salarioTotal - inss - sindicato - ir;

        System.out.println("Salario bruto: R$" + salarioTotal);
        System.out.println("Desconto do IR: R$" + ir);
        System.out.println("Desconto INSS: R$" + inss);
        System.out.println("Desconto do sindicato: R$" + sindicato);
        System.out.println("Salário líquido: R$" + salarioLiquido);
    }
}

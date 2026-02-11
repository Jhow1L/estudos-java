package cursojavabasico.aula15;

import java.util.Scanner;

public class ex12 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double horasTrabalhadas, valorHora, salarioBruto, fgts, inss, dIr = 0, ir, descontos, salarioLiquido;

        System.out.println("Horas trabalhadas: ");
        horasTrabalhadas = scan.nextDouble();

        System.out.println("Valor recebido por hora de trabalho: R$");
        valorHora = scan.nextDouble();


        salarioBruto = horasTrabalhadas * valorHora;
        fgts = salarioBruto / 100 * 8;
        inss = salarioBruto / 100 * 10;

        if (salarioBruto <= 900){
            dIr = 0;
        }
        else if (salarioBruto <= 1500){
            dIr = 5;
        }
        else if (salarioBruto <= 2500){
            dIr = 10;
        }
        else if (salarioBruto > 2500){
            dIr = 20;
        }

        ir = salarioBruto / 100 * dIr;

        descontos =  inss + ir;
        salarioLiquido = salarioBruto - descontos;

        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("IR (" + dIr + "%) : R$" + ir);
        System.out.println("INSS (10%): R$" + inss);
        System.out.println("FGTS (11%): R$" + fgts);
        System.out.println("Total de descontos: R$" + descontos);
        System.out.println("Salário líquido: R$" + salarioLiquido);

    }
}

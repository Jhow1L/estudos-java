package cursojavabasico.aula15;

import java.util.Scanner;

public class ex11 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double salarioAtual, aumento, percentual = 0, novoSalario;

        System.out.print("Digite o salário do colaborador: R$");
        salarioAtual = scan.nextDouble();

        if (salarioAtual <= 280){
            percentual = 20;
        }
        else if (salarioAtual > 280 && salarioAtual <= 700){
            percentual = 15;
        }
        else if (salarioAtual > 700 && salarioAtual <= 1500){
            percentual = 10;
        }
        else if (salarioAtual > 1500){
            percentual = 5;
        }

        aumento = salarioAtual / 100 * percentual;
        novoSalario = salarioAtual + aumento;

        System.out.println("Salário antes do reajuste: R$" + salarioAtual);
        System.out.println("Percentual de aumento: " + percentual + "%");
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Novo salário: R$" + novoSalario);




    }
}

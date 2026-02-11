package basico.aula15;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1, n2, resultado = 0;
        String operacao;

        System.out.print("Digite um número: ");
        n1 = scan.nextDouble();

        System.out.print("Digite outro número: ");
        n2 = scan.nextDouble();

        System.out.println("Qual operação você deseja realizar? (+, -, *, /)");
        operacao = scan.next();

        switch (operacao){
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Operador inválido!");
                System.exit(1);
        }

        System.out.println(n1 + " " + operacao + " " + n2 + " = " + resultado);
        System.out.println((resultado % 2 == 0) ? "Esse número é par" : "Esse número é impar");
        System.out.println((resultado % 1 == 0) ? "Esse é um número inteiro" : "Esse é um numero decimal");
    }
}

package basico.aula15;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double litrosVendidos, valorTotal = 0, desconto = 0, precoLitro = 0, porcDesconto = 0;
        String tipoDeCombustivel;

        final double precoGasolina = 2.50;
        final double precoAlcool = 1.90;

        System.out.println("Digite a quantidade de litros vendidos: ");
        litrosVendidos = scan.nextDouble();

        System.out.println("Digite o tipo de combustível vendido: (A-álcool, G-gasolina) ");
        tipoDeCombustivel = scan.next().toLowerCase();

        switch (tipoDeCombustivel){
            case "a":
                precoLitro = precoAlcool;
                if (litrosVendidos <= 20){
                    porcDesconto = 0.03;
                }
                else {
                    porcDesconto = 0.05;
                }
                break;
            case "g":
                precoLitro = precoGasolina;
                if (litrosVendidos <= 20){
                    porcDesconto = 0.04;
                }
                else {
                    porcDesconto = 0.06;
                }
                break;
            default:
                System.out.println("Tipo inválido!");
                System.exit(1);
        }

        valorTotal = precoLitro * litrosVendidos;
        desconto = valorTotal * porcDesconto;
        valorTotal -= desconto;

        System.out.printf("Valor a ser pago: R$%.2f", valorTotal);

    }
}

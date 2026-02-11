package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                  Até 5 Kg               Acima de 5 Kg                   ");
        System.out.println("File Duplo     R$ 40,90 por Kg           R$ 35,80 por Kg                 ");
        System.out.println("Alcatra        R$ 50,90 por Kg           R$ 45,80 por Kg                 ");
        System.out.println("Picanha        R$ 60,90 por Kg           R$ 55,80 por Kg                 ");
        System.out.println("-------------------------------------------------------------------------\n");

        final double PRECO_FILE_ATE_5 = 40.90;
        final double PRECO_FILE_ACIMA_5 = 35.80;
        final double PRECO_ALCATRA_ATE_5 = 50.90;
        final double PRECO_ALCATRA_ACIMA_5 = 45.80;
        final double PRECO_PICANHA_ATE_5 = 60.90;
        final double PRECO_PICANHA_ACIMA_5 = 55.80;

        String tipoCarne, meioPagamento;
        double kilos, valorTotal, desconto = 0, precoCarne = 0, valorPagar;

        System.out.println("Digite qual tipo de carne você deseja comprar: ");
        tipoCarne = scan.nextLine().toUpperCase();

        System.out.println("Digite quantos kilos você deseja: ");
        kilos = scan.nextDouble();

        switch (tipoCarne){
            case "FILE DUPLO":
                if (kilos <= 5){
                    precoCarne = PRECO_FILE_ATE_5;
                }
                else {
                    precoCarne = PRECO_FILE_ACIMA_5;
                }
                break;
            case "ALCATRA":
                if (kilos <= 5){
                    precoCarne = PRECO_ALCATRA_ATE_5;
                }
                else {
                    precoCarne = PRECO_ALCATRA_ACIMA_5;
                }
                break;
            case "PICANHA":
                if (kilos <= 5){
                    precoCarne = PRECO_PICANHA_ATE_5;
                }
                else {
                    precoCarne = PRECO_PICANHA_ACIMA_5;
                }
                break;
            default:
                System.out.println("Tipo de carne não existente.");
                System.exit(1);
        }

        valorTotal = precoCarne * kilos;

        scan.nextLine();

        System.out.println("Digite o meio de pagamento: ");
        meioPagamento = scan.nextLine();

        if(meioPagamento.equalsIgnoreCase("cartão tabajara")){
            desconto = valorTotal * 0.05;
        }

        valorPagar = valorTotal - desconto;

        System.out.printf("\nTipo de Carne: %s\n", tipoCarne);
        System.out.printf("Quantidade de Carne: %.2fKg\n", kilos);
        System.out.printf("Preço total: R$%.2f\n", valorTotal);
        System.out.printf("Tipo de pagamento: %s\n", meioPagamento);
        System.out.printf("Desconto: R$%.2f\n", desconto);
        System.out.printf("Valor a pagar: R$%.2f\n", valorPagar);
    }
}

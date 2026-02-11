package cursojavabasico.aula13;

import java.util.Scanner;

public class ex18 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double tamanhoArquivo, velocidadeInternet;

        System.out.println("Digite o tamanho do arquivo para download: (em MB) ");
        tamanhoArquivo = scan.nextDouble();

        System.out.println("Digite a velocidade da sua internet em Mbps: ");
        velocidadeInternet = scan.nextDouble();

        System.out.println("Tempo aproximado de download: " + (tamanhoArquivo / (velocidadeInternet / 8) / 60) + " minutos");
    }
}

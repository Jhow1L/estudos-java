package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, centena, dezena, unidade;

        System.out.println("Digite um número inteiro menor que 1000: ");
        numero = scan.nextInt();

        centena = numero / 100;
        dezena = (numero % 100) / 10;
        unidade = numero % 10;

        System.out.print(numero + " = ");

        if (centena > 0){
            System.out.print((centena > 1) ? centena + " centenas" : centena + " centena");
            System.out.print((dezena > 0 && unidade == 0) ? " e " : (unidade > 0 && dezena == 0) ? " e " : (dezena == 0 && unidade == 0) ? "" : ", ");
        }

        if (dezena > 0){
            System.out.print((dezena > 1) ? dezena + " dezenas" : dezena + " dezena");
            System.out.print((unidade != 0) ? " e " : "");
        }

        if (unidade > 0){
            System.out.print((unidade > 1) ? unidade + " unidades" : unidade + " unidade");
        }

    }
}

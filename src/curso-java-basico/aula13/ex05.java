package loaine.cursojavabasico.aula13;

import java.util.Scanner;

public class ex05 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        double cm, metros;

        System.out.println("Digite a quantidade de metros: ");
        metros = scan.nextDouble();

        cm = metros * 100;

        System.out.println(metros + " metros = " + cm + "cm");
    }
}

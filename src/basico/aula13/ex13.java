package cursojavabasico.aula13;
import java.util.Scanner;

public class ex13 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        double altura, pesoIdeal = 0;
        String sexo;

        System.out.println("Digite se você é mulher ou homem: (M ou H) ");
        sexo = scan.nextLine().toUpperCase();

        System.out.println("Digite sua altura: ");
        altura = scan.nextDouble();



        if (sexo.equals("M")){
            pesoIdeal = (62.1 * altura) - 44.7;

        }
        else if (sexo.equals("H")){
            pesoIdeal = (72.7 * altura) - 58;
        }

        System.out.println("Seu peso ideal é: " + pesoIdeal);


    }
}

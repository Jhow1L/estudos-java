package loaine.cursojavabasico.aula15;

import java.util.Scanner;

public class ex03 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        String a;

        System.out.println("F ou M: ");
        a = scan.nextLine().toUpperCase();

        if(a.equals("F")){
            System.out.println("Feminino");
        }
        else if(a.equals("M")){
            System.out.println("Masculino");
        }
        else{
            System.out.println("Error");
        }
    }
}

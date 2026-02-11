package cursojavabasico.aula15;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String classificacao = "";
        int contador = 0;

        System.out.println("Telefonou para a vítima? ");
        if (scan.next().equalsIgnoreCase("sim")){
            contador++;
        }

        System.out.println("Esteve no local do crime? ");
        if (scan.next().equalsIgnoreCase("sim")){
            contador++;
        }

        System.out.println("Mora perto da vítima? ");
        if (scan.next().equalsIgnoreCase("sim")){
            contador++;
        }

        System.out.println("Devia para a vítima? ");
        if (scan.next().equalsIgnoreCase("sim")){
            contador++;
        }

        System.out.println("Já trabalhou com a vítima? ");
        if (scan.next().equalsIgnoreCase("sim")){
            contador++;
        }

        if (contador == 2){
            classificacao = "Suspeita";
        }
        else if (contador == 3 || contador == 4){
            classificacao = "Cúmplice";
        }
        else if (contador == 5){
            classificacao = "Assassino";
        }
        else if (contador == 0){
            classificacao = "Inocente";
        }

        System.out.println(classificacao);
    }

}

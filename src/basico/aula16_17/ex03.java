package cursojavabasico.aula16_17;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome, sexo, estadoCivil;
        int idade;
        double salario;



        while (true){
            int i = 0;

            System.out.printf("Digite seu nome: ");
            nome = scan.nextLine();
            System.out.printf("Digite sua idade: ");
            idade = scan.nextInt();
            System.out.printf("Digite seu sálario: R$");
            salario = scan.nextDouble();
            System.out.printf("Digite seu sexo: (f ou m) ");
            sexo = scan.next();
            System.out.printf("Digite seu estado cívíl: (s, c, v, d) ");
            estadoCivil = scan.next();

            if (nome.length() < 3){
                System.out.printf("Nome inválido!\n");
                i++;
            }
            if (idade < 0 || idade > 150){
                System.out.printf("Idade inválida!\n");
                i++;
            }
            if (salario < 0){
                System.out.printf("Salario inválido!\n");
                i++;
            }
            if (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")){
                System.out.printf("Sexo inválido!\n");
                i++;
            }
            if (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")){
                System.out.printf("Estado cívil inválido!\n");
                i++;
            }

            if (i > 0){
                System.out.printf("Tente novamente...\n");
                scan.nextLine();
                continue;
            }
            else {
                break;
            }



        }

        System.out.printf("Cadastro concluído com sucesso!");


    }
}

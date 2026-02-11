package cursojavabasico.aula16_17;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome, senha;

        while (true){
            System.out.printf("Digite seu nome de usuário: ");
            nome = scan.next();

            System.out.printf("Digite sua senha: ");
            senha = scan.next();

            if (nome.equalsIgnoreCase(senha)){
                System.out.printf("Senha igual ao usuário, digite novamente.\n");
            }
            else {
                System.out.printf("Senha e usuários válidos.");
                break;
            }
        }


    }
}

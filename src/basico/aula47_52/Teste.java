package cursojavabasico.aula47_52;

import java.util.Scanner;

public class Teste {
    public static int obterOpcaoMenu(Scanner scan){
        while (true){
            System.out.println("--- Agenda ---");
            System.out.println("1 - Consultar contato");
            System.out.println("2 - Adicionar contato");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma opção: ");
            int opcao;
            try {
                opcao = scan.nextInt();
                scan.nextLine();
                if(opcao < 0 | opcao > 2){
                    System.out.println("Entrada inválida");
                    continue;
                }
            }
            catch (Exception e){
                System.out.println("Entrada inválida, digite novamente.");
                continue;
            }

            return opcao;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        loaine.cursojavabasico.aula47_52.Agenda agenda1 = new loaine.cursojavabasico.aula47_52.Agenda(10);

        while (true){
            int opcao = obterOpcaoMenu(scan);

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do contato a ser consultado: ");
                    String nome = scan.nextLine();
                    try {
                        if (agenda1.consultarContato(nome) >= 0){
                            System.out.println("Contato existe");
                        }
                    }
                    catch (loaine.cursojavabasico.aula47_52.ContatoNaoExisteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    loaine.cursojavabasico.aula47_52.Contato contatox = new loaine.cursojavabasico.aula47_52.Contato();
                    System.out.println("Digite o nome do contato: ");
                    contatox.setNome(scan.nextLine());
                    System.out.println("Digite o telefone: ");
                    contatox.setTelefone(scan.nextLine());
                    try {
                        agenda1.adicionarContato(contatox);
                        System.out.println("Contato adicionado com sucesso!");
                    }
                    catch (loaine.cursojavabasico.aula47_52.AgendaCheiaException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
            }
        }
    }
}

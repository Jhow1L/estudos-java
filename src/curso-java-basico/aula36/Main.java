package loaine.cursojavabasico.aula36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        loaine.cursojavabasico.aula36.Agenda agenda1 = new loaine.cursojavabasico.aula36.Agenda();
        loaine.cursojavabasico.aula36.Contato[] contatos = new loaine.cursojavabasico.aula36.Contato[3];

        System.out.printf("Digite o nome da sua agenda: ");
        agenda1.setName(scan.nextLine());

        for (int i = 0; i < contatos.length; i++){
            contatos[i] = new loaine.cursojavabasico.aula36.Contato();
            System.out.printf("Dige o nome do %d° contato: ", i + 1);
            contatos[i].setNome(scan.nextLine());
            loaine.cursojavabasico.aula36.Telefone[] telefones = new loaine.cursojavabasico.aula36.Telefone[2];
            for (int j = 0; j < telefones.length; j++){
                telefones[j] = new loaine.cursojavabasico.aula36.Telefone();
                System.out.printf("%d° telefone do contato\n", j + 1);
                System.out.printf("Digite o tipo do telefone: ");
                telefones[j].setTipo(scan.nextLine());
                System.out.printf("Digite o DDD: ");
                telefones[j].setDdd(scan.nextLine());
                System.out.printf("Digite o número: ");
                telefones[j].setNumero(scan.nextLine());
            }
            contatos[i].setTelefones(telefones);
            System.out.printf("Digite o email do contato: ");
            contatos[i].setEmail(scan.nextLine());
            System.out.println("------------------------------------");
        }

        agenda1.setContatos(contatos);

        agenda1.mostrarContatos();


    }
}

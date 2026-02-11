package loaine.cursojavabasico.aula27;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        loaine.cursojavabasico.aula27.Aluno aluno01 = new loaine.cursojavabasico.aula27.Aluno();

        System.out.printf("Nome: ");
        aluno01.nome = scan.nextLine();

        System.out.printf("Matricula: ");
        aluno01.matricula = scan.nextLine();

        for (int i = 0; i < aluno01.disciplinas.length; i++){
            System.out.printf("--- Nome da disciplina %d: ", i + 1);
            aluno01.disciplinas[i] = scan.nextLine();
            for (int j = 0; j < aluno01.notasDisciplinas[i].length; j++){
                System.out.printf("Nota do %d° bimestre: ", j + 1);
                aluno01.notasDisciplinas[i][j] = scan.nextDouble();
            }
            scan.nextLine();
            System.out.printf("\n");
        }


        System.out.printf("Verificando aprovação nas disciplinas: \n");

        for (int i = 0; i < aluno01.notasDisciplinas.length; i++){
            System.out.printf((aluno01.verificarAprovacaoDisciplina(i) ? "%s: Aprovado\n" : "%s: Reprovado\n"), aluno01.disciplinas[i]);
        }
    }
}

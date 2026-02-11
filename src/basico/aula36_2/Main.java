package basico.aula36_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        loaine.cursojavabasico.aula36_2.Curso curso1 = new loaine.cursojavabasico.aula36_2.Curso(5);

        loaine.cursojavabasico.aula36_2.Professor professor1 = new loaine.cursojavabasico.aula36_2.Professor("Jorge", "TI", "jorgeabreu@gmai.com");

        curso1.setNome("Ciência da Computação");
        curso1.setProfessor(professor1);
        curso1.setHorario("19:00 - 23:00");

        for (int i = 0; i < curso1.getAlunos().length; i++) {
            loaine.cursojavabasico.aula36_2.Aluno aluno = new loaine.cursojavabasico.aula36_2.Aluno();
            aluno.setNome("AAA");
            aluno.setMatricula("BBB");
            for (int j = 0; j < aluno.getNotas().length; j++) {
                double nota = 5 + rand.nextDouble() * 5;
                aluno.definirNota(nota, j);
            }
            curso1.definirAluno(aluno, i);
        }

        for (int i = 0; i < curso1.getAlunos().length; i++) {
            System.out.printf("Média do %d° aluno: %.1f | %s\n", i + 1, curso1.getAlunos()[i].calcularMedia(),
                    (curso1.getAlunos()[i].verificarAprovacao() ? "Aprovado" : "Reprovado"));
        }

        System.out.printf("Média da turma: %6.1f", curso1.calcularMediaTurma());
    }
}

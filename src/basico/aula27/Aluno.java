package basico.aula27;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    boolean verificarAprovacaoDisciplina(int disciplina){
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[disciplina].length; i++){
            soma += notasDisciplinas[disciplina][i];
        }
        double media = soma / notasDisciplinas[disciplina].length;

        return media >= 7;
    }


}

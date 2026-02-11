package basico.aula28_33;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        disciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notasDisciplinas = notasDisciplinas;
        this.disciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }


    private double calcularMedia(int disciplina) {
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[disciplina].length; i++) {
            soma += notasDisciplinas[disciplina][i];
        }

        return soma / notasDisciplinas[disciplina].length;

    }

    public boolean verificarAprovacaoDisciplina(int indiceDisciplina) {
        return calcularMedia(indiceDisciplina) >= 7;
    }


}

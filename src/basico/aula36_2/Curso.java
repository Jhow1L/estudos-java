package basico.aula36_2;

public class Curso {
    private String nome;
    private String horario;
    private loaine.cursojavabasico.aula36_2.Professor professor;
    private loaine.cursojavabasico.aula36_2.Aluno[] alunos;

    Curso(int quantidadeAlunos){
        alunos = new loaine.cursojavabasico.aula36_2.Aluno[quantidadeAlunos];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public loaine.cursojavabasico.aula36_2.Professor getProfessor() {
        return professor;
    }

    public void setProfessor(loaine.cursojavabasico.aula36_2.Professor professor) {
        this.professor = professor;
    }

    public loaine.cursojavabasico.aula36_2.Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(loaine.cursojavabasico.aula36_2.Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void definirAluno(loaine.cursojavabasico.aula36_2.Aluno aluno, int indice){
        this.alunos[indice] = aluno;
    }

    public double calcularMediaTurma(){
        double somaMediaAlunos = 0;
        for (int i = 0; i < this.alunos.length; i++){
            somaMediaAlunos += alunos[i].calcularMedia();
        }
        return somaMediaAlunos / alunos.length;
    }
}

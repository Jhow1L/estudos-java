package cursojavabasico.aula36_2;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    Aluno(){
        notas = new double[4];
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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void definirNota(double nota, int indice){
        this.notas[indice] = nota;
    }

    public double calcularMedia(){
        double somaNotas = 0;
        for (int i = 0; i < this.notas.length; i++){
            somaNotas += this.notas[i];
        }
        return somaNotas / this.notas.length;
    }

    public boolean verificarAprovacao(){
        return calcularMedia() >= 7;
    }
}

package loaine.cursojavabasico.aula37_43.exercicios.ex03;

public class Mamifero extends loaine.cursojavabasico.aula37_43.exercicios.ex03.Animal {
    private String alimento;

    Mamifero(){
        setAmbiente("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "alimento='" + getAlimento() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", comprimento=" + getComprimento() + " cm" +
                ", numeroPatas=" + getNumeroPatas() +
                ", cor='" + getCor() + '\'' +
                ", ambiente='" + getAmbiente() + '\'' +
                ", velocidadeMs=" + getVelocidadeMs() + " m/s" +
                '}';
    }
}

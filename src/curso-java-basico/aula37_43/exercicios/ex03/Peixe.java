package loaine.cursojavabasico.aula37_43.exercicios.ex03;

public class Peixe extends loaine.cursojavabasico.aula37_43.exercicios.ex03.Animal {
    private String caracteristicas;

    Peixe(){
        setNumeroPatas(0);
        setAmbiente("Mar");
        setCor("Cinzenta");
        setCaracteristicas("Barbatanas e cauda");
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public void nadar(){

    }

    @Override
    public String toString() {
        return "Peixe{" +
                "caracteristicas='" + caracteristicas + '\'' +
                ", nome='" + getNome() + '\'' +
                ", comprimento=" + getComprimento() + " cm" +
                ", numeroPatas=" + getNumeroPatas() +
                ", cor='" + getCor() + '\'' +
                ", ambiente='" + getAmbiente() + '\'' +
                ", velocidadeMs=" + getVelocidadeMs() + " m/s" +
                '}';
    }
}

package cursojavabasico.aula37_43.exercicios.ex03;

public class Main {
    public static void main(String[] args) {

        loaine.cursojavabasico.aula37_43.exercicios.ex03.Animal animal1 = new loaine.cursojavabasico.aula37_43.exercicios.ex03.Animal();

        animal1.setNome("Camelo");
        animal1.setComprimento(150);
        animal1.setCor("Amarelo");
        animal1.setAmbiente("Terra");
        animal1.setVelocidadeMs(2.0);

        loaine.cursojavabasico.aula37_43.exercicios.ex03.Peixe animal2 = new loaine.cursojavabasico.aula37_43.exercicios.ex03.Peixe();

        animal2.setNome("Tubarão");
        animal2.setComprimento(300);
        animal2.setVelocidadeMs(1.5);

        loaine.cursojavabasico.aula37_43.exercicios.ex03.Mamifero animal3 = new loaine.cursojavabasico.aula37_43.exercicios.ex03.Mamifero();

        animal3.setNome("Urso-do-canadá");
        animal3.setComprimento(180);
        animal3.setCor("Vermelho");
        animal3.setVelocidadeMs(0.5);
        animal3.setAlimento("Mel");

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
    }
}

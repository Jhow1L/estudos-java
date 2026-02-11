package loaine.cursojavabasico.aula44_46.ex01;

public class Circulo extends loaine.cursojavabasico.aula44_46.ex01.Figura2D {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14159265359 * (getRaio() * getRaio());
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}

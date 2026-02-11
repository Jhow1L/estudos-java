package basico.aula44_46.ex01;

public class Cilindro extends loaine.cursojavabasico.aula44_46.ex01.Figura3D {
    private double raio;
    private double altura;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (2 * 3.14159265359 * getRaio() * (getRaio() + getAltura()));
    }

    @Override
    public double calcularVolume() {
        return 3.14159265359 * (getRaio() * getRaio()) * getAltura();
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "raio=" + raio +
                ", altura=" + altura +
                '}';
    }
}

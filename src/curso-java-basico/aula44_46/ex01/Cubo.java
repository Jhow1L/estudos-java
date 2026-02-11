package loaine.cursojavabasico.aula44_46.ex01;

public class Cubo extends loaine.cursojavabasico.aula44_46.ex01.Figura3D {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * (getLado() * getLado());
    }

    @Override
    public double calcularVolume() {
        return getLado() * getLado() * getLado();
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "lado=" + lado +
                '}';
    }
}

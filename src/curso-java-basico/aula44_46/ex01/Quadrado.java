package loaine.cursojavabasico.aula44_46.ex01;

public class Quadrado extends loaine.cursojavabasico.aula44_46.ex01.Figura2D {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return getLado() * getLado();
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}

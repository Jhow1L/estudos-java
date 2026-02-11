package cursojavabasico.aula44_46.ex01;

public class Piramide extends loaine.cursojavabasico.aula44_46.ex01.Figura3D {
    private double lado;
    private double altura;
    private double apotema;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        double areaBase = getLado() * getLado();
        double areaLateral = 4 * (getLado() * getApotema() / 2);
        return areaBase + areaLateral;
    }

    @Override
    public double calcularVolume() {
        return (getLado() * getLado() * getAltura()) / 3;
    }

    @Override
    public String toString() {
        return "Piramide{" +
                "lado=" + lado +
                ", altura=" + altura +
                ", apotema=" + apotema +
                '}';
    }
}

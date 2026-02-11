package cursojavabasico.aula44_46.ex01;

public class Main {
    public static void main(String[] args) {
        loaine.cursojavabasico.aula44_46.ex01.FiguraGeometrica[] figuras = new loaine.cursojavabasico.aula44_46.ex01.FiguraGeometrica[6];

        loaine.cursojavabasico.aula44_46.ex01.Circulo circulo1 = new loaine.cursojavabasico.aula44_46.ex01.Circulo();
        circulo1.setRaio(5);

        loaine.cursojavabasico.aula44_46.ex01.Quadrado quadrado1 = new loaine.cursojavabasico.aula44_46.ex01.Quadrado();
        quadrado1.setLado(5);

        loaine.cursojavabasico.aula44_46.ex01.Triangulo triangulo1 = new loaine.cursojavabasico.aula44_46.ex01.Triangulo();
        triangulo1.setAltura(10);
        triangulo1.setBase(5);

        loaine.cursojavabasico.aula44_46.ex01.Piramide piramide1 = new loaine.cursojavabasico.aula44_46.ex01.Piramide();
        piramide1.setAltura(3);
        piramide1.setLado(2);
        piramide1.setApotema(4);

        loaine.cursojavabasico.aula44_46.ex01.Cilindro cilindro1 = new loaine.cursojavabasico.aula44_46.ex01.Cilindro();
        cilindro1.setAltura(10);
        cilindro1.setRaio(2);

        loaine.cursojavabasico.aula44_46.ex01.Cubo cubo1 = new loaine.cursojavabasico.aula44_46.ex01.Cubo();
        cubo1.setLado(5);

        figuras[0] = cilindro1;
        figuras[1] = quadrado1;
        figuras[2] = triangulo1;
        figuras[3] = piramide1;
        figuras[4] = circulo1;
        figuras[5] = cubo1;

        for (loaine.cursojavabasico.aula44_46.ex01.FiguraGeometrica figura : figuras){
            System.out.println(figura.toString());
            if (figura instanceof loaine.cursojavabasico.aula44_46.ex01.Figura2D || figura instanceof loaine.cursojavabasico.aula44_46.ex01.Figura3D){
                System.out.printf("Area: %f\n", ((loaine.cursojavabasico.aula44_46.ex01.DimensaoSuperficial) figura).calcularArea());
            }
            if (figura instanceof loaine.cursojavabasico.aula44_46.ex01.Figura3D){
                System.out.printf("Volume: %f\n", ((loaine.cursojavabasico.aula44_46.ex01.Figura3D) figura).calcularVolume());
            }

            System.out.println();
        }
    }

}

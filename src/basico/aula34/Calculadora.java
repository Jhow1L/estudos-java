package cursojavabasico.aula34;

public class Calculadora {

    public static double somar(double a, double b){
        return a + b;
    }

    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }

    public static double potencia(double numero, int n){
        double resultado = numero;
        for (int i = n; i > 1; i--){
            resultado *= numero;
        }
        return resultado;
    }

    public static int fatorial(int n) {
        int fatorial = 1;

        for (int i = n; i > 0; i--) {
            fatorial *= i;
        }

        return fatorial;
    }
}

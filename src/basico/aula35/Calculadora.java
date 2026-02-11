package cursojavabasico.aula35;

public class Calculadora {

    public static int fibonacci(int numero){
        if (numero < 2){
            return 1;
        }

        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
}

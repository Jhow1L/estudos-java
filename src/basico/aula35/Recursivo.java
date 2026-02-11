package basico.aula35;

public class Recursivo {

    public static int somaNumeros(int num){
        if (num == 1){
            return 1;
        }

        return num + somaNumeros(num - 1);
    }
}

package loaine.cursojavabasico.aula74;

public class TesteSemaforo {

    public static void main(String[] args) {

        loaine.cursojavabasico.aula74.Semaforo semaforo = new loaine.cursojavabasico.aula74.Semaforo();
        loaine.cursojavabasico.aula74.ThreadSemaforo sm1 = new loaine.cursojavabasico.aula74.ThreadSemaforo(semaforo);

        semaforo.ligarSemaforo();

        new Thread(sm1).start();

        for(int i = 1; i < 10; i++){
            sm1.esperarCorMudar();
        }

        semaforo.desligarSemaforo();

    }

}

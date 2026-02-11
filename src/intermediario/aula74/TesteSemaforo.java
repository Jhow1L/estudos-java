package intermediario.aula74;

public class TesteSemaforo {

    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo();
        ThreadSemaforo sm1 = new ThreadSemaforo(semaforo);

        semaforo.ligarSemaforo();

        new Thread(sm1).start();

        for(int i = 1; i < 10; i++){
            sm1.esperarCorMudar();
        }

        semaforo.desligarSemaforo();

    }

}

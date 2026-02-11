package intermediario.aula74;

public class ThreadSemaforo implements Runnable {

    private final Semaforo semaforo;
    private boolean corMudou;

    ThreadSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
        this.corMudou = false;
    }

    @Override
    public void run() {
        while (semaforo.isLigado()){
            try {
                System.out.println(semaforo.getCor());
                Thread.sleep(semaforo.getTempoEspera());
                semaforo.mudarCor();
                synchronized (this){
                    this.corMudou = true;
                    notify();
                }
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void esperarCorMudar(){
        while (!this.corMudou){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.corMudou = false;
    }


}

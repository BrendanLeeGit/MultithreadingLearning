public class PrintStuff implements Runnable {
    private MainCharacter m;

    public PrintStuff(MainCharacter m){
        this.m = m;
    }

    @Override
    public void run() {
        m.addElks();
        for (int i =0; i < 100000; i++){
            System.out.println("Sucker");
        }
        synchronized (m){
            m.notify();
        }

    }
}

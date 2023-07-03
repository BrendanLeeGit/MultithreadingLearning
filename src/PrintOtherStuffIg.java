public class PrintOtherStuffIg implements Runnable {
    private MainCharacter m;

    public PrintOtherStuffIg(MainCharacter m){
        this.m = m;
    }

    @Override
    public void run() {
        m.addElks();
        try {
            synchronized (m) {
                m.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 200; i++){
            System.out.println("No longer waiting.");
        }
    }
}

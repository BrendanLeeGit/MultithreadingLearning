
public class Main {
    public static void main(String[] args) throws Exception{
        //make one main object the threads act on
        MainCharacter m = new MainCharacter();

        //make the runnable objects
        PrintStuff p = new PrintStuff(m);
        PrintOtherStuffIg pO = new PrintOtherStuffIg(m);

        //create threads
        Thread thread = new Thread(p, "Thread one");
        Thread thread2 = new Thread(pO, "Thread two");

        //run threads
        thread.start();
        thread2.start();

        thread2.join();
        //Idk this was just funny to me
        System.out.println("bootylicker");

    }

}

public class MainCharacter{
    int elk;

    public MainCharacter(){
        elk = 0;
    }

    public synchronized void addElks(){
        elk++;
        System.out.println(elk);
    }
}

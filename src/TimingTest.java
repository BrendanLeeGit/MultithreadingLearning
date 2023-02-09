public class TimingTest {
    public static void main(String[] args){
        //Note, this timing method isn't super accurate if the time elapsed is less than around 15 ms
        //Also doesn't take into account how other operations on the OS might slow down the program
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for(int i = 0; i < 999999999; i++){
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}

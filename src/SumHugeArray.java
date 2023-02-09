import java.util.concurrent.Callable;
public class SumHugeArray implements Callable<Double>{
    public double sumArray(double[] inputArray){
        double sum = 0;
        for (double d : inputArray){
            sum += d;
        }
        return sum;
    }

    public Double call() throws Exception {
        double sum = 0;
        for (int i = 0; i < 5; i++){
            sum += i;
        }
        return sum;
    }
}

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
public class Main {
    public static void main(String[] args) throws Exception{
        Callable<Double> s = new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                System.out.println("Hello");
                return null;
            }
        };

    }

}

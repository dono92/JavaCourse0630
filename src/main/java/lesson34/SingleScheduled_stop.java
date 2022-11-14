package lesson34;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;


public class SingleScheduled_stop {
    static ScheduledFuture future;
    static ScheduledExecutorService exec ;
    static int n = 3;
    public static void main(String[] args) throws Exception {
        Runnable lotto = () -> {
            n--;
            System.out.println("Time : " + new Date() + "開始");
            int delay = new Random().nextInt(3000);
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
            }
            System.out.println("Time : " + new Date() + " Lotto : " + new Random().nextInt(100) + 
                    ",delay : " + delay);
            
            if ( n < 0) {
                future.cancel(false);
                exec.shutdown();
                
            }
        };
        exec = Executors.newSingleThreadScheduledExecutor();
        System.out.println("停3秒後執行");
        future = exec.scheduleWithFixedDelay(lotto, 3, 2, TimeUnit.SECONDS);
        //ScheduledFuture future = exec.scheduleAtFixedRate(lotto, 3, 2, TimeUnit.SECONDS);
        future.get();
    }
}

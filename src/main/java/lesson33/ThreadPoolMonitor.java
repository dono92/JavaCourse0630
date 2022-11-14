
package lesson33;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ThreadPoolMonitor {
    public static void main(String[] args) throws Exception {
        Callable shortTask = () -> {
            System.out.println("短任務結束");
            return null;
        };
        Callable longTask = () -> {
            System.out.println("長任務開始");
            Thread.sleep(5500);
            System.out.println("長任務結束");
            return null;
        };
        ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
        exec.submit(shortTask);
        exec.submit(shortTask);
        exec.submit(longTask);
        exec.submit(shortTask);
        exec.submit(longTask);
        exec.shutdown();
        
        while (!exec.awaitTermination(1, TimeUnit.SECONDS)) {            
            System.out.println("Pool還未關閉");
        }
        System.out.println("Pool已關閉");
    
    }
}

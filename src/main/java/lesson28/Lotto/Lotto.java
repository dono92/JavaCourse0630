
package lesson28.Lotto;

import java.util.Random;
import java.util.concurrent.Callable;


public class Lotto implements Callable<Integer>{

    public Lotto() {
    }

    @Override
    public Integer call() throws Exception {
    Thread.sleep(5000);  //模擬計算時間
    int num = new Random().nextInt(100);
    return num;
    
    } 
}

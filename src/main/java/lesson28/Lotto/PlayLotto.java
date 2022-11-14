
package lesson28.Lotto;

import java.util.concurrent.FutureTask;


public class PlayLotto {
    public static void main(String[] args) throws Exception {
            System.out.println("取得Lotto...");
            FutureTask<Integer> task = new FutureTask<>(new Lotto());
            new Thread(task).start();
            Integer num = task.get(); //取得Lotto的回傳值
            System.out.println("num = " + num);
      
    }
 
}


package lesson18.Daily;


public class DailyWork {
    public static void main(String[] args) {
        Manger manger = new Manger();
        manger.job();
        
        Manger.Memner memner = manger.new Memner();
        memner.job();
        
 
    }
}

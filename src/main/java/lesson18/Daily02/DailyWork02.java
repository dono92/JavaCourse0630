
package lesson18.Daily02;


public class DailyWork02 {
    public static void main(String[] args) {
        
       Manger02 manger02 = new Manger02();
       manger02.job();
       
       Manger02.Memner memner = manger02.new  Memner();
       memner.job();
       
       manger02.print();
        
    }
}


package lesson29;


public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Thread t1 = new Thread(new Withdraw(account, 4000), "小明");
        t1.start();
                
    }
}

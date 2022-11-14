
package lesson29;


public class Withdraw implements Runnable{
    
    private Account account;
    private int money;
    
    public Withdraw(Account account, int money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        // 進行提款
       account.withdraw(money);
    }
}


package lesson14;


public class Wolf implements IDog{

    @Override
    public void eat() {
        System.out.println("狗飼料");
    }

    @Override
    public int speed() {
        return 30;
    }
}

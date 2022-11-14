
package lesson1402;


public abstract class ADog02 implements IDog{

    @Override
    public  void eat() {
        System.out.println("狗飼料");
    }
    
    public abstract int getAvgLife();
}

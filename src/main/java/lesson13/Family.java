
package lesson13;



class Father {
    Number getsalary() {
        return 10_0000;
    }
}

class Son extends Father{

    @Override
    Number getsalary() {
        return 10_0000;
    }
}

public class Family {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getsalary());
    }
  
}

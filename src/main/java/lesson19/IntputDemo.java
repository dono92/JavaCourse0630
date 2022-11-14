
package lesson19;

import java.util.InputMismatchException;
import java.util.Scanner;


public class IntputDemo {
    public static void main(String[] args) {
        intput();
    }
    
    public static void intput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入數字,求出開根號的值");
        try {
            int x = scanner.nextInt();
            System.out.println(x +"開根號 =" + Math.sqrt(x));
        } catch (InputMismatchException e) {
            System.out.println("輸入不正確, e=" +e);
            System.out.println("請重新輸入");
            intput();
        }
        
    }
}

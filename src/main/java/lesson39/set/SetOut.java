
package lesson39.set;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class SetOut {
    public static void main(String[] args) {
        System.out.println("數學計算");
        System.out.println("正確答案在 answer.txt");
        try (FileOutputStream fos = new FileOutputStream("src/lesson39.set/answer.txt" , true);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            PrintStream out = new PrintStream(bos);) {
            
            System.out.println(out);
            System.out.println(10/2);
            System.out.println("Happy");
        
        } catch (Exception e) {
                System.out.println(e);
                
        } 
    } 
}

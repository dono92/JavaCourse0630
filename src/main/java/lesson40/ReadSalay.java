
package lesson40;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ReadSalay {
    public static void main(String[] args) {
        try ( FileInputStream fis = new FileInputStream("src/lesson40/serial.bin");
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            
                Salary salary = (Salary)ois.readObject();
                System.out.println(salary);
        
        } catch (Exception e) {
           
        }
    }
}

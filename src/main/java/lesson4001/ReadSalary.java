
package lesson4001;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ReadSalary {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/lesson4001/serial.bin");
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            
            Salary01 salary01 = (Salary01)ois.readObject();
            System.out.println(salary01);
            
        } catch (Exception e) {
        }  
    }
}

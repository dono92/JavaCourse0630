
package lesson4001;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class WriteSalary {
    public static void main(String[] args) {
       Salary01 salary01 = new Salary01();
       salary01.setName("Mary");
       salary01.setMoney(280000);
       
        try (FileOutputStream fos = new FileOutputStream("src/lesson4001/serial.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            
            oos.writeObject(salary01);
   
        } catch (Exception e) {
        } 
    }
}

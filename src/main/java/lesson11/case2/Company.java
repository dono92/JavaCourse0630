
package lesson11.case2;

import java.io.PrintStream;


public class Company {
    public static void main(String[] args) {
        Employee s1 = new Employee();  //多形
        Manager s2 = new Manager();
        Director s3 = new Director();
        
        printSalary(s3);
        
    }

   public static void printSalary(Employee emp) {
       System.out.println(emp.getSalary());
       System.out.println(emp.getClass());
        
        
            
    }
 }
 


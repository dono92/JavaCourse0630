
package lesson11.case2;

import java.util.Random;



public class Company03 {
    public static void main(String[] args) {
        Employee s1 = new Employee();  //多形
        Employee s2 = new  Manager();
        Manager s3 = new  Manager();
        
        
        printSalary(s2);
        printBudget((Manager)s2);
        printBudget(s3);
        
        Employee emp = geEmployee();
        System.out.println(emp.getSalary());
        System.out.println(emp.getClass());
        if (emp instanceof  Director) {
            ((Director)emp).budget();
            ((Director)emp).stockOptions();
        }else if (emp instanceof  Manager) {
            ((Manager)emp).budget();
            
        }
      }
    

        public static Employee geEmployee() {
           int n = new Random().nextInt(3); // 0,1,2
             switch (n) {
                case 0:
                    return new Employee();
                 case 1:
                     return new Manager();
                default:
                   return new Director();
                   
             }
        }
    public static void printSalary(Employee emp) {
        System.out.println(emp.getSalary());
        System.out.println(emp.getClass());
   
    }
        public static void printBudget(Manager emp) {
            emp.budget();
                
        
    }
}

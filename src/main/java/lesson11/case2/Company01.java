
package lesson11.case2;

public class Company01 {
    public static void main(String[] args) {
        Employee s1 = new Employee();   //多形
        Employee s2 = new Manager();
        Manager s3 = new Manager();
        
        printSalary(s1);
        printBudget(s2);
        printBudget(s3);
    }
    
    public static void printSalary(Employee emp) {
        System.out.println(emp.getSalary());
        System.out.println(emp.getClass());
    }
    
    public static void printBudget(Manager emp) {
          emp.budget();
         
    }
}


package lesson06;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        
        char sex = "A145784730".charAt(1);
        System.out.println(sex);
        switch (sex) {
            case '1':
                System.out.println("男生");
            case '2':
                System.out.println("女生");
                
            default:
                System.out.println("Error");
        }
        
        switch (sex) {
            case '1':
                System.out.println("養家");
            case '2':
                System.out.println("養孩子");
                break;
            default:
                System.out.println("Error");
                break;
        }
 
    }
}

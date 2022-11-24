
package lesson42;

import java.sql.Connection;
import java.sql.DriverManager;


public class CRUD {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:derby://localhost:1527/Demo";
        String user = "app";
        String password = "1234";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println( conn.isClosed() ? "已關閉" : "連線中");
        conn.close();
    }
     
    public static void read() {
        
    }
    
    public static void create() {
        
    }
}

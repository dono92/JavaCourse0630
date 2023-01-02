
package lesson42;

import java.sql.Connection;
import java.sql.DriverManager;


public class CRUD1 {
    
    private static Connection conn;
    
    public CRUD1() throws Exception{  //建構子
        String url = "jdbc:derby://localhost:1527/test";
        String user = "app";
        String password = "1234";
        conn =DriverManager.getConnection(url, user, password); //建立conn
        System.out.println(conn.isClosed() ? "已關閉" : "連線中");
    }
    
    public void read() {
    }
    
    public void create() {
    }

    @Override
    protected void finalize() throws Throwable {  //解構子
        if (conn != null) {
            conn.close();  //關閉conn
        }
    }
    
    public static void main(String[] args) throws Exception {
        CRUD1 crud1 = new CRUD1();
        crud1.read();
        
    } 
}

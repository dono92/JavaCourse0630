
package lesson42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class CRUD2 {
    private static Connection conn;

    public CRUD2() throws Exception {  //建構子
        String url = "jdbc:derby://localhost:1527/1527";
        String user = "app";
        String password = "1234";
        conn = DriverManager.getConnection(url, user, password);  //建立conn
        System.out.println(conn.isClosed() ? "已關閉" : "連線中");
    }
    
    public void read() throws Exception {
        String sql = "Select school, score, type from exam";
        Statement  stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while (rs.next()) {            
            String school = rs.getString("school");
            double score = rs.getDouble("score");
            int type = rs.getInt("type");
            System.out.printf("%s\t%.1f\t%d\t\n", school, score, type);
         }
    }
    
    public void create() {
        
    }

    @Override
    protected void finalize() throws Throwable {  //解構子
        if (conn != null) {
            conn.close(); //關閉conn
            
        }
    }
    
    public static void main(String[] args) throws Exception {
        CRUD2 crud2 = new CRUD2();
        crud2.read();
          
    }    
  }


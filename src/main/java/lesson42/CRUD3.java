
package lesson42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class CRUD3 {
  private static Connection conn;

    public CRUD3() throws Exception {  //建構子
        String url = "jdbc:derby://localhost:1527/1527";
        String user = "app";
       String password = "1234";
       conn =   DriverManager.getConnection(url, user, password);  //建立conn
        System.out.println(conn.isClosed() ? "已關閉" : "連線中");
    }
    
    public void read() throws Exception {
      String sql = "Select school, score, type from exam";
      Statement stmt = conn.createStatement();
       ResultSet rs = stmt.executeQuery(sql);
       
        while (rs.next()) {            
            String school = rs.getString("school");
            double score = rs.getDouble("score");
            int type = rs.getInt("type");
            System.out.printf("%s\t%.1f\t%d\t\n", school, score, type);
        }
    }
    
    public void create(String school, double  score, int type) throws Exception {
        String sql = "Insert into exam(school, score, type) value( ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, school);
        pstmt.setDouble(2, score);
        pstmt.setInt(3, type);
        int x = pstmt.executeUpdate();
        System.out.println("新增" + x + "筆");
    }

    @Override
    protected void finalize() throws Throwable {  //解構子
        if (conn != null) {
            conn.close();  //關閉conn
            
        }
    }
    
     public static void main(String[] args) throws Exception {
        CRUD3 crud3 = new CRUD3();
        crud3.create("泰山高中", 23.5, 3);
        Thread.sleep(100);
        crud3.read();
        
    }   
}

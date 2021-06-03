package firstsql;
import java.sql.*;
public class Firstsql {

   
    public static void main(String[] args) {
         String url="jdbc:mysql://localhost:8667/java"; 
                 String user="root";
                 String pass="root";
         try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection(url,user,pass);
             PreparedStatement ps=con.prepareStatement("insert into student value(?,?,?,?,?)");
             ps.setInt(1,500);
             ps.setString(2,"anant");
             ps.setString(3,"cs");
             ps.setInt(4,9);
             ps.executeUpdate();
             System.out.println("coneection successfully");
             
         }
         catch(Exception e){System.out.println(e);}
    }
    
}

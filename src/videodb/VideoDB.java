package videodb;
import java.sql.*;

public class VideoDB {
    public static Connection conn = null;
    public static Statement s;
    public static ResultSet rs;
    public static int vID=0, cID=0, rID=0;
    
    public static void main(String[] args) throws SQLException{
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                new JFrame().setVisible(true);
                } catch (SQLException e) {
                    System.out.println("Not visible!\n");
                    e.getStackTrace();
                }
            }
        });
       try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/VideoStore" , "root" , "password");
            System.out.println("Connection successful");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
           System.out.println("Connection failed");
           System.err.println ("Error message: " + e.getMessage ());
        }
    }
    void run() {
        try {
      JFrame other = new JFrame();
      System.out.println(other.getName());
      } catch (SQLException e) {
           System.out.println("Not running");
           System.err.println ("Error message: " + e.getMessage ());
        }
   }
}

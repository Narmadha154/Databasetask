package dbhandler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionDb {
    public static Connection createConnection() {
        Connection con=null;
        String url = "jdbc:mysql://localhost:3306/AccountDetails";
        String user = "root";
        String password = "Root@123";
        try {
            con= DriverManager.getConnection(url,user,password);
            if (con!= null) {
                System.out.println("Connected to the database AccountDetails");
            }
        }catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
        return con;
    }
}

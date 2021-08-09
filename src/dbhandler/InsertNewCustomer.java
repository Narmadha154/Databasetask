package dbhandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertNewCustomer {
    public static void insertInfo() {
       /* Connection con = ConnectionDb.createConnection();*/
        try (PreparedStatement pst = con.prepareStatement("Insert into CustomerInfo(Name,Mobile,Age)" + "values (?,?,?)")) {
            pst.setString(1,name);
            pst.setString(2, mobile);
            pst.setInt(3, age);
            int row = pst.executeUpdate();
            System.out.println(row);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        /*try (PreparedStatement st = con.prepareStatement("SELECT * from CustomerInfo" + "WHERE CusId>=?")) {
            st.setString(1,name);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Integer cusId = rs.getInt(1);
                System.out.println("Your CustomerId is: " + cusId);
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }*/
        try (PreparedStatement pst = con.prepareStatement("Insert into AccountInfo(CusId,Branch,Balance)" + " values (?,?,?)")) {
            pst.setInt(0, cusId);
            pst.setString(2, branch);
            pst.setDouble(3, balance);
            pst.executeUpdate();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}

}

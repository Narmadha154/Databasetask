package dbhandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertNewCustomer<object> {
    public static void insertInfo() {
       /* Connection con = ConnectionDb.createConnection();*/
        try (PreparedStatement pst = con.prepareStatement("Insert into CustomerInfo(Name,Mobile,Age)" + "values (?,?,?)")) {
            CustomerInfo[] customer=new CustomerInfo[0];
            for(CustomerInfo cus:customer){
            pst.setString(1,cus.getName());
            pst.setString(2,cus.getMobile());
            pst.setInt(3,cus.getAge());
            }
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
            AccountInfo[] account=new AccountInfo[0];
            for(AccountInfo accinfo:account){
            pst.setInt(0,accinfo.getCusId());
            pst.setString(2,accinfo.getBranch());
            pst.setDouble(3,accinfo.getBalance);
            }
            pst.executeUpdate();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}

}

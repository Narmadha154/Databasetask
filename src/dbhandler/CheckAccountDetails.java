package dbhandler;
import dbtask.AccountDetails;
import dbtask.AccountInfo;
import dbtask.CustomerInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CheckAccountDetails {
    try (Statement st = con.createStatement()){
        ResultSet rs = st.executeQuery("SELECT * from AccountInfo");
        while(rs.next()) {
            String accNo = rs.getString("AccountNo");
            String branch = rs.getString("Branch");
            Double balance = rs.getDouble("Balance");
            accInfo = new AccountInfo(accNo,branch,balance);
            innerHash.put(accNo, accInfo);
        }
    } catch (SQLException throwable) {
        System.out.println("some exception coming");
        throwable.printStackTrace();
    }
        for (String i : innerHash.keySet()) {
        AccountInfo info = innerHash.get(i);
        System.out.println(info.getAccNo() + " " + info.getBranch() + " " + info.getBalance());
    }
        try (Statement st = con.createStatement()) {
        ResultSet rs = st.executeQuery("SELECT * from CustomerInfo");
        while (rs.next()) {
            Integer cusId = rs.getInt("CusId");
            cusInfo = new CustomerInfo(cusId);
            outerHash.put(cusId, innerHash);
        }
        /*System.out.println(outerHash.get(CustomerInfo.getCusId()));*/
    } catch (SQLException throwable) {
        System.out.println("some exceptions coming");
        throwable.printStackTrace();
    }
}

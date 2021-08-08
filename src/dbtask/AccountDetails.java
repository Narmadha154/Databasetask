package src.dbtask;

import java.sql.*;
import java.util.HashMap;

public class AccountDetails {
    public static void  getAccountDetails() {
        HashMap<Integer, Object> outerHash = new HashMap();
       /* for(Object i:outerHash.keySet()){
            CustomerInfo cusInfo= (CustomerInfo) outerHash.get(i);
            int customerId=cusInfo.getCusId();
        }*/
        AccountInfo accInfo = null;
        outerHash.put(CustomerInfo.getCusId(), accInfo);
        HashMap<Object,AccountInfo> innerHash = new HashMap();
        CustomerInfo cusInfo;
        Statement st = null;
        ResultSet rs = null;
        Connection con = ConnectionDb.createConnection();
        try {
            PreparedStatement query = con.prepareStatement("enter you customer id:?");
            rs = query.executeQuery();
            while (rs.next()) {
                Integer accNo = rs.getInt("AccNo");
                String branch = rs.getString("Branch");
                Double balance = rs.getDouble("Balance");
                accInfo = new AccountInfo(accNo,branch,balance);
                innerHash.put(innerHash, accInfo);
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        for (Object i : innerHash.keySet()) {
            AccountInfo info = (AccountInfo) innerHash.get(i);
            System.out.println(info.getAccNo() + " " + info.getBranch() + " " + info.getBalance());
        }
    }
}

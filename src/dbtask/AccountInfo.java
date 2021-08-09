package dbtask;

public class AccountInfo {
    private int cusId;
    private int accNo;
    private String branch;
    private double balance;

    public AccountInfo(String accNo, String branch, Double balance) {
    }

    public AccountInfo(String branch, double balance) {
    }

    public int getCusId() {
        return cusId;
    }
    public void setCusId(int cusId) {
        this.cusId = cusId;
    }
    public int getAccNo() {
        return accNo;
    }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return cusId+" "+accNo+" "+branch+" "+balance;
    }
}

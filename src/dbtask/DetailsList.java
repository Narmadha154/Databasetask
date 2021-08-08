package src.dbtask;
import java.util.ArrayList;
import java.util.Scanner;

public class DetailsList {
    public static ArrayList<CustomerInfo> getCustomerInfo() {
        ArrayList<CustomerInfo> customer = new ArrayList<>();
        CustomerInfo obj = new CustomerInfo();
        /*int customerId=134;*/
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
       /* customerId=customerId+1;*/
        System.out.println("Enter your name:");
        String name = sc1.nextLine();
        System.out.println("Enter your mobile number:");
        String mobile = sc1.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        obj.setName(name);
        obj.setMobile(mobile);
        obj.setAge(age);
        customer.add(obj);
        /*System.out.println("Your customer Id is:" + customerId);*/
        return customer;
    }

    public static ArrayList<AccountInfo> getAccountInfo(){
        ArrayList<AccountInfo> account=new ArrayList<>();
        AccountInfo obj1=new AccountInfo();
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
       /* System.out.println("Enter your customer id:");
        int cusId= sc.nextInt();*/
        System.out.println("Enter the branch in which you want to create your account:");
        String branch= sc1.nextLine();
        System.out.println("Enter the initial deposit:");
        double deposit =sc.nextInt();
       /* obj1.setCusId(cusId);*/
        obj1.setBranch(branch);
        obj1.setBalance(deposit);
        account.add(obj1);
        return account;
    }
}

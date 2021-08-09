package dbtask;

import java.util.ArrayList;
import java.util.Scanner;
public class DetailsList {
    private static String name;
    private static String mobile;
    private static int age;
    private static String branch;
    private static double balance;
    private static int cusId;
    public static ArrayList<CustomerInfo> getCustomerInfo() {
        ArrayList<CustomerInfo> customer = new ArrayList<>();
        CustomerInfo obj = new CustomerInfo();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc1.nextLine();
        System.out.println("Enter your mobile number:");
        mobile = sc1.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        obj.setName(name);
        obj.setMobile(mobile);
        obj.setAge(age);
        customer.add(obj);
        return customer;
    }

    public static ArrayList<AccountInfo> getAccountInfo() {
        ArrayList<AccountInfo> account = new ArrayList<>();
        AccountInfo obj1 = new AccountInfo(branch, balance);
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the branch in which you want to create your account:");
        String branch = sc1.nextLine();
        System.out.println("Enter the initial deposit:");
        double deposit = sc.nextDouble();
        obj1.setBranch(branch);
        obj1.setBalance(deposit);
        account.add(obj1);
        return account;
    }

}

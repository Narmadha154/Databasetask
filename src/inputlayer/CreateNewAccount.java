package inputlayer;

import dbtask.CustomerInfo;

import java.util.Scanner;

public class CreateNewAccount {
    public static CustomerInfo createAccount() {
        String name;
        String mobile;
        int age;
        String branch;
        double balance;
        int cusId;
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
        return obj;
    }
}

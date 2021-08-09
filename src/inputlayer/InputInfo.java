package dbtask;

import java.util.Scanner;
public class InputInfo {
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Are you an Existing customer or a new customer ?");
        System.out.println("enter 1 for existing customer or enter 2 for new customer");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter your customer Id:");
            int customerId=sc.nextInt();
            System.out.println("Select 1 to check account details or Select 2 to create a new account");
            int select=sc.nextInt();
            if(select==1){
                System.out.println("Account details");

            }
            else if(select==2){
                System.out.println("Create your customer id");
                DetailsList.getCustomerInfo();
                System.out.println("enter your customer id to create a new account");
                DetailsList.getAccountInfo();
            }
        }
        else if(choice==2){
            System.out.println("Create new account");
            DetailsList.getCustomerInfo();
            DetailsList.getAccountInfo();
        }
        else{
            System.out.println("Quit");
        }
    }
}

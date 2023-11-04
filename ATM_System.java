package com.company;

import java.util.Scanner;

class ATM{
    String UserID;
    String UserPIN;
    double balance=0;
    String transactionhistroy=" ";
    boolean islogin=false;

    public void register(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter UserID:");
        this.UserID=sc.next();
        System.out.print("Enter the PIN:");
        this.UserPIN=sc.next();
        System.out.print("Add Some Balance: ");
        this.balance=sc.nextDouble();
        this.transactionhistroy="Rs." + this.balance + "added to the account \n";
        System.out.println("Registretion Completed Successfully");
    }
//    public boolean login(){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter Your UserID:");
//        String a=sc.next();
//        System.out.print("Enter Your PIN:");
//        String b=sc.next();
//        if(this.UserID==a && this.UserPIN==b){
//            this.islogin=true;
//        }
//        else{
//            System.out.println("UserID not Found.");
//        }
//        return this.islogin;
//    }

    public void withdraw(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Amount You want to Withdraw: ");
            double a=sc.nextDouble();
            if(a<=this.balance){
                this.balance=this.balance-a;
                System.out.println("Withdrawn Successfully.");
                String s="Rs." +a+ " Withdrawn \n";
                this.transactionhistroy=this.transactionhistroy.concat(s);
            }
            else{
                System.out.println("You don't have enough money to withdraw this amount.");
            }
    }

    public void deposit(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter an amount to Deposit in your account balance:");
            double a=sc.nextDouble();
            this.balance=this.balance+a;
            System.out.println("Deposit Successfully.");
            String s="Rs." +a+ " deposited \n";
            this.transactionhistroy=this.transactionhistroy.concat(s);
    }

    public void transfer(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter an Amount to transfer:");
            double a=sc.nextDouble();
            System.out.print("Enter Recipent's name:");
            String name=sc.next();
            if(a<=this.balance){
                if(a<50000){
                    this.balance=this.balance-a;
                    System.out.println("Transfered Successfully.");
                    String s="Rs."+a+" transfered to "+ name+"\n";
                    this.transactionhistroy=this.transactionhistroy.concat(s);
                }
            }
    }

    public void cheekbalance(){
        System.out.println("Your Current balance is: Rs."+this.balance);
    }

    public void transactions(){
        System.out.println(this.transactionhistroy);
    }
}
public class ATM_System {
    public static void main(String args[]){
        System.out.println("\n**********    WELCOME TO SBI ATM SYSTEM   **********\n");
        ATM ankesh=new ATM();
        ankesh.register();
        boolean flag=true;
        while(true){
                System.out.println("\n1.Withdraw \n2.Deposit \n3.Transfer \n4.Check Balance \n5.Transaction History \n6.Exit");
                System.out.print("Enter Your Choice:");
                Scanner sc=new Scanner(System.in);
                int choice=sc.nextInt();
                if(choice==1){
                    ankesh.withdraw();
                }
                else if(choice==2){
                    ankesh.deposit();
                }
                else if(choice==3){
                    ankesh.transfer();
                }
                else if(choice==4){
                    ankesh.cheekbalance();
                }
                else if(choice==5){
                    ankesh.transactions();
                }
                else if(choice==6){
                    break;
                }
                else{
                    System.out.println("Your Choice is not Valid.");
                }
        }
        }
}
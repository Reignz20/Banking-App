package com.company.bank;
import java.util.Scanner;

public class Account {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;


 Account(String cname, String cid){
    customerName = cname;
    customerID = cid;

 }

void deposit(int amount){
     if(amount != 0){
         balance = balance + amount;
         previousTransaction =+ amount;
     }
}

void withdraw ( int amount){
     if(amount != 0) {
         balance = balance - amount;
         previousTransaction =-amount;
     }
}

void getPreviousTransaction() {
    if(previousTransaction > 0){
        System.out.println("Deposited: $" + previousTransaction);
    }else if(previousTransaction < 0){
        System.out.println("Withdrawn: $" + Math.abs(previousTransaction));
    }else{
        System.out.println("No transaction occured");
    }
}


    void displayMenu(){
     char option = '\0';
     Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! " + customerID + "!");
        System.out.println("your ID is: " + customerID);
        System.out.println("");
        System.out.println("What would you like to do? ");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Exit");


        do{
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();


            switch(option){

                case 'A':
                    System.out.println("====================");
                    System.out.println("Balance: $" + balance);
                    System.out.println("====================");
                    break;

                case 'B':
                    System.out.println("Enter your deposit amount: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    break;

                case 'C':
                    System.out.println("Enter your withdrawal amount: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    break;

                case 'D':
                    System.out.println("====================");
                    getPreviousTransaction();
                    System.out.println("====================");
                    break;

            }
        }while(option != 'E' );
            System.out.println("Thank you for banking with us today!");
        }
    }

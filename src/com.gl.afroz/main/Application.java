package com.gl.afroz.main;

import com.gl.afroz.bank.Banking;
import com.gl.afroz.customer.Customer;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bankAccountNo, password;
        Customer customer1 = new Customer("12345", "123");
        Customer customer2 = new Customer("12346", "124");

        Banking banking = new Banking();

        System.out.println("Welcome to the login page");
        System.out.println();

        System.out.println("Enter the bank Account no");
        bankAccountNo = sc.nextLine();

        System.out.println("Enter the password for the corresponding bank account no ");
        password = sc.nextLine();

        if (customer1.getBankAccountNo().equals(bankAccountNo) && customer1.getPassword().equals(password)) {
            int option;
            do {
                System.out.println("----------------------------");
                System.out.println("Enter the operation number that you want to perform");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("0. Logout");
                System.out.println("----------------------------");
                option = sc.nextInt();
                switch (option) {
                    case 0:
                        option = 0;
                        break;
                    case 1: {
                        banking.checkBalance();
                        break;
                    }
                    case 2: {
                        System.out.println("Enter the amount to deposit");
                        int amount = sc.nextInt();
                        banking.deposit(amount);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the amount to withdraw");
                        int amount = sc.nextInt();
                        banking.withdraw(amount);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter the amount to transfer");
                        int amount = sc.nextInt();
                        if (amount <= 0) {
                            System.out.println("please enter valid amount");
                        } else {
                            banking.transfer(amount);
                        }
                        break;
                    }
                    default:
                        System.out.println("Please give valid option....");
                }
            } while (option != 0);
            System.out.println("You have successfully logged out....");
            sc.close();
        } else {
            System.out.println("Invalid ");
        }
    }
}

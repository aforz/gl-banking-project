package com.gl.afroz.bank;

import com.gl.afroz.otp.OTPGenerator;

import java.util.Scanner;

public class Banking {

    private int balance = 1000;
    private int otp;

    Scanner sc = new Scanner(System.in);

    public void checkBalance() {
        System.out.println(balance);
    }

    public void deposit(int amount) {
        if (amount > 0) {
            System.out.println("amount " + amount + " deposited.");
            balance += amount;
        } else {
            System.out.println("amount must be greater than 0.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount < balance) {
            System.out.println("amount " + amount + " withdrawn successfully.");
            balance -= amount;
        } else {
            System.out.println("amount must be less than or equal to the balance.");
        }
    }

    public void transfer(int amount) {
        OTPGenerator otpGenerator = new OTPGenerator();
        int generatedOtp = otpGenerator.generateOTP();
        System.out.println("please use this otp to verify transfer : " + generatedOtp);
        System.out.println("Please enter generated otp.");
        int otp = sc.nextInt();
        if (otp == generatedOtp) {
            if (amount > 0 && amount <= balance) {
                System.out.println("amount " + amount + " transferred successfully.");
                balance -= amount;
            } else {
                System.out.println("amount must be less than or equal to the balancer");
            }
        } else {
            System.out.println("OTP is Invalid....");
        }
    }
}

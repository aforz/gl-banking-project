package com.gl.afroz.customer;

public class Customer {
    private String bankAccountNo;
    private String password;

    public Customer(String bankAccountNo, String password) {
        this.bankAccountNo = bankAccountNo;
        this.password = password;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

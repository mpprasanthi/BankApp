package com.example.bank_app;

public class BankApp {

    public static void main(String[] args){
    BankAccount customerAcct = new BankAccount(100,200);
    customerAcct.getCheckingBalance();
    customerAcct.getSavingsBalance();
    customerAcct.withDrawals(50);
    customerAcct.depositAmt(100);
    }
}

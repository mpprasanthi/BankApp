package com.example.bank_app;

public class BankAccount {
    double checkingBalance = 0.00;
    double savingsBalance = 0;
    final double checkingOpeningDeposit;
    final double savingsOpeningDeposit;

    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit) {
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;
        checkingBalance = checkingBalance + checkingOpeningDeposit;
    }
    public double getCheckingBalance() {
        System.out.println("Balance is :" + checkingBalance);
        return 0;
    }
}

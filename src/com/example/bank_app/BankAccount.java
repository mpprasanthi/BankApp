package com.example.bank_app;

public class BankAccount {
    double checkingBalance = 0.00;
    double savingsBalance = 0;
    final double checkingOpeningDeposit;
    final double savingsOpeningDeposit;
    double newCheckingBalance;

    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit) {
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;
        checkingBalance = checkingBalance + checkingOpeningDeposit;
        savingsBalance = savingsBalance + savingsOpeningDeposit;
    }
    public double getCheckingBalance() {
        System.out.println("Checking Balance is :" + checkingBalance);
        return 0;
    }
    public double getSavingsBalance() {
        System.out.println("Savings Balance is :" + savingsBalance);
        return 0;
    }
    public void withDrawals(double withdrawalAmt) {
        if(withdrawalAmt > checkingBalance){
            System.out.println("Withdraw amount is greater than Checking Balance");
            return;
        }
        newCheckingBalance = checkingBalance - withdrawalAmt;
        if(newCheckingBalance <= 0){
            System.out.println("Insufficient Balance to withdraw");
        }else {
            System.out.println("New Balance is :" + newCheckingBalance);
        }
    }
    public void depositAmt(double depAmt) {
        newCheckingBalance = newCheckingBalance + depAmt;
        System.out.println("Checking Balance after deposit is:"+ newCheckingBalance);
    }

}

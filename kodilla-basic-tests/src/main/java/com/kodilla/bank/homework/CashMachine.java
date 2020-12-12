package com.kodilla.bank.homework;

public class CashMachine {

    public CashMachine() {
        this.balance = 0;
        this.depositCount = 0;
        this.withdrawalCount = 0;
        this.transactions = new double[0];
    }

    private double balance;
    private int depositCount;
    private int withdrawalCount;
    private double[] transactions;

    public double getBalance() {
        return this.balance;
    }

    public int getDepositCount() {
        return this.depositCount;
    }

    public int getWithdrawalCount() {
        return this.withdrawalCount;

    }

    public void addTransaction(double transactionAmount) {

        if (this.balance + transactionAmount < 0) {
            return;
        }

        if(transactionAmount == 0) {
            return;
        }

        if(transactionAmount > 0) {
            this.depositCount++;
        }

        if(transactionAmount < 0) {
            this.withdrawalCount++;
        }

        this.balance += transactionAmount;

        // Store new transaction in array (make array bigger)
        double[] newTab = new double[this.depositCount + this.withdrawalCount];
        System.arraycopy(this.transactions, 0, newTab, 0, this.transactions.length);
        newTab[this.depositCount + this.withdrawalCount - 1] = transactionAmount;
        this.transactions = newTab;
    }

}


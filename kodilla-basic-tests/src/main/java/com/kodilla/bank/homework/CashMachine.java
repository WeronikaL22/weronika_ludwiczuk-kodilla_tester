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

    public double getAverageAtmsDeposit() {
        if (this.transactions.length == 0) {
            return 0;}

            int count = 0;
            double sum = 0;
            for (int i = 0; i < this.transactions.length; i++) {
                if (this.transactions[i] > 0) {
                    count++;
                    sum += this.transactions[i];
                }
            }
            return sum / (double) count;
        }

        public double getAverageAtmsWithdrawal () {
            if (this.transactions.length == 0) {
                return 0;}

            int count = 0;
            double sum = 0;
            for (int i = 0; i < this.transactions.length; i++) {
                if (this.transactions[i] < 0) {
                    count++;
                    sum += this.transactions[i];
                }
            }
            return sum / (double) count;
        }

        public void addTransaction ( double transactionAmount){

            if (this.balance + transactionAmount < 0) {
                return;
            }

            if (transactionAmount == 0) {
                return;
            }

            if (transactionAmount > 0) {
                this.depositCount++;
            }

            if (transactionAmount < 0) {
                this.withdrawalCount++;
            }

            this.balance += transactionAmount;
            double[] newTab = new double[this.depositCount + this.withdrawalCount];
            System.arraycopy(this.transactions, 0, newTab, 0, this.transactions.length);
            newTab[this.depositCount + this.withdrawalCount - 1] = transactionAmount;
            this.transactions = newTab;
        }

    }







package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public int getDepositTransactionCount() {
        int bankDepositCount = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            CashMachine cashMachine = this.cashMachines[i];
            int depositCount = cashMachine.getDepositCount();
            bankDepositCount += depositCount;
        }
        return bankDepositCount;
    }

    public int getWithdrawalTransactionCount() {
        int bankWithdrawalCount = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            CashMachine cashMachine = this.cashMachines[i];
            int withdrawalCount = cashMachine.getWithdrawalCount();
            bankWithdrawalCount += withdrawalCount;
        }
        return bankWithdrawalCount;
    }

    public double getAverageDeposit() {
        double sum = 0;
        int numberOfDeposits = 0;

        for(int i = 0; i < this.cashMachines.length; i++) {
            double[] transactions = this.cashMachines[i].getTransactions();
            for(int j = 0; j < transactions.length; j++) {
                if(transactions[j] > 0) { // if it a deposit
                    sum += transactions[j];
                    numberOfDeposits++;
                }
            }
        }

        if(numberOfDeposits == 0) {
            return 0;
        }

        return sum / (double) numberOfDeposits;
    }

     public double getAverageWithdrawal() {
         double sum = 0;
         int numberOfWithdrawals = 0;

         for(int i = 0; i < this.cashMachines.length; i++) {
             double[] transactions = this.cashMachines[i].getTransactions();
             for(int j = 0; j < transactions.length; j++) {
                 if(transactions[j] < 0) { // if it a withdrawal
                     sum += transactions[j];
                     numberOfWithdrawals++;
                 }
             }
         }

         if(numberOfWithdrawals == 0) {
             return 0;
         }

         return sum / (double) numberOfWithdrawals;
     }


        public double getAtmsBalance () {
                double bankBalance=0;

        for (int i = 0; i < this.cashMachines.length; i++) {
             CashMachine cashMachine = this.cashMachines[i];
             double atmBalance = cashMachine.getBalance();
             bankBalance += atmBalance;
        }
            return bankBalance;
    }
}




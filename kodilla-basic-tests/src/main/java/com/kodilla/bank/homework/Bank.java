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
        if (this.cashMachines.length == 0) {
            return 0;}

            double sum = 0;
            for (int i = 0; i < this.cashMachines.length; i++) {
                sum += this.cashMachines[i].getAverageAtmsDeposit();
            }
            return sum/ (double) this.cashMachines.length;
    }

     public double getAverageWithdrawal(){
         if (this.cashMachines.length == 0) {
             return 0;}

         double sum = 0;
         for (int i = 0; i < this.cashMachines.length; i++) {
             sum += this.cashMachines[i].getAverageAtmsWithdrawal();
         }
         return sum/ (double) this.cashMachines.length;
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




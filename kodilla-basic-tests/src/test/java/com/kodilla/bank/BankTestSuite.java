package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void WhenBankWithTwoEmptyCashMachinesCreated_ThenBalanceIsZero (){
        CashMachine[] cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine();
        cashMachines[1] = new CashMachine();

        Bank bank = new Bank(cashMachines);
        double balance = bank.getAtmsBalance();
        assertEquals(0, balance);
    }

    @Test
    public void WhenBankWithTwoEmptyCashMachinesCreated_ThenAverageDepositAndWithdrawalAreZero (){
        CashMachine[] cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine();
        cashMachines[1] = new CashMachine();

        Bank bank = new Bank(cashMachines);
        double avgDeposit = bank.getAverageDeposit();
        assertEquals(0, avgDeposit);

        double avgWithdrawal = bank.getAverageWithdrawal();
        assertEquals(0, avgWithdrawal);
    }

    @Test
    public void WhenBankWithTwoEmptyCashMachinesCreated_ThenDepositAndWithdrawalCountsAreZero() {
        CashMachine[] cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine();
        cashMachines[1] = new CashMachine();

        Bank bank = new Bank(cashMachines);
        int depositCount = bank.getDepositTransactionCount();
        assertEquals(0, depositCount);

        double withdrawalCount = bank.getWithdrawalTransactionCount();
        assertEquals(0, withdrawalCount);
    }

    @Test
    public void WhenBankWithTwoNonemptyCashMachinesCreated_ThenBankBalanceIsEqualToSumOfAtmBalances() {
        CashMachine[] cashMachines = new CashMachine[2];
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-2);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(3);
        cashMachine2.addTransaction(-1);

        cashMachines[0] = cashMachine1;
        cashMachines[1] = cashMachine2;

        Bank bank = new Bank(cashMachines);

        double bankBalance = bank.getAtmsBalance();

        assertEquals(100, bankBalance);
    }

    @Test
    public void WhenBankWithTwoNonemptyCashMachinesCreated_ThenDepositAndWithdrawalCountIsEqualToSumOfAtmsDepositAndWithdrawalCounts() {
        CashMachine[] cashMachines = new CashMachine[2];
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(22);
        cashMachine1.addTransaction(2);
        cashMachine1.addTransaction(-2);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(3);
        cashMachine2.addTransaction(-1);

        cashMachines[0] = cashMachine1;
        cashMachines[1] = cashMachine2;

        Bank bank = new Bank(cashMachines);

        int depositCount = bank.getDepositTransactionCount();
        assertEquals(4, depositCount);

        int withdrawalCount = bank.getWithdrawalTransactionCount();
        assertEquals(2, withdrawalCount);
    }

}

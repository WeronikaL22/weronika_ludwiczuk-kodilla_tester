package com.kodilla.bank;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void WhenCashMachineCreated_ThenBalanceIsZero() {
        CashMachine cashMachine = new CashMachine();
        double balance = cashMachine.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void WhenCashMachineCreated_ThenNumberOfTransactionsIsZero() {
        CashMachine cashMachine = new CashMachine();
        double depositCount = cashMachine.getDepositCount();
        assertEquals(0, depositCount);
        double withdrawalCountCount = cashMachine.getWithdrawalCount();
        assertEquals(0, withdrawalCountCount);
    }

    @Test
    public void WhenSingleAmountDeposited_ThenBalanceIsEqualToAmount() {
        CashMachine cashMachine = new CashMachine();
        double amount = 50;
        cashMachine.addTransaction(amount);
        double balance = cashMachine.getBalance();
        assertEquals(amount, balance);
    }

    @Test
    public void WhenSingleAmountDeposited_ThenDepositCountIsEqualTo1() {
        CashMachine cashMachine = new CashMachine();
        double amount = 5;
        cashMachine.addTransaction(amount);
        int depositCount = cashMachine.getDepositCount();
        assertEquals(1, depositCount);
    }

    @Test
    public void WhenTwoAmountsDeposited_ThenBalanceIsEqualToSumOfAmounts()
    {
        CashMachine cashMachine = new CashMachine();
        double amount1 = 5;
        cashMachine.addTransaction(amount1);
        double amount2 = 22;
        cashMachine.addTransaction(amount2);
        double balance = cashMachine.getBalance();
        assertEquals(27, balance);
    }

    @Test
    public void WhenDepositedAndWithdrawn_ThenBalanceIsEqualToSumOfAmounts()
    {
        CashMachine cashMachine = new CashMachine();
        double amount1 = 50;
        cashMachine.addTransaction(amount1);
        double amount2 = -25;
        cashMachine.addTransaction(amount2);
        double balance = cashMachine.getBalance();
        assertEquals(25, balance);
    }

    @Test
    public void WhenWithdrawalIsGreaterThanCurrentBalance_ThenTransactionIsNotAdded() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(24);
        cashMachine.addTransaction(-26);
        int withdrawalCount = cashMachine.getWithdrawalCount();
        assertEquals(0, withdrawalCount);
        int depositCount = cashMachine.getDepositCount();
        assertEquals(1, depositCount);
    }

    @Test
    public void WhenZeroAmountIsDeposited_ThenTransactionIsNotAdded() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(0);
        int withdrawalCount = cashMachine.getWithdrawalCount();
        assertEquals(0, withdrawalCount);
        int depositCount = cashMachine.getDepositCount();
        assertEquals(0, depositCount);
    }

    @Test
    public void WhenZeroAmountDeposited_ThenAverageAtmsDepositIsZero(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(0);

        double averageAtmsDeposit = cashMachine.getAverageAtmsDeposit();
        assertEquals(0, averageAtmsDeposit);
    }

   @Test
   public void WhenZeroAmountWithdrawn_ThenAverageAtmsWithdrawalIsZero(){
       CashMachine cashMachine = new CashMachine();
       cashMachine.addTransaction(0);

       double averageAtmsWithdrawal =cashMachine.getAverageAtmsWithdrawal();
       assertEquals(0,averageAtmsWithdrawal);

    }
    @Test
    public void WhenAmountsDepositedAndWithdrawn_TheAverageDepositsAndWithdrawalsAreCalculatedSeparately(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(56);
        cashMachine.addTransaction(41);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-4);

        double averageAtmsWithdrawal =cashMachine.getAverageAtmsWithdrawal();
        assertEquals(-12,averageAtmsWithdrawal);
        double averageAtmsDeposit = cashMachine.getAverageAtmsDeposit();
        assertEquals(48.5,averageAtmsDeposit);
    }

}

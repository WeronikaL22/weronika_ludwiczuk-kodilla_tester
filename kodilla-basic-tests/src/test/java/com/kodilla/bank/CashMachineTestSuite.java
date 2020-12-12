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
}

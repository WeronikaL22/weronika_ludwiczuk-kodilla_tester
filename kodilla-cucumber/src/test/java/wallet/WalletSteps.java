package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet=new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals(200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier= new Cashier(cashSlot);
            cashier.withdraw(wallet,30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30,cashSlot.getContents());
        });

        When("I request $250", () -> {
            Cashier cashier= new Cashier(cashSlot);
            cashier.withdraw(wallet,250);

        });
        Given("I have deposited -$50 in my wallet", () -> {
            wallet.deposit(-50);
            Assert.assertEquals(0,wallet.getBalance());
        });

        When("I request $20", () -> {
            Cashier cashier= new Cashier(cashSlot);
            cashier.withdraw(wallet,20);
        });

        Then("No money should be dispensed", () -> {
            Assert.assertEquals(0,cashSlot.getContents());
        });
        Then("No money should be deposited or dispensed", () -> {
            Assert.assertEquals(0,cashSlot.getContents());
        });



    }
}

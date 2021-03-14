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
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170,  wallet.getBalance());
        });

        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals(100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Cashier cashier = new Cashier(cashSlot);
            Assert.assertEquals("You have insufficient funds to withdraw money",cashier.withdraw(wallet,200));
        });

        When("I check the balance of my wallet", () -> {
            wallet.getBalance();
        });

        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals("Your balance is $100",wallet.balanceMessage());
        });

    }
}

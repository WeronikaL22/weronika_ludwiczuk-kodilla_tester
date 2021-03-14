package wallet;

public class Cashier {
    private CashSlot cashSlot;
    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String withdraw(Wallet wallet, int amount) {
        if (amount > wallet.getBalance())
            return "You have insufficient funds to withdraw money";
        else
            wallet.debit(amount);
        cashSlot.dispense(amount);
        return "You balance is" + wallet.getBalance() + "You can withdraw money";
    }

}

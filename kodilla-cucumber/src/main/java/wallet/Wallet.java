package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet(){
    }

    public void deposit(int money){
        if(money <=0)
            balance =0;
        else
        this.balance +=money;

    }
    public int getBalance(){
        return balance;
    }

    public String balanceMessage(){
        return "Your balance is $" + balance;
    }

    public void debit(int money) {
        this.balance -= money;
    }



}

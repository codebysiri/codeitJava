package Ex0209;

public class BankAccount {
    private int balance;
    private Person owner;

    public BankAccount(int pBalance) {
        if (pBalance < 0) {
            balance = 0;
        } else {
            balance = pBalance;
        }
    }

    public BankAccount(Person pOwner) {
        owner = pOwner;
        balance = 0;
    }

    public BankAccount(int pBalance, Person pOwner) {
        owner = pOwner;
        if (pBalance < 0) {
            balance = 0;
        } else {
            balance = pBalance;
        }
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int pBalance) {
        balance = pBalance;
    }

    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person pOwner) {
        owner = pOwner;
    }


    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount) {
        boolean success;
        if(amount < 0 || amount > balance) {
            success = false;
        } else {
            balance = balance - amount;
            to.balance = to.balance + amount;
            success  = true;
        }
        System.out.println(success + " - from: " + owner.getName() + ", to: " + to.owner.getName() + ", amount: " + amount + ", balance: " + balance);
        return success;
    }

}

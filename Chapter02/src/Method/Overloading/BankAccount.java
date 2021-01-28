package Method.Overloading;

public class BankAccount {
    private int balance;
    private Person owner;

    public void setBalance(int newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner(Person newOwner) {
        owner = newOwner;
    }

    public Person getOwner() {
        return owner;
    }

    boolean deposit (int amount) {
        if((amount >= 0) && (owner.getCashAmount() > amount)) {
            owner.setCashAmount(owner.getCashAmount() - amount);
            balance = balance + amount;
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        } else {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
    }

    boolean withdraw (int amount) {
        if((amount >= 0 && balance > amount)) {
            balance = balance - amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        } else {
            System.out.println("출금실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
    }

    public boolean transfer(BankAccount to, int amount) {
        boolean success;
        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance = balance - amount;
            to.balance = to.balance + amount;
            success = true;
        }
        System.out.println(success + " - from: " + owner.getName() + ", to: " + to.owner.getName() + ", amount: " + amount + ", balance: " + balance);
        return success;
    }

    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }


}
package Ex0203;

public class BankAccount {

    private int balance;
    private Person owner;

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


    boolean deposit(int amount) {
        if(owner.getCashAmount() < amount || amount < 0) {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        } else {
            balance = balance + amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.println("입금 성공입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }

    boolean withdraw(int amount) {
        if(balance < amount || amount < 0) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        } else {
            balance = balance - amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println("입금 성공입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }
}

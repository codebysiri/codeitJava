// 접근 제어자 연습

public class BankAccount01 {
    private int balance;
    private Person01 owner;


    public void setBalance(int newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner(Person01 newOwner) {
        owner = newOwner;
    }

    public Person01 getOwner() {
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
}

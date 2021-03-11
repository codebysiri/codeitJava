package Ex0108;

public class BankAccount {
    int balance;
    Person owner;

    boolean deposit(int amount) {
        if(owner.cashAmount < amount || amount < 0) {
           System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
           return false;
        } else {
            balance = balance + amount;
            owner.cashAmount = owner.cashAmount - amount;
            System.out.println("입금 성공입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return true;
        }
    }

    boolean withdraw(int amount) {
        if(balance < amount || amount < 0) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return false;
        } else {
            balance = balance - amount;
            owner.cashAmount = owner.cashAmount + amount;
            System.out.println("입금 성공입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return true;
        }
    }
}

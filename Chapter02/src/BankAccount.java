public class BankAccount {
    int balance;
    Person owner;

    // 파라미터 : 입금할 액수 (정수형)
    // 리턴 : 성공여부 (불린)

    boolean deposit (int amount) {
        if((amount >= 0) && (owner.cashAmount > amount)) {
            owner.cashAmount = owner.cashAmount - amount;
            balance = balance + amount;
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return true;
        } else {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return false;
        }
    }

    // 파라미터 : 출금할 액수 (정수)
    // 리턴 : 성공여부 (불린)

    boolean withdraw (int amount) {
        if((amount >= 0 && balance > amount)) {
            balance = balance - amount;
            owner.cashAmount = owner.cashAmount + amount;
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return true;
        } else {
            System.out.println("출금실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return false;
        }
    }

    // 첫 번째 파라미터 : 받는 사람 (Person)
    // 두 번째 파라미터 : 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)

//    boolean transfer (Person to, int amount) {
//
//    }

}

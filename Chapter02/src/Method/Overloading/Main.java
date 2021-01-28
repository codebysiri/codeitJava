package Method.Overloading;

public class Main {
    public static void main(String[] args) {
        // 사람 1
        Person p1 = new Person();
        p1.setName("문종");
        p1.setAge(28);
        p1.setCashAmount(30000);

        // 은행 계좌 1
        BankAccount a1 = new BankAccount();
        a1.setBalance(500000);

        p1.setAccount(a1);
        a1.setOwner(p1);

        // 사람 2
        Person p2 = new Person();
        p2.setName("김신의");
        p2.setAge(27);
        p2.setCashAmount(100000);

        // 은행 계좌 2
        BankAccount a2 = new BankAccount();
        a2.setBalance(100000);

        p2.setAccount(a2);
        a2.setOwner(p2);

        // 계좌 이체 테스트
        p1.transfer(a2, 200000);
        p2.transfer(a1, 150000);
        p1.transfer(a2, 270000);
        p2.transfer(a1, 130000);
    }
}

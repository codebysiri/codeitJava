// 접근 제어자 연습

public class Person01 {

    private String name;
    private int age;
    private int cashAmount;
    private BankAccount01 account;


    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    public int getAge() {
        return age;
    }

    public void setCashAmount(int newCashAmount) {
        if (newCashAmount >= 0) {
            cashAmount = newCashAmount;
        }
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setAccount(BankAccount01 newAccount) {
            account = newAccount;
    }

    public BankAccount01 getAccount() {
        return account;
    }

}


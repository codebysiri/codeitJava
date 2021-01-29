package Constructor;

public class Person {

    String name;
    int age;
    int cashAmount;

    public Person(String pName, int pAge) {
        name = pName;
        if (pAge < 0) {
            age = 12;
        } else {
            age = pAge;
        }
        cashAmount = 0;
    }

    public Person(String pName, int pAge, int pCashAmount) {
        name = pName;
        if (pAge < 0) {
            age = 12;
        } else {
            age = pAge;
        }
        if (pCashAmount < 0) {
            cashAmount = 0;
        } else {
            cashAmount = pCashAmount;
        }
    }
}

package Cwiczenie_3;

public class BankAccount {
    private Person person;
    private double account;
    private final int limitWYPŁ = 500;

    public BankAccount(Person person, double account) throws IllegalAccessException {
        if (person == null)
            throw  new NullPointerException();
        if (account <= 0) {
            throw  new IllegalAccessException();
        }
        this.account = account;
        this.person = person;

    }
    public BankAccount(String fn , String ln, double account) {
       // this(new Person(fn,ln),account);
        this.person = new Person(fn,ln);
        this.account= account;
    }

    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    void deposit(double money) {
        account += money;
    }

    void withdraw(double money) {
        if (money>=account){
            throw new  NotEnoughBalanceException ("Za duża kwota do wypłaty. Stan konta " + account);
        }
        if (money > limitWYPŁ){
           throw  new LimitCashException("Za duża kwota do wypłaty limit = " +limitWYPŁ);
        }
        account -= money;
    }
}



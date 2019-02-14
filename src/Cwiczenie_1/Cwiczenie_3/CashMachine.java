package Cwiczenie_1.Cwiczenie_3;

import java.util.Scanner;

public class CashMachine {

    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("Jan", "Kowalski");
        BankAccount bankAccount = new BankAccount(person, 2000);
        BankAccount bankAccount1 = new BankAccount("Jan", "Kowal", 2000);
        //   BankAccount bankAccount2 = new BankAccount("Jan", "Kowal", 0);
        //   BankAccount bankAccount3 = new BankAccount(null, -230);

        bankAccount.deposit(200);
        System.out.println(bankAccount.getAccount());

        Scanner scanner = new Scanner(System.in);
        boolean ok = false;

        do {
            System.out.println("Stan konta " + bankAccount.getAccount());
            System.out.println("Ile wypłacasz");
            double doWypłaty = scanner.nextDouble();
            try {
                bankAccount.withdraw(doWypłaty);
                ok = true;
            } catch (NotEnoughBalanceException ex) {
                System.out.println(ex);
            } catch (LimitCashException ex) {
                System.out.println(ex);
            }
        } while (!ok);

        System.out.println(bankAccount.getAccount());
    }
}

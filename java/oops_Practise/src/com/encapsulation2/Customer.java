package com.encapsulation2;

public class Customer {
    static void main() {
        BankAccount account = new BankAccount("001","Ayush");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(50));
        account.depositMoney(-40);
        account.withdrawMoney(0);
    }
}

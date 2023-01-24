package ru.otus.homework.hw6bank;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Pinkoff");

        Client timur = new Client("Tim", "Ur", 27);
        HashSet<Account> hashAccountTimur = new HashSet<>();
        Account accountTimur1 = new Account(0);
        Account accountTimur2 = new Account(5);
        Account accountTimur3 = new Account(100500);
        hashAccountTimur.add(accountTimur1);
        hashAccountTimur.add(accountTimur2);
        hashAccountTimur.add(accountTimur3);

        Client tony = new Client("Tony", "Stark", 40);
        HashSet<Account> hashAccountTony = new HashSet<>();
        Account accountTony1 = new Account(999999999);
        hashAccountTony.add(accountTony1);

        Client peter = new Client("Peter", "Parker", 16);
        HashSet<Account> hashAccountPeter = new HashSet<>();
        Account accountPeter1 = new Account(10);
        hashAccountPeter.add(accountPeter1);

        bank.addClient(timur, hashAccountTimur);
        bank.addClient(tony, hashAccountTony);
        bank.addClient(peter, hashAccountPeter);

        System.out.println("\nShowing all accounts of the clients: ");
        System.out.println(bank.getClientHashSetMap());

        bank.printAccounts();

        System.out.println("\nFinding client by the account (findClient): ");
        System.out.println(accountTimur3 + " registered to: " + bank.findClient(accountTimur3));

        System.out.println("\nFinding account(s) by the client (getAccounts): ");
        System.out.println(timur + " has account(s): " + bank.getAccounts(new Client("Tim", "Ur", 27)));
    }
}
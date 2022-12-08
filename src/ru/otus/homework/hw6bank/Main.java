package ru.otus.homework.hw6bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Pinkoff");

        Client timur = new Client("Tim", "Ur", 27);
        Client tony = new Client("Tony", "Stark", 40);
        Client peter = new Client("Peter", "Parker", 16);

        System.out.println();

        bank.addClient(timur);
        bank.addClient(tony);
        bank.addClient(peter);

        System.out.println();

        Account accountTimur1 = bank.createAccount(timur, 0);
        Account accountTimur2 = bank.createAccount(timur, 5);
        Account accountTimur3 = bank.createAccount(timur, 100500);
        Account accountTony1 = bank.createAccount(tony, 999999999);
        Account accountPeter1 = bank.createAccount(peter, 10);

        bank.printAccounts();

        System.out.println("\nShowing all accounts of the clients: ");
        System.out.println(bank.getClientHashMap());

        System.out.println("\nFinding client by the account (findClient): ");
        System.out.println(accountTimur3 + " registered to: " + bank.findClient(accountTimur3));

        System.out.println("\nFinding account(s) by the client (getAccounts): ");
        System.out.println(timur + " has account(s): " + bank.getAccounts(timur));
    }
}

package ru.otus.homework.hw6bank;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Client {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Set<Account> accountsHashSet = new HashSet<>();

    public Client(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println(this + " was created");
    }

    public Account createAccount(int count) {
        Account account = new Account(Bank.accountId++, this, count);
        System.out.println(account + " was created for " + this);
        return account;
    }

    public Set<Account> putAccountToSet(Account account) {
        accountsHashSet.add(account);
        return accountsHashSet;
    }

    @Override
    public String toString() {
        return "Client{firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}



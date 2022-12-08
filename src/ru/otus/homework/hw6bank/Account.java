package ru.otus.homework.hw6bank;

import java.util.Objects;

public class Account {
    private final int id;
    private final Client client;
    private final int coins;

    public Account(int id, Client client, int coins) {
        this.id = id;
        this.client = client;
        this.coins = coins;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", coins=" + coins +
                '}';
    }

    public Client getClient() {
        return client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && client.equals(account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, client);
    }
}

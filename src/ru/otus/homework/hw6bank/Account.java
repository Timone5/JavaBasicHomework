package ru.otus.homework.hw6bank;

import java.util.Objects;
import java.util.UUID;

public class Account {
    private final String id;
    private final int coins;

    public Account(int coins) {
        this.id = UUID.randomUUID().toString();
        this.coins = coins;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", coins=" + coins +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id.equals(account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
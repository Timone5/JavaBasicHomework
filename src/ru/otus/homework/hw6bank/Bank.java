package ru.otus.homework.hw6bank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bank {
    public static int accountId;
    private final String name;
    private final Map<Client, Set<Account>> clientHashMap = new HashMap<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addClient(Client client) {
        if (!clientHashMap.containsKey(client)) {
            clientHashMap.put(client, new HashSet<>());
            System.out.println(client + " was added in " + this.name);
        } else {
            System.out.println(client + " already exists");
        }
    }

    public Account createAccount(Client client, int coins) {
        Account account = client.createAccount(coins);
        clientHashMap.put(client, client.putAccountToSet(account));
        return account;
    }

    public void printAccounts() {
        int i = 0;
        System.out.println("\n List of accounts of the " + this.name + ": ");
        for (Map.Entry<Client, Set<Account>> item : clientHashMap.entrySet()) {
            i++;
            System.out.println(i + ". " + item.getKey() + ". ");
            if (item.getValue() != null) {
                if (item.getValue().size() == 0) {
                    System.out.println("The client has no account");
                } else {
                    for (Account account : item.getValue()) {
                        System.out.println(" " + account);
                    }
                }
            } else {
                System.out.println("The client has no account");
            }
        }
    }

    public Map<Client, Set<Account>> getClientHashMap() {
        return clientHashMap;
    }

    public Client findClient(Account account) {
        return account.getClient();
    }

    public Set<Account> getAccounts(Client client) {
        return clientHashMap.get(client);
    }
}


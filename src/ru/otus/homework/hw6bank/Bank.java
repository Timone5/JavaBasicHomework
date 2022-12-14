package ru.otus.homework.hw6bank;

import java.util.*;

public class Bank {
    private final String bankName;
    private final Map<Client, HashSet<Account>> clientHashSetMap = new HashMap<>();

    public void addClient(Client client, HashSet<Account> account) {
        clientHashSetMap.put(client, account);
    }

    public Map<Client, HashSet<Account>> getClientHashSetMap() {
        return clientHashSetMap;
    }

    public Client getClient(Account account) {
        for (Map.Entry<Client, HashSet<Account>> entry : clientHashSetMap.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                if (entry.getValue().contains(account)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void printAccounts() {
        int i = 0;
        System.out.println("\n List of accounts of the " + this.bankName + ": ");
        for (Map.Entry<Client, HashSet<Account>> item : clientHashSetMap.entrySet()) {
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

    public Client findClient(Account account) {
        for (Map.Entry<Client, HashSet<Account>> entry : clientHashSetMap.entrySet()
        ) {
            if (entry.getValue().contains(account))
                return entry.getKey();
        }
        return null;
    }

    public HashSet<Account> getAccounts(Client client) {
        return clientHashSetMap.get(client);
    }
}


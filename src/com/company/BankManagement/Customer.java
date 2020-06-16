package com.company.BankManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer extends Person {
    List<Account> accounts = new ArrayList<>();
    List<Transaction> transactions = new ArrayList<>();

    public Customer(String name, String surName, String phoneNumber,  String livingAddress, GenderType gender) {
        super(name, surName, phoneNumber, livingAddress, gender);
    }


    public void NewAccount(Customer customer) {
        Account newAcc = new Account();
        customer.accounts.add(newAcc);
        List<Account> acc = new ArrayList<>();
        acc = Safe.getAccounts();
        acc.add(newAcc);
        Safe.setAccounts(acc);
        Safe.SafeBalance();
    }

}

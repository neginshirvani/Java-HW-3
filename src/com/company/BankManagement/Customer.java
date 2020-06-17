package com.company.BankManagement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer extends Person {


    List<Account> accounts = new ArrayList<>();
    List<Transaction> transactions = new ArrayList<>();

    public Customer(String name, String surName, String phoneNumber,  String livingAddress, GenderType gender) {
        super(name, surName, phoneNumber, livingAddress, gender);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public static void NewAccount(Customer customer) {
        System.out.println("Fill in the form below");
        System.out.println("Account type: ");
        Scanner t = new Scanner(System.in);
        AccountType acctype = AccountType.valueOf(t.next());
        System.out.println("How much money do you want to start with ");
        Scanner b = new Scanner(System.in);
        BigDecimal balance = b.nextBigDecimal();
        System.out.println("Acc number: ");
        Scanner an = new Scanner(System.in);
        String accnum = an.next();
        System.out.println("ChequeBookId: ");
        Scanner ch = new Scanner(System.in);
        String chbid = ch.next();

        Account newAcc = new Account(acctype, balance, accnum, chbid);
        customer.accounts.add(newAcc);
        Safe.accounts.add(newAcc);
//        List<Account> acc = new ArrayList<>();
//        acc = Safe.getAccounts();
//        acc.add(newAcc);
//        Safe.setAccounts(acc);
//        Safe.SafeBalance();
    }


}

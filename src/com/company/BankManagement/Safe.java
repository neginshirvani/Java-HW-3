package com.company.BankManagement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Safe {
    Bank bank;
    static List<Account> accounts = new ArrayList<>();
    static BigDecimal balance;

    public static List<Account> getAccounts() {
        return accounts;
    }

//    public static void setAccounts(boolean accounts) {
//        Safe.accounts = accounts;
//    }


    public static BigDecimal getBalance() {
        return balance;
    }

    public static void setBalance(BigDecimal balance) {
        Safe.balance = balance;
    }

    public static void SafeBalance() {
        for (Account account : Safe.accounts ) {
            BigDecimal eachBalance = account.getBalance();
            balance = balance.add(eachBalance);
        }
    }

    public static void Loan(Account a1, BigDecimal money) {
        if (Safe.getBalance().compareTo(money) >= 0) {
            BigDecimal balanceA = Safe.getBalance();
            balanceA = balanceA.subtract(money);
            BigDecimal accBalance = a1.getBalance();
            accBalance = accBalance.add(money);
            a1.setBalance(accBalance);
            Safe.setBalance(balanceA);
        }
        else {
            System.out.println("Sry there is no enough money in the Safe");
        }
    }



}

package com.company.BankManagement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Safe {
    Bank bank;
    private static List<Account> accounts = new ArrayList<>();
    static BigDecimal balance;

    public static List<Account> getAccounts() {
        return accounts;
    }

    public static void setAccounts(List<Account> accounts) {
        Safe.accounts = accounts;
    }


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

    public void Loan(Account a1, BigDecimal money) {
        BigDecimal balanceA = Safe.getBalance();
        balanceA = balanceA.subtract(money);
        BigDecimal accBalance = a1.getBalance();
        accBalance = accBalance.add(money);
        a1.setBalance(accBalance);
        Safe.setBalance(balanceA);
    }



}

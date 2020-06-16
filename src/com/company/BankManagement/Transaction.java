package com.company.BankManagement;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;


public class Transaction {
    Date start;
    Date done;
    Customer customer;



    public void CardtoCard(Account a1, Account a2, BigDecimal money) {
        BigDecimal balance1 = a1.getBalance();
        BigDecimal balance2 = a2.getBalance();
        balance1 = balance1.subtract(money);
        balance2 = balance2.add(money);
        a1.setBalance(balance1);
        a2.setBalance(balance2);

    }


    public void DepositToAcc(Account a1, BigDecimal money) {
        BigDecimal balance = a1.getBalance();
        balance = balance.add(money);
        a1.setBalance(balance);
    }

    public void TakeCash(Account a1) {
        System.out.println("How mush cash do you need?");
        Scanner cash = new Scanner(System.in);
        BigDecimal myCash = cash.nextBigDecimal();
        BigDecimal balance = a1.getBalance();
        balance = balance.subtract(myCash);
        a1.setBalance(balance);
    }




}

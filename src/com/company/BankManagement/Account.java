package com.company.BankManagement;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.company.Exception.InvalidAccountType;
import com.company.Exception.InvalidAccNumber;

public class Account {
    private AccountType type;
    private BigDecimal balance;
    private String accNumber;
    private String chequeBookId;
    Bank bank;
    Banker banker;
    Customer customer;

    public void setType(AccountType type) throws InvalidAccountType {
        if (!AccountTypevalidation(type)) {
            throw new InvalidAccountType("Invalid Account type");
        }
        this.type = type;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setAccNumber(String accNumber) throws InvalidAccNumber{
        if (!accNumberValidation(accNumber)) {
            throw new InvalidAccNumber("Invalid Acc Number");
        }
        this.accNumber = accNumber;
    }

    private boolean accNumberValidation(String accNumber) {
        return accNumber.length() <= 12;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    private boolean AccountTypevalidation(AccountType accountType) {
        return accountType.equals(AccountType.CHECKINGACCOUNT) || accountType.equals(AccountType.SAVINGACCOUNT);
    }




    public static void CurrencyConvertor(BigDecimal money) {
        System.out.println("               1.from Dollar to Euro");
        System.out.println("               2.from Dollar to Pound");
        System.out.println("               3.from Dollar to Derham");
        System.out.println("               4.from Dollar to Rial");
        System.out.println("--------------------------------------");
        System.out.println("               5.from Euro to Dollar");
        System.out.println("               6.from Euro to Pound");
        System.out.println("               7.from Euro to Derham");
        System.out.println("               8.from Euro to Rial");
        System.out.println("-------------------------------------");
        System.out.println("               9.from  Pound to Dollar");
        System.out.println("               10.from Pound to Euro");
        System.out.println("               11.from Pound to Derham");
        System.out.println("               12.from Pound to Rial");
        System.out.println("-------------------------------------");
        System.out.println("               13.from Derham to Dollar");
        System.out.println("               14.from Derham to Euro");
        System.out.println("               15.from Derham to Pound");
        System.out.println("               16.from Derham to Rial");
        System.out.println("-------------------------------------");
        System.out.println("               17.from Rial to Dollar");
        System.out.println("               18.from Rial to Euro");
        System.out.println("               19.from Rial to Pound");
        System.out.println("               20.from Rial Derham");
        System.out.println("------------------------------------");
        System.out.println("Choose between above");

        Scanner s = new Scanner(System.in);
        String choose = s.next();

        switch (choose) {
            case "1":
                money = money.multiply(BigDecimal.valueOf(0.882310));
                System.out.println("Your converted money is " + money + "Euro");
                break;
            case "2":
                money = money.multiply(BigDecimal.valueOf(0.790900));
                System.out.println("Your converted money is " + money + "Pound");
                break;
            case "3":
                money = money.multiply(BigDecimal.valueOf(3673));
                System.out.println("Your converted money is " + money + "Derham");
                break;
            case "4":
                money = money.multiply(BigDecimal.valueOf(182110));
                System.out.println("Your converted money is " + money + "Rial");
                break;
            case "5":
                money = money.divide(BigDecimal.valueOf(0.882310));
                System.out.println("Your converted money is " + money + "Dollar");
                break;
            case "6":
                money = money.multiply(BigDecimal.valueOf(1116));
                System.out.println("Your converted money is " + money + "Pound");
                break;
            case "7":
                money = money.multiply(BigDecimal.valueOf(4.622627));
                System.out.println("Your converted money is " + money + "Derham");
                break;
            case "8":
                money = money.multiply(BigDecimal.valueOf(202000));
                System.out.println("Your converted money is " + money + "Rial");
                break;
            case "9":
                money = money.divide(BigDecimal.valueOf(0.790900));
                System.out.println("Your converted money is " + money + "Dollar");
                break;
            case "10":
                money = money.divide(BigDecimal.valueOf(1116));
                System.out.println("Your converted money is " + money + "Euro");
                break;
            case "11":
                money = money.multiply(BigDecimal.valueOf(0.216193));
                System.out.println("Your converted money is " + money + "Derham");
                break;
            case "12":
                money = money.multiply(BigDecimal.valueOf(215909));
                System.out.println("Your converted money is " + money + "Rial");
                break;
            case "13":
                money = money.divide(BigDecimal.valueOf(3.673));
                System.out.println("Your converted money is " + money + "Dollar");
                break;
            case "14":
                money = money.divide(BigDecimal.valueOf(4.622627));
                System.out.println("Your converted money is " + money + "Euro");
                break;
            case "15":
                money = money.divide(BigDecimal.valueOf(0.216193));
                System.out.println("Your converted money is " + money + "Pound");
                break;
            case "16":
                money = money.multiply(BigDecimal.valueOf(48224));
                System.out.println("Your converted money is " + money + "Rial");
                break;
            case "17":
                money = money.divide(BigDecimal.valueOf(182110));
                System.out.println("Your converted money is " + money + "Dollar");
                break;
            case "18":
                money = money.divide(BigDecimal.valueOf(202000));
                System.out.println("Your converted money is " + money + "Euro");
                break;
            case "19":
                money = money.divide(BigDecimal.valueOf(215909));
                System.out.println("Your converted money is " + money + "Pound");
                break;
            case "20":
                money = money.divide(BigDecimal.valueOf(48224));
                System.out.println("Your converted money is " + money + "Derham");
                break;




        }

    }



}


enum AccountType {
    CHECKINGACCOUNT,
    SAVINGACCOUNT,
}
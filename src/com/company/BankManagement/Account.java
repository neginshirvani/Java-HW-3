package com.company.BankManagement;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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




    void CurrencyConvertor() {
        ///
    }



}


enum AccountType {
    CHECKINGACCOUNT,
    SAVINGACCOUNT,
}
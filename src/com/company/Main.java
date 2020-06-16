package com.company;
import com.company.BankManagement.Customer;
import com.company.BankManagement.GenderType;
import com.company.BankManagement.Transaction;
import com.company.BankManagement.Account;
import com.company.Exception.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to our Banking system :)");
        System.out.println("How can we help you ?");
        System.out.println("1. Create an account");
        System.out.println("2. CardtoCard");
        System.out.println("3. Deposit to Account");
        System.out.println("4. Take Cash");
        System.out.println("5. Take a Loan");
        System.out.println("6. Convert your money");

        Customer c1 = new Customer("Negin", "Shirvani", "09172472969", "Shiraz, Zerehi", GenderType.FEMALE);
        Customer c2 = new Customer("Arash", "Shirvani", "09173147266", "Shiraz, Zerehi", GenderType.MALE);

        Scanner s = new Scanner(System.in);
        String choose = s.next();

//        Account.CurrencyConvertor(BigDecimal.valueOf(20));



    }
}

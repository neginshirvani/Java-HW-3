package com.company;
import com.company.BankManagement.*;
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

        Bank.customers.add(c1);
        Bank.customers.add(c2);

        Scanner s = new Scanner(System.in);
        String choose = s.next();

        switch (choose) {
            case "1":
                System.out.println("1.Already has an account");
                System.out.println("2.New member");
                Scanner s1 = new Scanner(System.in);
                String choose1 = s1.next();
                switch (choose1) {
                    case "1":
                        System.out.println("Enter name: ");
                        Scanner n = new Scanner(System.in);
                        String name = n.next();
                        System.out.println("Enter Surname: ");
                        Scanner sn = new Scanner(System.in);
                        String surname = sn.next();
                        System.out.println("Enter phoneNumber: ");
                        Scanner p = new Scanner(System.in);
                        String phonenumber = p.next();
                        System.out.println("Enter gender: ");
                        Scanner g = new Scanner(System.in);
                        String gender = g.next();

                        for (Customer customer : Bank.customers) {
                            if (customer.getName().equals(name) && customer.getSurName().equals(surname) && customer.getPhoneNumber().equals(phonenumber)) {
                                Customer.NewAccount(customer);
                                System.out.println("Done! " +
                                        " thanks for choosing us");
                            }
//                            else
//                                System.out.println("You don't have an account");
                        }
                        break;
                    case "2":
                        System.out.println("Enter name: ");
                        Scanner n1 = new Scanner(System.in);
                        String name1 = n1.next();
                        System.out.println("Enter Surname: ");
                        Scanner sn1 = new Scanner(System.in);
                        String surname1 = sn1.next();
                        System.out.println("Enter phoneNumber: ");
                        Scanner p1 = new Scanner(System.in);
                        String phonenumber1 = p1.next();
                        System.out.println("Enter gender: ");
                        Scanner g1 = new Scanner(System.in);
                        GenderType gender1 = GenderType.valueOf(g1.next());
                        System.out.println("Enter your address");
                        Scanner a = new Scanner(System.in);
                        String addr = a.next();

                        Customer cus = new Customer(name1, surname1, phonenumber1, addr, gender1);
                        Customer.NewAccount(cus);
                        System.out.println("You have an account now");
                        break;
                }
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                System.out.println("How much money do you want to convert");
                Scanner m = new Scanner(System.in);
                BigDecimal money = m.nextBigDecimal();
                Account.CurrencyConvertor(money);
                break;



        }

//        Account.CurrencyConvertor(BigDecimal.valueOf(20));



    }
}

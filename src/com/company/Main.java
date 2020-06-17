package com.company;
import com.company.BankManagement.*;

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
        Account a1 = new Account(AccountType.SAVINGACCOUNT, BigDecimal.valueOf(5000), "60379975", "01");
        c1.getAccounts().add(a1);
        Account a2 = new Account(AccountType.CHECKINGACCOUNT, BigDecimal.valueOf(60000), "60379919", "02");
        c2.getAccounts().add(a2);
        Safe.getAccounts().add(a1);
        Safe.getAccounts().add(a2);


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
                System.out.println("Enter name: ");
                Scanner n = new Scanner(System.in);
                String name = n.next();
                System.out.println("Enter Surname: ");
                Scanner sn = new Scanner(System.in);
                String surname = sn.next();
                System.out.println("Enter phoneNumber: ");
                Scanner p = new Scanner(System.in);
                String phonenumber = p.next();

                for (Customer customer : Bank.customers ) {
                    if(customer.getName().equals(name) && customer.getSurName().equals(surname) && customer.getPhoneNumber().equals(phonenumber)) {
                        System.out.println("Enter your account number");
                        Scanner an = new Scanner(System.in);
                        String accnum = an.next();
                        for (Account account1 : customer.getAccounts()) {
                            if (account1.getAccNumber().equals(accnum)) {
                                System.out.println("Whose account do you want to transfer money to?");
                                System.out.println("Enter name: ");
                                Scanner n1 = new Scanner(System.in);
                                String name1 = n1.next();
                                System.out.println("Enter Surname: ");
                                Scanner sn1 = new Scanner(System.in);
                                String surname1 = sn1.next();
                                System.out.println("Enter phoneNumber: ");
                                Scanner p1 = new Scanner(System.in);
                                String phonenumber1 = p1.next();
                                for (Customer customer1:Bank.customers) {
                                    if (customer1.getPhoneNumber().equals(phonenumber1)) {
                                        System.out.println("Enter the number to his/her acc:");
                                        Scanner an1 = new Scanner(System.in);
                                        String accnum1 = an1.next();
                                        System.out.println("How musch money do you want to transfer?");
                                        Scanner m = new Scanner(System.in);
                                        BigDecimal money = m.nextBigDecimal();
                                        for (Account account2:customer1.getAccounts()) {
                                            if (account2.getAccNumber().equals(accnum1)) {
                                                Transaction.CardtoCard(account1, account2, money);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("Invalid Customer");
                    }
                }
                break;
            case "3":
                System.out.println("Enter phoneNumber");
                Scanner phone = new Scanner(System.in);
                String phonee = phone.next();
                for (Customer customerr:Bank.customers) {
                    if (customerr.getPhoneNumber().equals(phonee)) {
                        System.out.println("What is your account number");
                        Scanner enter = new Scanner(System.in);
                        String enetraccnum = enter.next();
                        for (Account cusaccount:
                             customerr.getAccounts()) {
                            if (cusaccount.getAccNumber().equals(enetraccnum)) {
                                System.out.println("How musch money you want to deposite?");
                                Scanner d = new Scanner(System.in);
                                BigDecimal dep = d.nextBigDecimal();
                                Transaction.DepositToAcc(cusaccount, dep);
                                System.out.println("The money is in your account now");
                            }
                        }

                    }
                }

                break;
            case "4":
                System.out.println("Enter phoneNumber: ");
                Scanner ph = new Scanner(System.in);
                String myphonenumber = ph.next();
                for (Customer customer:Bank.customers) {
                    if (customer.getPhoneNumber().equals(myphonenumber)){
                        System.out.println("What is your account number");
                        Scanner accnumber = new Scanner(System.in);
                        String myaccnum = accnumber.next();
                        for (Account account:customer.getAccounts()) {
                            if (account.getAccNumber().equals(myaccnum)) {
                                Transaction.TakeCash(account);
                                System.out.println("Thanks for choosing us");
                            }
                            else {
                                System.out.println("There is no account with this account number");
                            }
                        }
                    }

                }
                break;
            case "5":
                System.out.println("enter your phone number");
                Scanner ns1 = new Scanner(System.in);
                String callNum = ns1.next();
                for (Customer customer:
                     Bank.customers) {
                    if (customer.getPhoneNumber().equals(callNum)) {
                        System.out.println("How much money do you want?");
                        Scanner ns = new Scanner(System.in);
                        BigDecimal money = ns.nextBigDecimal();
                        System.out.println("Enter your account number");
                        Scanner accn = new Scanner(System.in);
                        String accnumber = accn.next();
                        for (Account account:
                             customer.getAccounts()) {
                            if (account.getAccNumber().equals(accnumber)) {
                                Safe.Loan(account, money);
                            }
                            else {
                                System.out.println("There is no account with this number");
                            }
                        }
                    }
                    else {
                        System.out.println("Invalid Customer");
                    }
                }

                break;
            case "6":
                System.out.println("How much money do you want to convert");
                Scanner m = new Scanner(System.in);
                BigDecimal money = m.nextBigDecimal();
                Account.CurrencyConvertor(money);
                break;

            default:
                System.out.println("Thanks for choosing our system");

        }

//        Account.CurrencyConvertor(BigDecimal.valueOf(20));



    }
}

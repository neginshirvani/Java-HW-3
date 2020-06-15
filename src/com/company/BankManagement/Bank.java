package com.company.BankManagement;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    String name;
    String address;
    String phoneNumber;
    String email;
    String city;
    String country;
    String branchName;
    List<Customer> customers = new ArrayList<>();

    public Bank(String name, String address, String phoneNumber, String email, String city, String country, String branchName) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;
        this.country = country;
        this.branchName = branchName;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getBranchName() {
        return branchName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
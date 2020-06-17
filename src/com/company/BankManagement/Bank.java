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
    public static List<Customer> customers = new ArrayList<>();
    //Safe safe;



    public Bank(String name, String address, String phoneNumber, String email, String city, String country, String branchName) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;
        this.country = country;
        this.branchName = branchName;
        //super(name, address, phoneNumber, email, city, country, branchName);
    }

    public Bank() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setBranchName(String branchName) {
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

package com.company.BankManagement;

import java.util.Date;
import com.company.Exception.InvalidNationalCode;

public class Person {
    String name;
    String surName;
    String phoneNumber;
    Date birthDate;
    String livingAddress;
    GenderType gender;
    String nationalCode;

    public Person(String name, String surName, String phoneNumber, Date birthDate, String livingAddress, GenderType gender) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.livingAddress = livingAddress;
        this.gender = gender;
    }

    public Person() {

    }


    public void setNationalCode(String nationalCode) throws InvalidNationalCode {
        if (!nationalCodeValidation(nationalCode)) {
            throw new InvalidNationalCode("Invalid NationalCode");
        }
        this.nationalCode = nationalCode;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLivingAddress() {
        return livingAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setLivingAddress(String livingAddress) {
        this.livingAddress = livingAddress;
    }

    private boolean nationalCodeValidation(String nationalCode) {
        return nationalCode.length() == 10;
    }
}


enum GenderType {
    MALE,
    FEMALE,
    OTHER;
}
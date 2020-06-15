package com.company.BankManagement;

import java.math.BigDecimal;
import java.util.Date;
import com.company.Exception.InvalidDateException;
import com.company.Exception.InvalidIncomeException;

public class Banker extends Person {
    BigDecimal income;
    Date startWorkingDate;
    Date endDate;



    public Banker(BigDecimal income, Date startWorkingDate, Date endDate) throws InvalidDateException, InvalidIncomeException {
        super();
        this.income = income;
        this.startWorkingDate = startWorkingDate;
        this.endDate = endDate;
        if (!dateValidation()) {
            throw new InvalidDateException("start Date is invalid");
        }

        if (!incomeValidation()) {
            throw new InvalidIncomeException("You need to pay to the bank");
        }

    }

    public Banker(String name, String surName, String phoneNumber, Date birthDate, String livingAddress, GenderType gender) {
        super(name, surName, phoneNumber, birthDate, livingAddress, gender);
    }

    private boolean dateValidation() {
        return endDate.after(startWorkingDate);
    }

    private boolean incomeValidation() {
        return income.signum() >= 0;
    }

    public boolean isEmployed() {
        return endDate.after(new Date());
    }

}

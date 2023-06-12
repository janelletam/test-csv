package com.company;

import com.opencsv.bean.CsvBindByName;

public class Mentor extends CsvBean {
    @CsvBindByName (column = "First Name")
    private String firstName;

    @CsvBindByName (column = "Last Name")
    private String lastName;

    public Mentor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


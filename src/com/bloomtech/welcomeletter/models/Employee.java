package com.bloomtech.welcomeletter.models;

import java.time.LocalDate;

public class Employee {
    private static int maxId = 1;

    private int id;
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String email;
    private int salary;
    private LocalDate startdate;
    private Role role;
    private Company company;

    //TODO: Implement Builder Pattern
    public static Builder builder(){
        return new Builder();
    }

    //TODO: Replace with Builder Constructor
    private Employee(Builder builder) {
        //Auto-generate an id
        id = maxId;
        maxId++;

        //TODO: Initialize fields:
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.phonenumber = builder.phonenumber;
        this.email = builder.email;
        this.salary = builder.salary;
        this.startdate = builder.startdate;
        this.role = builder.role;
        this.company = builder.company;

    }

    //TODO: Create Builder Class
    public static final class Builder {

        private String firstname;
        private String lastname;
        private String phonenumber;
        private String email;
        private int salary;
        private LocalDate startdate;
        private Role role;
        private Company company;

        public Builder() {}

        public Builder withFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder withPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder withStartdate(LocalDate startdate) {
            this.startdate = startdate;
            return this;
        }

        public Builder withRole(Role role) {
            this.role = role;
            return this;
        }

        public Builder withCompany(Company company) {
            this.company = company;
            return this;
        }

        public Employee build() {
            if (firstname == null) {
                throw new RuntimeException();
            }
            if (company == null) {
                throw new RuntimeException();
            }
            return new Employee(this);
        }
    }

    //Getters
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public Role getRole() {
        return role;
    }

    public Company getCompany() {
        return company;
    }

    public int getId() {
        return id;
    }
}

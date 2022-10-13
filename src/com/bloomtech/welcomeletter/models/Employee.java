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

    //TODO: Replace with Builder Constructor
    public Employee(String firstname, String lastname, String phonenumber, String email, int salary, LocalDate startdate, Role role, Company company) {
        //Auto-generate an id
        id = maxId;
        maxId++;

        //TODO: Initialize fields:
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.email = email;
        this.salary = salary;
        this.startdate = startdate;
        this.role = role;
        this.company = company;

    }

    //TODO: Create Builder Class
    public static class builder {

        private String firstname;
        private String lastname;
        private String phonenumber;
        private String email;
        private int salary;
        private LocalDate startdate;
        private Role role;
        private Company company;

        public builder() {}

        public builder withFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public builder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public builder withPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
            return this;
        }

        public builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public builder withSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public builder withStartdate(LocalDate startdate) {
            this.startdate = startdate;
            return this;
        }

        public builder withRole(Role role) {
            this.role = role;
            return this;
        }

        public builder withCompany(Company company) {
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
            return new Employee(firstname, lastname, phonenumber, email, salary, startdate, role, company);
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

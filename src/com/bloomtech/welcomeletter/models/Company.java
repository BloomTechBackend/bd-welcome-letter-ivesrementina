package com.bloomtech.welcomeletter.models;

public class Company {
    private static int maxId = 1;
    private int id;

    private String companyname;
    private String country;

    //TODO: Replace with Builder Constructor
    private Company(String companyname, String country) {
        //Auto-generate an id
        id = maxId;
        maxId++;

        //Initialize fields
        this.companyname = companyname;
        this.country = country;
    }

    public static final class builder {
        //TODO: Implement Builder Pattern
        private String companyname;
        private String country;

        public builder() {}

        public builder withCompanyname(String companyname) {
            this.companyname = companyname;
            return this;
        }

        public builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Company build() {
            return new Company(companyname, country);
        }
    }

    public int getId() {
        return id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getCountry() {
        return country;
    }
}

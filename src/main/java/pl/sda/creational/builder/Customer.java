package pl.sda.creational.builder;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String profession;
    private String city;
    private String country;

    private Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public static Customer createWithDefaults() {
        return new Customer("John", "Smith");

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPesel() {
        return pesel;
    }

    public String getProfession() {
        return profession;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public static class Builder {
        private Customer customer;

        public Builder(String name, String lastName) {
            customer = new Customer(name, lastName);
        }

        public Builder bornAt(LocalDate birthDate) {
            customer.birthDate = birthDate;
            return this;
        }

        public Builder withPesel(String pesel) {
            Regex regex = new Regex("\\d{11}");
            customer.pesel = pesel;
            return this;
        }

        public Builder workingAs(String profession) {
            customer.profession = profession;
            return this;
        }

        public Builder livesIn(String city) {
            customer.city = city;
            return this;
        }

        public Builder setCountry(String country) {
            customer.country = country;
            return this;
        }

        public Customer build() {
            return customer;
        }
    }
}
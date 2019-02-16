package pl.sda.creational.builder;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String profession;
    private String city;
    private String country;

    public Customer(String name, String lastName, LocalDate birthDate, String pesel, String profession, String city, String country) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.pesel = pesel;
        this.profession = profession;
        this.city = city;
        this.country = country;
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
}

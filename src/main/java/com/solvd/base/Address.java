package com.solvd.base;

import java.util.Objects;

public class Address {
    //Переменные экзепляра класса
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    //Конструктор класса с переменными конструктора
    public Address(String street, String city, String state,
                   String country, String zipCode) {
        if(street == null || city == null || state == null || country == null || zipCode ==null) {
            throw new NullPointerException("All fields must have non-null values");
        }
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString(){
        return "Address{" +
                "Street='" + street + '\'' +
                ", City='" + city + '\'' +
                ", State='" + state + '\'' +
                ", Country='" + country + '\'' +
                ", ZipCode='" + zipCode + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getStreet(), address.getStreet()) &&
                Objects.equals(getCity(), address.getCity()) &&
                Objects.equals(getState(), address.getState()) &&
                Objects.equals(getCountry(), address.getCountry()) &&
                Objects.equals(getZipCode(), address.getZipCode());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getStreet(), getCity(), getState(), getCountry(),getZipCode());
    }
}


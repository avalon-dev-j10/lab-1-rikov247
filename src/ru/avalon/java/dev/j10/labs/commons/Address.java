package ru.avalon.java.dev.j10.labs.commons; // пункт 1. файл добавляется в пакет

public class Address { // пункт 2.

    private String country; // пункт 3. Задание переменных
    private String city;
    private String street;
    private String building;
    private String apartment;

    // пункт 4. Объявление методов
    
    public Address(String country, String city, String street, String building, String apartment) {
        // метод принимающий составляющие адреса 
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartment = apartment;
    }
   
    // установка (set) значений для составляющих адреса
    public void setCountry(String countrySet) { // установка в качестве исходного country значения countrySet
        this.country = countrySet;
    }

    public void setCity(String citySet) {
        this.city = citySet;
    }

    public void setStreet(String streetSet) {
        this.street = streetSet;
    }

    public void setBuild(String buildingSet) {
        this.building = buildingSet;
    }

    public void setApartment(String apartmentSet) {
        this.apartment = apartmentSet;
    }

    // получение (get) составляющих адреса
    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getApartment() {
        return apartment;
    }
    
    public String getAddress() { // метод для получения полного адреса при вызове этого метода
        return "Address: " + country + ", " + city + ", " + street + ", " + building + ", app. " + apartment;
    }
}

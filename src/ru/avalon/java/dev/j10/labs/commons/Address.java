/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должны быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons; // пункт 1. файл добавляется в пакет

public class Address { // пункт 2.

    private String country; // пункт 3. Задание переменных
    private String city;
    private String street;
    private int building;
    private int apartment;

    // пункт 4. Объявление методв
    
    public Address(String country, String city, String street, int building, int apartment) {
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

    public void setBuild(int buildingSet) {
        this.building = buildingSet;
    }

    public void setApartment(int apartmentSet) {
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

    public int getBuilding() {
        return building;
    }

    public int getApartment() {
        return apartment;
    }
    
    public String getAddress() { // метод для получения полного адреса при вызове этого метода
        return "Address: " + country + ", " + city + ", " + street + ", " + building + ", app. " + apartment;
    }
}

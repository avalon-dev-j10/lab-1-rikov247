package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 * <li> серию и номер документа;
 * <li> имя;
 * <li> фамилию;
 * <li> отчество;
 * <li> второе имя;
 * <li> день рождения;
 * <li> дату выдачи;
 * <li> орган, выдавший документ.
 * </ol>
 */
public class Passport { // пункт 5. Делаем класс публичным

    // пункт 1. Объявляем атрибуты класса
    private String serAndNum;  // серия и номер документа

    private String name;       // имя
    private String surname;    // фамилия
    private String patronymic; // отчество
    private String secName;    // второе имя

    private int birthDay;   // день рождения
    private int birthMonth; // месяц рождения
    private int birthYear; // год рождения

    private int issueDay;   // день выдачи
    private int issueMonth; // месяц выдачи
    private int issueYear; // год выдачи

    private String issuingAuthority; // орган, выдавший документ

    // пункт 2 с учетом пункта 4
    public Passport(String serAndNum, String name, String surname, String patronymic, int birthDay, int birthMonth, int birthYear, 
                    int issueDay, int issueMonth, int issueYear, String issuingAuthority) {
        
        this.serAndNum = serAndNum;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.issueDay = issueDay;
        this.issueMonth = issueMonth;
        this.issueYear = issueYear;
        this.issuingAuthority = issuingAuthority;
    }

    /* метод ниже позволяет учесть существование второго имени (если оно есть, 
      * то будет вызываться метод ниже, если его нет, то будет вызываться метод выше) */
    public Passport(String serAndNum, String name, String surname, String patronymic, String secName, int birthDay, int birthMonth, int birthYear, 
                    int issueDay, int issueMonth, int issueYear, String issuingAuthority) {
        this(serAndNum, name, surname, patronymic, birthDay, birthMonth, birthYear, issueDay, issueMonth, issueYear, issuingAuthority);
        this.secName = secName;
    }

    // пункт 3. конструктор задания значений    
    public void setSerAndNum(String serAndNum) {
        this.serAndNum = serAndNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setIssueDay(int issueDay) {
        this.issueDay = issueDay;
    }

    public void setIssueMonth(int issueMonth) {
        this.issueMonth = issueMonth;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    // пункт 3. конструкторы выдачи значений
    public String getSerAndNum() {
        return serAndNum;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSecName() {
        return secName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getIssueDay() {
        return issueDay;
    }

    public int getIssueMonth() {
        return issueMonth;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public String getIssuingAuthority() {
        return issuingAuthority;
    }
    
}

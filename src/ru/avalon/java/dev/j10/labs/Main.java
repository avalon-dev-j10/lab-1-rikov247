package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address; // для проверки работы класса Address
import ru.avalon.java.dev.j10.labs.models.Passport; // для проверки работы класса Passport

public class Main {
// TODO: были и, наверное, есть проблемы с push и commit в свою созданную ветку лабораторной работы..поэтому так много commitОВ
    
    public static void main(String[] args) { // точка входа в приложение

        Person ivanov = new Person(
                new Passport("10104017658", "Ivan", "Ivanov", "Ivanovich", 1, 2, 1993, 4, 5, 2017, "Spb"),
                new Address("Russia", "Saint-Petersburg", "Obruchevich", "1", "1")
        );

        Person smith = new Person(
                new Passport("10104017658", "John", "Smith", null, "Edvard", 1, 2, 1993, 4, 5, 2017, "Spb"), // поля ФИО для иностранного имени в конструкторе имеют другой порядок
                new Address("Russia", "Saint-Petersburg", "Obruchevich", "1", "2")
        );

        String ivFname;
        String smFname;
        String ivAdd;
        String smAdd;

        ivFname = ivanov.getFullName();
        smFname = smith.getFullName();
        ivAdd = ivanov.getRegistration();
        smAdd = smith.getRegistration();

        System.out.println(ivFname);
        System.out.println(smFname);
        System.out.println(ivAdd);
        System.out.println(smAdd);
    }
}

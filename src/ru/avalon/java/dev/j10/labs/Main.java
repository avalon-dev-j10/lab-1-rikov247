package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address; // для проверки работы класса Address
import ru.avalon.java.dev.j10.labs.models.Passport; // для проверки работы класса Passport

public class Main {

    public static void main(String[] args) { // точка входа в приложение

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
        Person ivanov = new Person(
                new Passport("10104017658", "Ivan", "Ivanov", "Ivanovich", 1, 2, 1993, 4, 5, 2017, "Spb"),
                new Address("Russia", "Saint-Petersburg", "Obruchevich", 1, 1)
        );

        Person smith = new Person(
                new Passport("10104017658", "John", "Smith", null, "Edvard", 1, 2, 1993, 4, 5, 2017, "Spb"), // поля ФИО для иностранного имени в конструкторе имеют другой порядок
                new Address("Russia", "Saint-Petersburg", "Obruchevich", 1, 2)
        );

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        String ivFname;
        String smFname;
        String ivAdd;
        String smAdd;

        ivFname = ivanov.getFullName();
        smFname = smith.getFullName();
        ivAdd = ivanov.getAddress();
        smAdd = smith.getAddress();

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        System.out.println(ivFname);
        System.out.println(smFname);
        System.out.println(ivAdd);
        System.out.println(smAdd);
    }
}

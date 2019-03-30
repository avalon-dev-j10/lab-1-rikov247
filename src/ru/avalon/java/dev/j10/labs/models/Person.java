package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность, наделённая:
 * <ol>
 * <li>именем;
 * <li>паспортными данными;
 * <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {

    private Passport serAndNum;         // серия и номер паспорта
    private Address registration;           // адрес места жительства

    public Person(Passport serAndNum, Address registration) {
        this.serAndNum = serAndNum;
        this.registration = registration;
    }

    /*
     * TODO(Студент): Создайте класс Address.
     *
     * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
     *
     * 2. Создайте класс, видимый из пакета. Подумайте о том
     *    Какое имя должен иметь класс, если он объявленн в этом
     *    файле.
     *
     * 3. Подумайте над тем, какие переменные должены быть
     *    определены в классе.
     *
     * 4. Подумайте над тем, какие методы должны быть объявлены
     *    в классе.
     */

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то возвращет Имя, Фимилию и
     * Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то возвращает Имя,
     * Первую букву второго имени, и Фамилию, разделённые пробелом. После
     * Инициала второго имени должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а есть только Имя и
     * Фамилия, то возвращает их, разделённые пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        String result;

        if (serAndNum.getPatronymic() != null) {
            result = serAndNum.getName() + " "
                    + serAndNum.getSurName() + " "
                    + serAndNum.getPatronymic();
        } else if (serAndNum.getSecName() != null) {
            result = serAndNum.getName() + " "
                    + serAndNum.getSecName().charAt(0) + ". "
                    + serAndNum.getSurName();
        } else {
            result = serAndNum.getName() + " "
                    + serAndNum.getSurName();
        }

        return result;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной регистрации человека,
     * согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getRegistration() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return registration.getAddress(); //метод описан в классе Address
    }
}

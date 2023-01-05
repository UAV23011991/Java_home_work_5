package Java.h_w_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phonebook Test = new Phonebook();
        System.out.println("Справочник: " + Test.phonebook.keySet());
        System.out.println("Номера телефона Алексея: " + Arrays.stream(Test.phonebook.get("Алексей")).toList());
        System.out.println("Номера телефона Павла: " + Arrays.stream(Test.phonebook.get("Павел")).toList());
        System.out.println("Номера телефона Дарьи: " + Arrays.stream(Test.phonebook.get("Дарья")).toList());
        System.out.println("Номер телефона Ирины: " + Arrays.stream(Test.phonebook.get("Ирина")).toList());

        Test.phonebook.put("Максим", new String[]{"+7-(900)-323-25-04"});
        System.out.println("Новый справочник: " + Test.phonebook.keySet());
        System.out.println("Номер телефона Максима: " + Arrays.stream(Test.phonebook.get("Максим")).toList());
    }
}
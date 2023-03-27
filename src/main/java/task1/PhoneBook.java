package task1;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        List<String> phoneNumbers = phoneBook.getOrDefault(name, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        phoneBook.put(name, phoneNumbers);
    }

    public List<String> getPhoneNumbers(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Петров Павел Петрович", "123-45-67");
        phoneBook.addContact("Петров Павел Петрович", "111-22-33");
        phoneBook.addContact("Петров Павел Петрович", "222-33-44");
        phoneBook.addContact("Иванов Иван Иванович", "333-44-55");
        phoneBook.addContact("Васин Василий Васильевич", "444-55-66");
        phoneBook.addContact("Васин Василий Васильевич", "555-66-77");

        System.out.println("Петров Павел Петрович, телефонный номер: " + phoneBook.getPhoneNumbers("Петров Павел Петрович"));
        System.out.println("Иванов Иван Иванович, телефонный номер: " + phoneBook.getPhoneNumbers("Иванов Иван Иванович"));
        System.out.println("Васин Василий Васильевич, телефонный номер: " + phoneBook.getPhoneNumbers("Васин Василий Васильевич"));
    }
}


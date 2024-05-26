package school.lessons;

// Класс телефонного справочника
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Phonebook {

    // Map для фамилий и номеров телефона
    private HashMap<String, List<String>> contacts;

    // Конструктор для Phonebook
    public Phonebook() {
        // Инициализируем пустой map
        this.contacts = new HashMap<>();
    }

    public HashMap<String, List<String>> getContacts() {
        return contacts;
    }

    // Добавление новой записи в телефонный справочник
    public void add(String surname, String phoneNumber) {
        // Проверка на наличие фамилии в map
        if (contacts.containsKey(surname)) {
            List<String> numbers = contacts.get(surname);
            numbers.add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            contacts.put(surname, numbers);
    }
    }

    // Поиск телефонного номера по фамилии
    public List<String> get(String surname) {
        if (this.contacts.containsKey(surname)) {
            return this.contacts.get(surname);
        } else {
            return new ArrayList<>();
        }
    }

    public void printPhoneBook() {
        contacts.keySet().stream().sorted().forEach(lastName -> {
            System.out.print(lastName + " : ");
            System.out.println(String.join(" , ", this.get(lastName)) + ".");
        });
    }
}
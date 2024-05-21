package school.lessons;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookTest {

      @Test
    @DisplayName("Проверка пустого телефонного справочника")
    public void testEmptyPhonebook() {
        Phonebook phonebook = new Phonebook();
        assertTrue(phonebook.getContacts().isEmpty(), "Телефонный справочник должен быть пустым");
    }

    @Test
    @DisplayName("Тестирование добавления контакта")
    public void testAddContact() {
        Phonebook phonebook = new Phonebook();
        String surname = "Иванов";
        String phone_number1 = "+7(111)1111111";
        phonebook. add(surname, phone_number1);

        assertTrue(phonebook.getContacts().containsKey(surname), "Фамилия не должна быть null");
        List<String> phone_numbers = phonebook.getContacts().get(surname);
        assertEquals(1, phone_numbers.size(), "Количество элементов в списке должно быть 1");
        assertTrue(phone_numbers.contains(phone_number1), "Номер телефона должен быть в списке");
    }

    @Test
    @DisplayName("Проверка добавления нескольких контактов с одной фамилией")
    public void testAddMultipleContactsSameSurname() {
        Phonebook phonebook = new Phonebook();
        String surname = "Петров";
        String phone_number1 = " +7(222)2222222 ";
        String phone_number2 = "+7(333)3333333";

        phonebook.add(surname, phone_number1);
        phonebook.add(surname, phone_number2);

        assertTrue(phonebook.getContacts().containsKey(surname), "Фамилия не должна быть null");
        List<String> phone_numbers = phonebook.getContacts().get(surname);
        assertEquals(2, phone_numbers.size(), "Количество элементов в списке должно быть 2");
        assertTrue(phone_numbers.contains(phone_number1), "Первый номер телефона должен быть в списке");
        assertTrue(phone_numbers.contains(phone_number2), "Второй номер телефона должен быть в списке");
    }

    @Test
    @DisplayName("проверка поиска контакта по фамилии")
    public void testGetContactBySurname() {
        Phonebook phonebook = new Phonebook();
        String surname1 = "Иванов";
        String surname2 = "Петров";
        String phoneNumber1 = "+7(111)1111111";
        String phoneNumber2 = "+7(111)1111112";

        phonebook.add(surname1, phoneNumber1);
        phonebook.add(surname2, phoneNumber2);

        List<String> phoneNumbers = phonebook.get(surname1);

        assertEquals(1, phoneNumbers.size(), "Количество элементов в списке должно быть 1");
        assertTrue(phoneNumbers.contains(phoneNumber1), "Первый номер телефона должен быть в списке");

        phoneNumbers = phonebook.get(surname2);
        assertEquals(1, phoneNumbers.size(), "Количество элементов в списке должно быть 1");
        assertTrue(phoneNumbers.contains(phoneNumber2), "Второй номер телефона должен быть в списке");
    }
}
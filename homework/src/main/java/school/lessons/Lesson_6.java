package school.lessons;

import java.util.*;

public class Lesson_6 {
    // Слова сгенерированы рандомайзером
        public static void main(String[] args) {
        String[] randomNonUniqueStrings = {
                "Абрикос",
                "Авокадо",
                "Айва",
                "Орехоплодный",
                "Развоеваться",
                "Арбуз",
                "Смущать",
                "Стаять",
                "Ух",
                "Авокадо",
                "Затушевка",
                "Крупноплодный",
                "Орехоплодный",
                "Припасы",
                "Макрокосм",
                "Здоровье",
                "Подушный",
                "Почасовик",
                "Ананас",
                "Твердь"
        };

        List<String> randomNonUniqueStringsList = Arrays.asList(randomNonUniqueStrings);

        System.out.println("Исходный список:");
        randomNonUniqueStringsList.forEach(System.out::println);

            Set<String> randomUniqueStrings = new HashSet<>(randomNonUniqueStringsList);

            System.out.println("\n\nСписок уникальных значений:" + randomUniqueStrings);

            Map<String, Integer> elementsOccurrences = new HashMap<>();
            randomUniqueStrings.forEach(e -> elementsOccurrences.put(e, Collections.frequency(randomNonUniqueStringsList, e)));

            System.out.println("\n\nПодсчет элементов:");
            elementsOccurrences.forEach((key, value) -> System.out.println(key + ": " + value));

            Phonebook phonebook = new Phonebook();
            phonebook.add("Иванов", "+7 953 123-45-67");
            phonebook.add("Иванов", "+7 953 123-45-68");
            phonebook.add("Иванов", "+7 953 123-45-69");
            phonebook.add("Иванов", "+7 953 123-45-70");
            phonebook.add("Петров", "+7 953 123-45-60");
            phonebook.add("Петров", "+7 953 123-45-71");
            phonebook.add("Петров", "+7 953 123-45-72");
            phonebook.add("Сидоров", "+7 953 123-45-72");
            phonebook.add("Сидоров", "+7 953 123-45-74");

            phonebook.printPhoneBook();
    }
}

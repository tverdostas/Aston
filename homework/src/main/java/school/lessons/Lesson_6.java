package school.lessons;

import java.util.*;

import static java.util.stream.Collectors.toList;

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
                "Фронт",
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

        List<String> randomUniqueStrings = randomNonUniqueStringsList.stream()
                .distinct() // уникальные элементы
                .sorted() // сортировка, чтобы проще было заметить дубли
                .collect(toList());

        System.out.println("\n\nСписок уникальных значений:");
        randomUniqueStrings.forEach(System.out::println);

        Map<String, Integer> elementsOccurrences = new HashMap<>();
        randomUniqueStrings.forEach(e -> elementsOccurrences.put(e, Collections.frequency(randomNonUniqueStringsList, e)));
        for (String elem : randomNonUniqueStringsList) {
            if (elementsOccurrences.containsKey(elem)) {
                elementsOccurrences.put(elem, elementsOccurrences.get(elem) + 1);
            } else {
                elementsOccurrences.put(elem, 1);
            }
        }

        System.out.println("\n\nПодсчет элементов:");
        elementsOccurrences.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
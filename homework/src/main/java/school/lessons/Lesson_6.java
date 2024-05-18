package school.lessons;

import java.util.*;

import static java.util.stream.Collectors.toList;

// public class Lesson_6 {
//    public static void main(String[] args) {
//
//        String[] fruits = {"Банан", "Яблоко", "Груша", "Папая", "Лимон", "Дуриан", "Банан", "Айва",
//                "Инжир", "Груша", "Грейпфрут", "Папая", "Личи", "Питайя", "Дуриан"};
//
//        Map<String, Integer> fruitsCount = new HashMap<>();
//
//        for (String word : fruits) {
//            if (fruitsCount.containsKey(word)) {
//                fruitsCount.put(word, fruitsCount.get(word) + 1);
//            } else {
//                fruitsCount.put(word, 1);
//            }
//        }
//
//        System.out.println("Уникальные слова и их количество:");
//        for (Map.Entry<String, Integer> entry : fruitsCount.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//
//        Set<String> uniqueWords = new HashSet<>(Arrays.asList(fruits));
//        System.out.println("\nУникальные слова:");
//        for (String word : uniqueWords) {
//            System.out.println(word);
//        }
//
//    // Задание 2:
//    Phonebook phonebook = new Phonebook();
//
//        phonebook.addPhonebook("Иванов", 89096659801L);
//        phonebook.addPhonebook("Сидоров", 89096659802L);
//        phonebook.addPhonebook("Петров", 89096659803L);
//        phonebook.addPhonebook("Твердохлебов", 89096659804L);
//        phonebook.addPhonebook("Иванов", 89096659805L);
//        phonebook.addPhonebook("Трухин", 89096659806L);
//
//        phonebook.get("Иванов");
//        phonebook.get("Петров");
//        phonebook.get("Тест");
//}
//    }

//    public static void main(String[] args) {
//        String[] randomNonUniqueStrings  = {
//                "Затушевка",
//                "Крупноплодный",
//                "Орехоплодный",
//                "Припасы",
//                "Развоеваться",
//                "Сектантство",
//                "Смущать",
//                "Стаять",
//                "Ух",
//                "Фронт",
//                "Затушевка",
//                "Крупноплодный",
//                "Орехоплодный",
//                "Припасы",
//                "Макрокосм",
//                "Нездоровье",
//                "Подушный",
//                "Почасовик",
//                "Страшилище",
//                "Твердь"
//        };
//
//        List<String> randomNonUniqueStringsList = Arrays.asList(randomNonUniqueStrings);
//
//        System.out.println("Исходный список:");
//        randomNonUniqueStringsList.forEach(System.out::println);
//
//        List<String> randomUniqueStrings = randomNonUniqueStringsList.stream()
//                .distinct() // уникальные элементы
//                .sorted() // сортировка, чтобы проще было заметить дубли
//                .collect(toList());
//
//        System.out.println("\n\nСписок уникальных значений:");
//        randomUniqueStrings.forEach(System.out::println);
//
//        Map<String, Integer> elementsOccurrences = new HashMap<>();
//        randomUniqueStrings.forEach(e -> elementsOccurrences.put(e, Collections.frequency(randomNonUniqueStringsList, e)));
////        for (String elem : randomNonUniqueStringsList) {
////            if (elementsOccurrences.containsKey(elem)) {
////                elementsOccurrences.put(elem, elementsOccurrences.get(elem) + 1);
////            } else {
////                elementsOccurrences.put(elem, 1);
////            }
////        }
//
//        System.out.println("\n\nПодсчет элементов:");
//        elementsOccurrences.forEach((key, value) -> System.out.println(key + ": " + value));
//    }
//}

public class Lesson_6 {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "apple", "cherry", "banana", "grape", "kiwi", "apple",
                "banana", "apple", "cherry", "lemon", "strawberry", "banana"};

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(array));
        System.out.println("List of unique words: " + uniqueWords);

        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : array) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word frequency count: ");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
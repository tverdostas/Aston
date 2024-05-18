package school.lessons;
//
//import java.util.*;
//
//public class Phonebook {
//private static HashMap<String, Long> phonebook = new HashMap<>();
//
//    Phonebook() {
//        phonebook = new HashMap<>();
//    }
//
//    public static void addPhonebook(String name, Long phone) {
//        phonebook.put(name, phone);
//    }
//    public void get(String name){
//        if(phonebook.containsKey(name)) {
//            Set<Map.Entry<String, Long>> set = phonebook.entrySet();
//            for (Map.Entry<String, Long> temp : set) {
//                if(temp.getKey().equals(name)) {
//                    System.out.println(temp.getKey() + " : " + temp.getValue());
//                }
//            }
//        } else {
//            System.out.println("Such a name is not on the list.");
//        }
//    }
//}*/
//
//package school.lessons;
//
//import java.util.*;
//
//import static jdk.nashorn.internal.objects.NativeSymbol.iterator;
//
//public class Phonebook {
//private static HashMap<String, Long> phonebook = new HashMap<>();
//
//    Phonebook() {
//        phonebook = new HashMap<>();
//    }
//
//    public static void addPhonebook(String name, Long phone) {
//        phonebook.put(name, phone);
//    }
//    public void get(String name){
//        if(phonebook.containsKey(name)) {
//            Iterator<Map.Entry<String, Long>> set = phonebook.entrySet().iterator();
//            while (set.hasNext()) {
//                Map.Entry<String, Integer> entry = iterator.next();
//                                }
//            }
//        } else {
//            System.out.println("Such a name is not on the list.");
//        }
//    }
//}
//
//

// Класс телефонного справочника
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Phonebook {

    // Mapping of surnames to their corresponding phone numbers
    private final HashMap<String, List<String>> contacts;

    // Конструктор для Phonebook
    public Phonebook() {
        // Инициализируем пустой мап
        this.contacts = new HashMap<>();
    }

    public HashMap<String, List<String>> getContacts() {
        return contacts;
    }

    // Добавление новой записи в телефонный справочник
    public void add(String surname, String phone_number) {
        // Проверка на presence surname in the map
/*        if (!this.contacts.containsKey(surname)) {
            // Если его нет, создается новый список и добавляется под фамилией
            this.contacts.put(surname, new ArrayList<>());
        }
        this.contacts.get(surname).add(phone_number);*/
        this.contacts.put(surname, new ArrayList<>());
    }

    // Поиск телефонного номера по фамилии
    public List<String> get(String surname) {
        if (this.contacts.containsKey(surname)) {
            return this.contacts.get(surname);
        } else {
            return new ArrayList<>();
        }
    }
}
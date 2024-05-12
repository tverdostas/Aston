package school.lessons.lesson_4.exercise_1;

import static school.lessons.lesson_4.exercise_1.Cat.isFull;

// Класс для задания с массивом кошек
public class Bowl {
    public static int food = 50; // изменила модификатор доступа, иначе нужно прописать геттер

    // Функция для пополнения миски
    public static void addFood(int amount) {
        food += amount;
        System.out.println("Добавили еды, теперь в миске " + food + " еды");
    }

    // Прописала вывод сытости кота
    public void feedCat(Cat cat, int amount) {
        if (food >= amount) {
            food -= amount;
            // cat.CatEat(amount);
            isFull = true;
            System.out.println("Кот съел " + amount + " . В миске осталось " + food);
            System.out.println("Кот поел и он не голоден, сытость " + isFull);
        } else {
        // Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть наполовину сыт
            isFull = false;
            System.out.println("В миске не может быть отрицательное количество еды");
            System.out.println("Коту не хватило еды и голоден, сытость " + isFull);
        }
    }
}
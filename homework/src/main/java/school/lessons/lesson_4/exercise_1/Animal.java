package school.lessons.lesson_4.exercise_1;

public class Animal {
    // Подсчет созданных животных
    public Animal() {
        totalAnimals++;
    }

    public static int totalAnimals = 0; // изменила модификатор доступа на public, чтобы не добавлять геттер
    public static int totalCats = 0; // изменила модификатор доступа на public, чтобы не добавлять геттер
    public static int totalDogs = 0; // изменила модификатор доступа на public, чтобы не добавлять геттер

    public void run(int dist) {
    }

    public void swim(int dist) {
    }
}

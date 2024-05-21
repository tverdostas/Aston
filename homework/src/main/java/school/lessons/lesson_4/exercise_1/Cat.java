package school.lessons.lesson_4.exercise_1;

public class Cat extends Animal {

    static boolean isFull = false; // показывает сытость кошек

    // Подсчет созданных кошек
    public Cat() {
        super();
        totalCats++;
    }

    // Переопределение метода в классе-наследнике
    @Override
    public void run(int dist) {
        if (dist <= 200) {
            System.out.println("Кот пробежал " + dist + " метров");
        } else {
            System.out.println("Кот не может пробежать больше 200 метров");
        }
    }

    // Переопределение метода в классе-наследнике
    @Override
    public void swim(int dist) {
        System.out.println("Кот не умеет плавать");
    }
}

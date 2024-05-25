package school.lessons.lesson_4.exercise_1;

public class Dog extends Animal {
    private static int count; // счетчик созданных собак
    public Dog(String name) {
        super(name);
        count++;
        this.limitRun = 500;
        this.limitSwim = 10;
    }
    public static int getCount() {
        return count;
    }
}

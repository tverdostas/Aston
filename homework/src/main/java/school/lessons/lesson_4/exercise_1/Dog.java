package school.lessons.lesson_4.exercise_1;

public class Dog extends Animal {

    protected Dog(String name) {
        super(name);
        this.limitRun = 500;
        this.limitSwim = 10;
    }
}

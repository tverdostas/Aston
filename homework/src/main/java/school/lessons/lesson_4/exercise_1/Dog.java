package school.lessons.lesson_4.exercise_1;

public class Dog extends Animal {

    // Подсчет созданных собак
    public Dog() {
        super();
        totalDogs++;
    }
    // Переопределение метода в классе-наследнике
    @Override
    public void run(int dist){
        if (dist <= 500){
            System.out.println("Собака пробежала " + dist + " метров");
        } else {
            System.out.println("Собака не может пробежать больше 500 метров");
        }}

    // Переопределение метода в классе-наследнике
    @Override
    public void swim(int dist){
        if (dist <= 10){
            System.out.println("Собака проплыла " + dist + " метров");
        } else {
            System.out.println("Собака не может проплыть больше 10 метров");
        }
    }
}

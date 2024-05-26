package school.lessons.lesson_4;

import school.lessons.lesson_4.exercise_1.Bowl;
import school.lessons.lesson_4.exercise_1.Cat;
import school.lessons.lesson_4.exercise_1.Dog;
import school.lessons.lesson_4.exercise_2.Circle;
import school.lessons.lesson_4.exercise_2.Rectangle;
import school.lessons.lesson_4.exercise_2.Triangle;

public class Main {
    public static void main(String[] args) {

        // У каждого животного есть ограничения на действия:
        Cat cat = new Cat("Пушок", 2);
        cat.run(199);
        cat.run(201);
        cat.swim(2);

        Dog dog = new Dog("Шарик");
        dog.run(499);
        dog.run(500);
        dog.run(501);
        dog.swim(9);
        dog.swim(10);
        dog.swim(11);

       System.out.println("Всего животных: " + (Cat.getCount() + Dog.getCount()));
        System.out.println("Котов создано: " + Cat.getCount());
        System.out.println("Собак создано: " + Dog.getCount());

        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Барсик", 17);
        catsArray[1] = new Cat("Белка", 20);
        catsArray[2] = new Cat("Шанти", 15);

        Bowl bowl1 = new Bowl();
        for (int i = 0; i < catsArray.length; i++){
            catsArray[i].eatFood(bowl1);
        }

        // Добавим еды в миску
        bowl1.addFood(78);
        Cat cat2 = new Cat("Пухлик", 102);
        cat2.eatFood(bowl1);

        // Задание 2
        Circle circle = new Circle(10);
        circle.setColor("Желтый", "Оранжевый");
        circle.printInfo();

        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.setColor("Синий", "Голубой");
        rectangle.printInfo();

        Triangle triangle = new Triangle(9, 9, 11);
        triangle.setColor("Фиолетовый", "Бирюзовый");
        triangle.printInfo();
    }
}

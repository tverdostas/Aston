package school.lessons.lesson_4;

import school.lessons.lesson_4.exercise_1.*;
import school.lessons.lesson_4.exercise_2.Circle;
import school.lessons.lesson_4.exercise_2.Rectangle;
import school.lessons.lesson_4.exercise_2.Triangle;

import static school.lessons.lesson_4.exercise_1.Animals.*;

public class Main {
    public static void main(String[] args) {

        // У каждого животного есть ограничения на действия:
        createCat("Пушок", 2);
        createCat("Барсик", 102);
        createCat("Белка", 20);
        createCat("Шанти", 15);

        getCats().get(0).run(199);
        getCats().get(0).run(201);
        getCats().get(0).swim(2);

        Dog dog = createDog("Шарик");
        dog.run(499);
        dog.run(500);
        dog.run(501);
        dog.swim(9);
        dog.swim(10);
        dog.swim(11);

        printAnimalsCount();
        printCatsCount();
        printDogsCount();


        Bowl bowl1 = new Bowl(50);
        for (int i = 0; i < getCats().size(); i++){
            getCats().get(i).eatFood(bowl1);
        }

        // Добавим еды в миску
        bowl1.addFood(78);
        Cat cat2 = getCats().get(1);
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

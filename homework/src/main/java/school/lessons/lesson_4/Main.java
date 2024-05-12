package school.lessons.lesson_4;

import school.lessons.lesson_4.exercise_1.Animal;
import school.lessons.lesson_4.exercise_1.Bowl;
import school.lessons.lesson_4.exercise_1.Cat;
import school.lessons.lesson_4.exercise_1.Dog;
import school.lessons.lesson_4.exercise_2.Circle;
import school.lessons.lesson_4.exercise_2.Rectangle;
import school.lessons.lesson_4.exercise_2.Triangle;

public class Main {
    public static void main(String[] args) {
        Cat[] catsArray = new Cat[3];
        Cat cat1 = new Cat();
        Bowl bowl = new Bowl();

        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i] = new Cat();
        }
        // Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости котов в консоль
        bowl.feedCat(catsArray[0], 15);
        bowl.feedCat(catsArray[1], 50);
        bowl.feedCat(catsArray[2], 5);

        // Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20):
        bowl.feedCat(cat1, 70);

        // У каждого животного есть ограничения на действия:
        cat1.run(199);
        cat1.run(201);
        cat1.swim(2);

        Dog dog = new Dog();
        dog.run(499);
        dog.run(500);
        dog.run(501);
        dog.swim(9);
        dog.swim(10);
        dog.swim(11);

        Animal animal = new Animal();

        // Добавим еды в миску
        Bowl.addFood(2);
        bowl.feedCat(cat1, 1);

        System.out.println("Всего животных: " + Animal.totalAnimals);
        System.out.println("Котов создано: " + Animal.totalCats);
        System.out.println("Собак создано: " + Animal.totalDogs);

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

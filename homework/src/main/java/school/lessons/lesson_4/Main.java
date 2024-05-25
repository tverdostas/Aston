package school.lessons.lesson_4;

import school.lessons.lesson_4.exercise_1.Bowl;
import school.lessons.lesson_4.exercise_1.Cat;
import school.lessons.lesson_4.exercise_1.Dog;

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

        // Добавим еды в миску
/*        Bowl.addFood(2);
        bowl.feedCat(cat1, 1);*/

       System.out.println("Всего животных: " + (Cat.getCount() + Dog.getCount()));
        System.out.println("Котов создано: " + Cat.getCount());
        System.out.println("Собак создано: " + Dog.getCount());

        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Пушок3", 17);
        catsArray[1] = new Cat("Пушок4", 20);
        catsArray[2] = new Cat("Пушок5", 15);

        Bowl bowl1 = new Bowl();
        for (int i = 0; i < catsArray.length; i++){
            catsArray[i].eatFood(bowl1);
        }
    }
}

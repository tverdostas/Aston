package school.lessons.lesson_4.exercise_1;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    private static List<Animal> animals = new ArrayList<>();

    private static List<Cat> cats = new ArrayList<>();

    private static List<Dog> dogs = new ArrayList<>();

    public static Cat createCat(String name, int foodToEat) {
        Cat cat = new Cat(name, foodToEat);
        animals.add(cat);
        cats.add(cat);

        return cat;
    }

    public static Dog createDog(String name) {
        Dog dog = new Dog(name);
        animals.add(dog);
        dogs.add(dog);

        return dog;
    }

    public static List<Animal> getAnimals() {
        return animals;
    }

    public static List<Cat> getCats() {
        return cats;
    }

    public static List<Dog> getDogs() {
        return dogs;
    }

    public static int getAnimalsCount() {
        return animals.size();
    }

    public static int getCatsCount() {
        return cats.size();
    }

    public static int getDogsCount() {
        return dogs.size();
    }


    public static void printAnimalsCount() {
        System.out.println("Всего животных: " + getAnimalsCount());
    }

    public static void printCatsCount() {
        System.out.println("Котов создано: " + getCatsCount());
    }

    public static void printDogsCount() {
        System.out.println("Собак создано: " + getDogsCount());
    }
}

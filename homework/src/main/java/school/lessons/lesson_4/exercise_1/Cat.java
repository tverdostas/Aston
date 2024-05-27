package school.lessons.lesson_4.exercise_1;

public class Cat extends Animal {
    int foodToEat;
    private boolean isFull = false; // поменяла модификатор доступа

    protected Cat(String name, int foodToEat) {
        super(name);
        this.limitRun = 200;
        this.foodToEat = foodToEat;
    }

    public void eatFood(Bowl bowl){
        if (!isFull && foodToEat <= bowl.getFood()){
            bowl.ateFood(foodToEat);
            isFull = true;
            System.out.println("Кот " + name + " съел " + foodToEat + " . В миске осталось " + bowl.getFood());
            System.out.println("Кот поел и он не голоден, сытость " + getIsFull());
        } else {
            // Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть наполовину сыт
            isFull = false;
            System.out.println("В миске не может быть отрицательное количество еды");
            System.out.println("Коту по имени " + name + " не хватило еды и голоден, сытость " + getIsFull());
        }
    }
    // чтобы только определенный экземпляр мог работать с сытостью кота, создаю метод
    public boolean getIsFull() {
        return this.isFull;
    }

    /**
     * Кот не умеет плавать
     */
    @Override
    public void swim(int distance) {
        System.out.println();
    }
}

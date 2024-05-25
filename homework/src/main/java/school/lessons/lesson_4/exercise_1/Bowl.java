package school.lessons.lesson_4.exercise_1;

// Класс для задания с массивом кошек
public class Bowl {
        public int food = 50;

    // Функция для пополнения миски
    public void addFood(int amount) {
        food += amount;
        System.out.println("Добавили еды, теперь в миске " + food + " еды");
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
}
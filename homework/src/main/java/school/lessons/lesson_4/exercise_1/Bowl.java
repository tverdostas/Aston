package school.lessons.lesson_4.exercise_1;

// Класс для задания с массивом кошек
public class Bowl {
    public int capacity;

    public int food = 0;

    public Bowl(int capacity) {
        this.capacity = capacity;
    }

    // Функция для пополнения миски
    public void addFood(int amount) {
        if (amount >= capacity) {
            System.out.println("Миска уже полная");
        } else {
            int overage = amount - capacity;
            if (overage < 0) {
                capacity += amount;
                System.out.println("Добавили " + amount + " еды, теперь в миске " + food + " еды");
            } else {
                food = capacity;
                System.out.println("Добавили " + overage + "еды, теперь миска полная");
            }
        }
    }

    public int getFood() {
        return food;
    }

    public void ateFood(int food) {
        this.food = this.food - food;
    }
}
package school.lessons;

public class Lesson_7_testng {
    public static void main(String[] args) {

        int number = -5; // Число, для которого нужно найти факториал
        int factorial = getFactorial(number); // Вызываем функцию и сохраняем результат
        System.out.println("Факториал числа " + number + " равен: " + factorial);
    }

    public static int getFactorial(int f) {
        int result = 1;
        if (f < 0) {
            throw new IllegalArgumentException("Факториал можно вычислить только для неотрицательных чисел");
        } else {
            for (int i = 1; i <= f; i++) {
                result = result * i;
            }
        }
        return result;
    }
}
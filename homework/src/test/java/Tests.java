import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import school.lessons.Lesson_7_testng;

import static org.testng.Assert.assertEquals;

public class Tests {

    @Test
    @DisplayName("Прямой позитивный кейс, вычислить факториал")
    public void testFactorialForPositiveNumber(){
        int result = Lesson_7_testng.getFactorial(5);
        assertEquals(120, result);
    }
    @Test
    @DisplayName("Факториал 0 = 1")
    public void testFactorialForZero() {
        int result = Lesson_7_testng.getFactorial(0);
        assertEquals(1, result);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    @DisplayName("Нельзя посчитать факториал для отрицательного числа")
    public void testFactorialForNegativeNumber() {
        Lesson_7_testng.getFactorial(-2);}
}
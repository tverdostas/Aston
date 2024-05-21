import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import school.lessons.Lesson_7_junit_5;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    @DisplayName("Прямой позитивный кейс, вычислить факториал")
    public void testFactorialForPositiveNumber(){
        int result = Lesson_7_junit_5.getFactorial(5);
        assertEquals(120, result);
    }
    @Test
    @DisplayName("Факториал 0 = 1")
    public void testFactorialForZero() {
        int result = Lesson_7_junit_5.getFactorial(0);
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Нельзя посчитать факториал для отрицательного числа")
    void exceptionTesting() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Lesson_7_junit_5.getFactorial(-2),
                "Expected getFactorial() to throw, but it didn't");
        assertEquals("Факториал можно вычислить только для неотрицательных чисел", exception.getMessage());
    }
    }


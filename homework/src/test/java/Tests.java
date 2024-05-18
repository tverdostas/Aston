import org.junit.jupiter.api.Test;
import school.lessons.Lesson_7_junit_5;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void testFactorialForPositiveNumber(){
        int result = Lesson_7_junit_5.getFactorial(5);
        assertEquals(120, result);
    }
    @Test
    public void testFactorialForZero() {
        int result = Lesson_7_junit_5.getFactorial(0);
        assertEquals(1, result);
    }

    @Test
    void exceptionTesting() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Lesson_7_junit_5.getFactorial(-2), "Expected getFactorial() to throw, but it didn't");
        assertEquals("Факториал можно вычислить только для неотрицательных чисел", exception.getMessage());
    }
    }


import org.testng.annotations.Test;
import school.lessons.Lesson_7_testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class Tests {

    @Test
    public void testFactorialForPositiveNumber(){
        int result = Lesson_7_testng.getFactorial(5);
        assertEquals(120, result);
    }
    @Test
    public void testFactorialForZero() {
        int result = Lesson_7_testng.getFactorial(0);
        assertEquals(1, result);
    }

    @Test
    void exceptionTesting() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Lesson_7_testng.getFactorial(-2),
                "Expected getFactorial() to throw, but it didn't");
        assertEquals("Факториал можно вычислить только для неотрицательных чисел", exception.getMessage());
    }
}
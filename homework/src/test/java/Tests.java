import org.testng.annotations.Test;
import school.lessons.Lesson_7_testng;

import static org.testng.Assert.assertEquals;

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

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialForNegativeNumber() {
        Lesson_7_testng.getFactorial(-2);}
}
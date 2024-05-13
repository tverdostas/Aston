package school.lessons.lesson_5;

public class Lesson_5 {
    public static void main(String[] args) {
        // Прямой позитивный кейс
        String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        // Кейс для вызова ошибки "Не верный размер массива"
                /* String[][] array = {
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };*/

        // Кейс для вызова ошибки "Не правильный формат данных"
                /* String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "р", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };*/

        try {
            int sum = processArray(array);
            System.out.println("Сумма элементов массива равна " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Не верный размер массива");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не верный формат данных в позиции (" + i + ", " + j + ")"); // отсчет позиций начинается с 0!
                }
            }
        }
        return sum;
    }


    static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }


    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }


}
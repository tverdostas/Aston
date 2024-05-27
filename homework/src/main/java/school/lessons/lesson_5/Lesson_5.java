package school.lessons.lesson_5;

public class Lesson_5 {
    public static void main(String[] args) {
        // Прямой позитивный кейс
        String[][] array = new String[2][2];
        array[0][0] = "1";
        array[0][1] = "5";
        array[1][0] = "1";
        array[1][1] = "8";

        // Кейс для вызова ошибки "Не верный размер массива"
/*        String[][] array = new String[2][3];
        array[0][0] = "1";
        array[0][1] = "1";
        array[0][2] = "1";
        array[1][0] = "1";
        array[1][1] = "1";
        array[1][2] = "1";*/

        // Кейс для вызова ошибки "Не правильный формат данных"
/*        String[][] array = new String[2][2];
        array[0][0] = "1";
        array[0][1] = "h";
        array[1][0] = "1";
        array[1][1] = "1";*/

        try {
            int sum = processArray(array);
            System.out.println("Сумма элементов массива равна " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 2 || array[0].length != 2) {
            throw new MyArraySizeException("Не верный размер массива");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не верный формат данных в позиции (" + i + ", " + j + ")");
                }
            }
        }
        return sum;
    }
}
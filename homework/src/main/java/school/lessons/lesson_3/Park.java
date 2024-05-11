package school.lessons.lesson_3;

public class Park {

// вложенный класс Attraction
    public static class Attraction {
        private String attractionName;
        private String workingHours;
        private int attractionCost;

        // конструктор аттракциона
        public Attraction(String attractionName, String workingHours, int attractionCost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.attractionCost = attractionCost;
        }

        // функция для вывода инфо об аттракционе в консоль
        public void displayAttractionInfo() {
            System.out.println("Attraction: " + attractionName);
            System.out.println("Working hours: " + workingHours);
            System.out.println("Cost: " + attractionCost);
        }
    }
}

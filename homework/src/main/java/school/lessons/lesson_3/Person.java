package school.lessons.lesson_3;

public class Person {
    String FIO;
    String jobTitle;
    String email;
    String tel;
    int salary;
    int age;

    public Person(String FIO, String jobTitle, String email, String tel, int salary, int age) {
        this.FIO = FIO;
        this.jobTitle = jobTitle;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Kodica Oksana", "Accountant", "oksana.kodica@outlook.com", "89096638570", 28000, 23);
        persArray[2] = new Person("CHukreeva Vasilisa", "Accountant", "vasilisa1990@outlook.com", "890312312", 37000, 34);
        persArray[3] = new Person("Troshkin Filipp", "Manager", "filipptrosh@hotmail.com", "892312310", 45000, 41);
        persArray[4] = new Person("Safoshkin Viktor", "Mechanic", "viktor03061964@mail.ru", "892302310", 58000, 46);

        persArray[0].printInfo();
        persArray[1].printInfo();
        persArray[2].printInfo();
        persArray[3].printInfo();
        persArray[4].printInfo();

        // задание 3, вывод инфо о созданном аттракционе (класс Attraction является внутренним классом Park)
        Park.Attraction attraction_1 = new Park.Attraction("Карусель", "9:00 - 21:00", 250); // объект класса Attraction
        attraction_1.displayAttractionInfo();
    }

    public void printInfo() {
        System.out.println("FIO: " + FIO + ", Job Title: " + jobTitle + ", Email: " + email + ", Tel: " + tel + ", Salary: " + salary + ", Age: " + age);
    }
}
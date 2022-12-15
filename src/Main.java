public class Main {
    public static void main(String[] args) {
        // ЗАдача №1
        System.out.println("Задача №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.println( "ФИО сотрудника - " + lastName + " " + firstName + " "+ middleName);
        // ЗАдача №2
        System.out.println("Задача №2");
        String smallFullName = "Ivanov Ivan Ivanovich";
        System.out.println(smallFullName.toUpperCase());
        // Задача №3
        System.out.println("Задача №3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}
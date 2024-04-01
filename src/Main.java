public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        firstName = firstName.replace(" ", "");
        middleName = middleName.replace(" ", "");
        lastName = lastName.replace(" ", "");
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println(" ");
        System.out.println("Задание 2:");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

    }
}
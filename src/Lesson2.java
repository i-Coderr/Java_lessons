import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        /*        String name = "Azamat";
        int age = 26;
        double weight = 71.5;
        boolean isActive = true;

        System.out.println("Hey! My name is " + name +
                ". I'm " + age + " year's old. And my weight is: "+  weight +
                ". He is present a lesson toady? " + isActive);*/


        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("Please enter your age: ");
        int age1 = scanner.nextInt();
        System.out.println("Hello " + firstName + " " + lastName + " and your age is: " + age1);
    }
}

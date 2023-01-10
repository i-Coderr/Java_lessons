import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

/*        //TODO if statement
        int x = 20;
        int y = 18;

        if (x > y) {
            System.out.println("20 is greater than 18");
        }*/



/*        //TODO else statement
        int time = 15;

        if (time < 18) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }*/


/*        //TODO else if statement
        int time = 20;

        if (time < 10){
            System.out.println("Good morning!");
        } else if (time < 18) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }*/


/*        //TODO Ternary operator
        int time = 14;
        String result = (time < 18) ? "Good day!" : "Good evening!";
        System.out.println(result);*/

        //TODO Сабактагы тапшырма#3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Баллыңызды жазыңыз: ");
        int ball = scanner.nextInt();
        String result = (ball >= 50) ? "pass" : "fail";
        System.out.println("Результат: " + result);
    }
}

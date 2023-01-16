import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {

/*        //TODO while loop
        int a = 0;
        while (a < 10) {
            System.out.println("Hello");
            a++; // a = a + 1;
        }*/

/*        //TODO for loop
        for (int i = 0; i < 2; i++){
            System.out.println("Hello");
        }*/

/*        //TODO сабактагы тапшырма#1
        for (int i = 0; i<=10; i = i + 2){
            System.out.println(i);
        }*/

/*        //TODO сабактагы тапшырма#2
        for (int i = 1; i <= 10; i++) {
            System.out.println(9 + " * " + i + " = " + (9 * i) + ";");
        }*/

/*        //TODO сабактагы тапшырма#3
        int sum = 0;

        for (int i = 1; i <= 100; ++i){
            sum += i;
        }

        for (int i = 100; i >= 1; --i){
            sum += i;
        }

        System.out.println("Sum = " + sum);*/

/*        //TODO Infinite loop

        for (int i = 1; i >= 1; i ++){
            System.out.println("Infinite Loop1");
        }

        for (;;) {
            System.out.println("Infinite Loop2");
        }*/

/*        //TODO Nested for loop

        for (int i = 1; i <= 2; i++) { // Сырткы цикл
            System.out.println("Сырткы: " + i); // 2 жолу аткарылат

            for (int j = 1; j <= 3; j++) {    // Ички цикл
                System.out.println(" Ички: " + j); //6 жолу аткарылат (2 * 3)
            }
        }*/

        //TODO Сабактагы тапшырма#4
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {

/*        //TODO String
        String greeting = "Hello";
        String world = " World ";
        System.out.println(greeting.concat(world));

        String text = "Hello";
        System.out.println("Текстин узундугу " + text.length());

        String txt = "Hello World!";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = in.nextLine();
        System.out.println(name);*/

/*        //TODO array
        String car1 = "Porsche";
        String car2 = "BMW";
        String car3 = "Ford";
        String car4 = "Toyota";

        String [] garage = {"Porsche", "BMW", "Ford", "Toyota", "Lada", "Tesla"};

        garage[2] = "Lamborghini";
        System.out.println(garage[2]);
        System.out.println();

        for (int i = 0; i < garage.length; i++){
            System.out.println(garage[i]);
        }

        System.out.println(garage.length);

                       // 0123456789
        String Porsche = "Porsche is my favorite car";
        System.out.println(Porsche.indexOf("r"));*/

/*        //TODO сабактагы тапшырма#1
        int size = 10;
        String [] numbers = new String[size];
        numbers[0] = "1. Black";
        numbers[1] = "2. White";
        numbers[2] = "3. Red";
        numbers[3] = "4. Green";
        numbers[4] = "5. Yellow";
        numbers[5] = "6. Pink";
        numbers[6] = "7. Purple";
        numbers[7] = "8. Blue";
        numbers[8] = "9. Brown";
        numbers[9] = "10. Orange";


        //for each
        for (String x : numbers) {
            System.out.println(x);
        }

        // for loop
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }*/

/*        //TODO for loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }*/

/*        //TODO for each
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars2) {
            System.out.println(i);
        }*/

/*        //TODO Random
        Random random = new Random();
        int size = 5;
        int[] array = new int[size];;

        for (int i = 0; i < size; i++){
            int randomNumbers = random.nextInt(100);
            array[i] = randomNumbers;
        }
        for (int a :array){
            System.out.println(a);
        }*/

        //TODO сабактагы тапшырма#2
        Random random = new Random();
        int[] array = new int[10];

        int average;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 20);
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        average = sum / array.length;
        System.out.println();
        System.out.println("Average of random numbers: " + average);

    }
}

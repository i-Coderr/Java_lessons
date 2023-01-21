import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

//        int[] numbers = {8, 2, 7, 1, 4, 9, 5};
//        int s = numbers[0];
//        int l = numbers[0];
//
//        for(int i = 1; i < numbers.length; i++) {
//            if(numbers[i] > l)l = numbers[i];
//            else if (numbers[i] < s)s = numbers[i];
//        }
//        System.out.println("Largest Number is : " + l);
//        System.out.println("Smallest Number is : " + s);

        System.out.println("Массивдин размерин бер: ");
        int size = new Scanner(System.in).nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = new Random().nextInt(1, 50);
        }

        universalMethod(array);

    }

    static void universalMethod (int [] numbers){
        int max = 0, counter = 0, counter2 = 0, sum = 0;

        for (int number : numbers) {
            sum += number;
            if (number % 2 == 0) {
                counter2++;
            } else {
                counter++;
            }
            if (number > max) {
                max = number;
            }

        }
        System.out.println(Arrays.toString(numbers) + "\nЖалпы сумма: " + sum + "\nЭң чон сан: " + max
        + "\nЖуп сандар: " + counter2 + "\nТак сандар: " + counter + "\nОрточо сан: " + sum / numbers.length);

    }
}

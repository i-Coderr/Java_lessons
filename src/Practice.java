import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

/*        Student st = new Student();
        st.setEmail("Java");
        Student st2 = new Student();
        st2.setEmail("Java");
        Student st3 = new Student();
        st3.setEmail("JS");
        Student st4 = new Student();
        st4.setEmail("Js");
        Student st5 = new Student();
        st5.setEmail("Java");

        Student[] students = {st, st2, st3, st4, st5};
        int count = 0, count2 = 0;
        for (Student student: students){
            System.out.println(student);
        }
        for (int i = 0; i < students.length; i++) {
            if (students.equals("Java")) {
                count++;
            } else count2++;
        }

        System.out.println("Java = " + count+ "JS = " + count2);*/

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


        method(1, 2, 3, 4.4, 5, 6.6, 7, 8, 9.9, 10);
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

    static void method(double... varags) {
        for (double san : varags) {
            if (san == 4.4 || san == 6.6 || san == 9.9) {
                System.out.println(san);
            }
        }
    }

}

import java.util.Arrays;

public class Lesson8 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] numbers2 = {100, 101, 102, 103, 104, 105};
        array(numbers);
        array(numbers2);

        }

    //TODO Массивдин ичиндеги элементтерди чыгарып бере турган метод
    static void array(int[] numbers) {
        for (int print : numbers){
            System.out.println(print);
        }
    }

/*    //TODO параметри менен метод
    static void methodWithParameter(String name) {
        System.out.println("Hello " + name);
    }*/

/*
    //TODO эч нерсе кайтарбаган метод
    static void myFirstVoidMethod() {
        System.out.println("This is void method");
    }
*/

/*    //TODO көп параметрлүү метод
    static void methodWithMultipleParameter(String name, int age) {
        System.out.println(name + " is " + age);
    }*/

/*    //TODO эки сандын суммасын тапкан метод
    static void sumOfTwoNumbers(int a, int b) {
        System.out.println("Эки сандын суммасы: " + (a + b));
    }*/

/*    //TODO так же жуп санды тапкан метод
    static void findEvenOrOddNumbers(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " бул жуп сан");
        } else {
            System.out.println(num + " бул так сан");
        }
    }*/

/*    //TODO минимальный санды тапкан метод
    static void findMinNumber(int a, int b){
        System.out.println(Math.min(a, b));
    }*/

}


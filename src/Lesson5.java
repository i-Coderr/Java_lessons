import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

        //TODO while
        int counter = 0;                             // cчетчик
        while (counter < 10){                        // счетчик 10дон кичине болсо
            System.out.println(counter + "Hello");   // консольго Hello деп чыгар
            counter++;                               // счетчик 1ге көбөй
        }


/*        //TODO Сабактагы тапшырма#1
        Scanner scanner = new Scanner(System.in);
        int counter =scanner.nextInt();

        while (counter>1){
            counter --;
            System.out.println(counter);
        }*/


/*        //TODO Сабактагы тапшырма#2
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ++a;
        while (a < b){
            System.out.println(Math.pow(a, 2));
            ++a;
        }*/

/*        //TODO Сабактагы тапшырма#3
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int counter = 0;
        while (a > counter){
            counter++;
            if (counter % 2 == 1){
                System.out.println(counter);
            }
        }*/

    }
}

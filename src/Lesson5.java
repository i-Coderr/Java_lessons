import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

/*        //TODO while
        int a = 0;                              // cчетчик
        while (a < 10) {                        // счетчик 10дон кичине болсо
            System.out.println("Hello");        // консольго Hello деп чыгар
            a++;                                // счетчик 1ге көбөйт
        }*/

/*        //TODO do while

        int a = 10;
        do{
            System.out.println(a + ". Hello");
            a--;
        } while (a > 0);*/


/*        //TODO Сабактагы тапшырма#1
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        while (counter > 1) {
            counter--;
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
            if (counter % 2 == 0){
            }
            System.out.println(counter);
            counter++;
        }*/

        //TODO break
        int counter = 0;

        while(10 > counter){
            counter++;
            System.out.println(counter + ". Hello");
            if (counter == 3) {
                break;
            }
        }

    }
}

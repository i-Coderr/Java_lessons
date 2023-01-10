import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

/*      //TODO Арифетикалык операторлор
        double a = 12, b = 5;

        // Кошуу оператору
        System.out.println("a + b = " + (a + b));

        // Алуу оператору
        System.out.println("a - b = " + (a - b));

        // Көбөйтүү оператору
        System.out.println("a * b = " + (a * b));

        // Бөлүү оператору
        System.out.println("a / b = " + (a / b));

        // Модуль оператору
        System.out.println("a % b = " + (a % b));*/



/*        //TODO Ыйгаруу операторлор
        int a = 4;
        int b;

        //  = колдонуп маани ыйгаруу
        b = a;
        System.out.println("b мааниси = " + b); // b = 4

        //  += колдонуп маани ыйгаруу
        b += a; // b = b - a
        System.out.println("b маанис += " + b); // b = 4 + 4

        //  *= колдонуп маани ыйгаруу
        b *= a; // b = b % a
        System.out.println("b мааниси *= " + b); //b = 8 * 4*/




/*        //TODO Унардык оператор
        int x = 5, y = 5;

        // x = 6 болот дагы, анан x чыгарып жатабыз
        System.out.println(++x);

        // 5 чыгат, анан y = 6 болот.
        System.out.println(y++);
        System.out.println(y);*/


/*        //TODO Math классынын методдору
        System.out.println(Math.max(61, 25));
        System.out.println(Math.min(10, 9));
        System.out.println(Math.round(8.5));
        System.out.println(Math.sqrt(16)); //4
        System.out.println(Math.ceil(6.1));  //7
        System.out.println(Math.floor(6.9)); //6
        System.out.println(Math.random());*/




/*        //TODO Сабактагы тапшырма №1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Бөлчөк сан жазыңыз: ");
        double number = scanner.nextDouble();
        double result = number - Math.floor(number); // 3.5 - 3.0 = 0.5
        System.out.println("Жообу: " + result);*/




/*        //TODO Random класс
        Random random = new Random();         // сандарды генерация кылат
        int a = random.nextInt(100);   // 100 чейинки сандарды дедик
        System.out.println("Рандом сан: " + a);*/



/*        //TODO Сабактагы тапшырма 2
        Random random = new Random();
        int a = random.nextInt(10);
        System.out.println("Биринчи сан: " + a);
        int b = random.nextInt(10);
        System.out.println("Экинчи сан: " + b);
        int c = random.nextInt(10);
        System.out.println("Үчүнчү сан: " + c);
        System.out.println("Cуммасы: " + (a + b + c));
        System.out.println("Көбөйтүүсү: " + (a * b * c));
        System.out.println("Арифетикалык орточо саны: " + (double) (a + b + c)/3);*/



        //TODO Үй тапшырма №3
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double temperature = in.nextDouble();
        temperature = ((temperature - 32)*5)/9;
        System.out.println("Temperature in Celsius = " + temperature);

    }
}
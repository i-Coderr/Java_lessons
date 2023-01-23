public class Lesson9 {
    public static void main(String[] args) {

        myFirstVoidMethod();
        System.out.println(myFirstReturnMethod());

//        sumWithVoidMethod( 10, 15);

//        int sum = sumWithReturnMethod(10, 15);
//        System.out.println("Эки сандын суммасы (return) " + sum);

//        int n = one();
//        System.out.println(n + 1);

//        System.out.println(function(150));

//        System.out.println(nameComparison("Ulan"));

    }
    //TODO void метод string sample
    static void myFirstVoidMethod() {
        System.out.println("This is void method");
    }

    //TODO return метод string sample
    static String myFirstReturnMethod(){
        return "This is return method";
    }

/*    //TODO void метод
    static void sumWithVoidMethod(int a, int b) {
        System.out.println("Эки сандын суммасы (void) " + (a + b));
    }*/

/*    //TODO return метод
    static int sumWithReturnMethod(int a, int b) {
        return a + b;
    }*/

/*    //TODO return method like variable
    static int one() {
        return 1;
    }*/

/*    //TODO String type example
    static String function(int a) {
        if (a < 10)
            return "Number less than 10";
        if (a < 100)
            return "Number greater than 10 but less than 100";
        a = a * 10;
            return "Number greater than or equal to 100";
        }
    }*/


/*    //TODO Сабактагы тапшырма#3
    static String nameComparison(String name) {
        if (name.length() <= 4) {
            return "Сиздин атыңыз кыска";
        } else if (name.length() <= 7) {
            return "Сиздин атыңыздын узундугу орточо";
        } else {
            return "Сиздин атыңыз узун экен";
        }
    }*/

}

public class Lesson9 {
    public static void main(String[] args) {

//        System.out.println(myFirstReturnMethod());

//        sumWithVoidMethod( 10, 15);

//        int sum = sumWithReturnMethod(10, 15);
//        System.out.println("Эки сандын суммасы (return) " + sum);

//        int n = one();
//        System.out.println(n + 1);

//        System.out.println(function(8));

//        System.out.println(arithmetic(4, 5, 4));

//        System.out.println(nameComparison("Abdusamat"));

        int[] array = {1, 2, 3, 44, 5, 6, 7, 8, 9, 10};
        int l = array.length;
        System.out.println(getMax(array, l));
    }

//    //TODO return метод string sample
//    static String myFirstReturnMethod(){
//        return "This is return method";
//    }

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

/*    //TODO сабактагы тапшырма#1
    static String function(int a) {
        if (a % 2 == 1) {
            return "Так сан";
        }
        return "Жуп сан";
    }*/

/*    //TODO сабактагы тапшырма#2
    static double arithmetic(int a, int b, int c) {
        return (a + b + c) / 3D;
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

    //TODO сабактагы тапшырма#4
    static int getMax(int arr[], int n)
    {
        int max = arr[0];
        for (int i = 1; i < n; i++)
            max = Math.max(max, arr[i]);
        return max;
    }

}

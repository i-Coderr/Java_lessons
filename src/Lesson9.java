public class Lesson9 {
    public static void main(String[] args) {

        sumWithVoidMethod( 10, 15L);

        int sum = sumWithReturnMethod(10, 15);
        System.out.println("Эки сандын суммасы (return) " + sum);


    }

        //TODO void метод
    static void sumWithVoidMethod(int a, long b) {
        System.out.println("Эки сандын суммасы (void) " + (a + b));
    }

    //TODO return метод
    static int sumWithReturnMethod(int a, int b){
        return a + b;
    }

}

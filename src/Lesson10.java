public class Lesson10 {
    public static void main(String[] args) {

        method(1, 3, 5, 7, 9, 111, 555, 9999);

//        int [] array = {1, 2, 3, 4, 5};
//        varargsMethod(array);

//        varargsMethod(1, 2, 3, 4, 5);

//        sum(10, 20, 30);
//        System.out.println(sum2(10, 20, 30));

    }

    static void method(int... varargs) {
    }

/*    //TODO varargs like array
                             //int [] numbers
    static void varargsMethod (int ... numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }*/

/*    //TODO not allowed sample
    static void method(int ... numbers, int ... numbers2){
        //2 varargs болбойт
    }

    static void function(int ... numbers, String words){
        //varargs аргументтен биринчи турат
    }*/


/*    //TODO сабактагы тапшырма for менен
    static void sum(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }*/

/*    //TODO сабактагы тапшырма foreach менен
    static int sum2(int ... numbers){
        int sum = 0;
        for (int arr : numbers){
            sum = sum + arr;
        }
        return sum;
    }*/

}

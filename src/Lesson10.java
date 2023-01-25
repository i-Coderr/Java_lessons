public class Lesson10 {
    public static void main(String[] args) {

        String[] footballPlayers = new String[11];
        footballPlayers[0] = "Ronaldo";
        footballPlayers[1] = "Messi";
        footballPlayers[2] = "Mbappe";
        footballPlayers[3] = "Pele";
        footballPlayers[4] = "DiMaria";

       // method(1, 2.2, "Ronaldo", "Messi", "Mbappe", "Pele", "DiMaria", "Azamat Baimatov");


//        varargsMethod(1, 2, 3, 4, 5);

//        varargsMethod(1, 2, 3, 4, 5);

        sum(10, 20, 30);
        System.out.println(sum2(10, 20, 30));

    }

/*    static void method(int age, double num, String ... name) {
        System.out.println(age);
        System.out.println(num);
        for (String n : name) {
            System.out.println(n);
        }
    }*/


/*    //TODO varargs like array
    static void varargsMethod(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }*/

/*    //TODO not allowed sample
    static void method(int... numbers, int... numbers2) {
        //2 varargs болбойт
    }

    static void function(String words, int... numbers) {
        //varargs биринчи аргументтен кийин туруш керек
    }*/


    //TODO сабактагы тапшырма for менен
    static void sum(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }

    //TODO сабактагы тапшырма foreach менен
    static int sum2(int ... numbers){
        int sum = 0;
        for (int arr : numbers){
            sum = sum + arr;
        }
        return sum;
    }

}

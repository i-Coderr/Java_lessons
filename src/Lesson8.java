public class Lesson8 {
    public static void main(String[] args) {

        myMethod();
        methodWithParameter("Java");
        methodWithMultipleParameter("Chyngyz", 36);
    }

    //TODO эч нерсе кайтарбаган метод
    static void myMethod(){
        System.out.println("This is void method");
    }


    //TODO параметри менен метод
    static void methodWithParameter(String name){
        System.out.println("Hello " + name);
    }

    //TODO көп параметрлүү метод
    static void methodWithMultipleParameter(String name, int age){
        System.out.println(name + " is " + age);
    }



}

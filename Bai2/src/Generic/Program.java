package Generic;

public class Program {
    public static void main(String[] args) {
        // Gen class
        GenericClass<String> test = new GenericClass<String>();
        test.setItem("abc");
        System.out.println(test.getItem());

        GenericClass<Integer> test1 = new GenericClass<Integer>();
        test1.setItem(123);
        System.out.println(test1.getItem());

        // Gen method
        GenericMethod test2 = new GenericMethod();
        Integer[] intArray = {1,2,3};
        String[] stringArray = {"A","B","C"};

        test2.print(intArray);
        test2.print(stringArray);

        // Gen interface
        GenericClass2<String> test3 = new GenericClass2<String>();
        test3.display("Hello");

    }
}

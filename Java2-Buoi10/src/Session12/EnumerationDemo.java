package Session12;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationDemo {
	public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        Enumeration<String> enumeration = fruits.elements();

        System.out.println("Fruits in the list:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}

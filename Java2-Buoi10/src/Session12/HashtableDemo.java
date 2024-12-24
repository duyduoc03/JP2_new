package Session12;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Thêm các cặp key-value
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

        System.out.println("Hashtable content:");
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println(key + ": " + hashtable.get(key));
        }

        // Kiểm tra key
        System.out.println("Contains key 2? " + hashtable.containsKey(2));

        // Xóa phần tử
        hashtable.remove(2);
        System.out.println("Hashtable after removal: " + hashtable);
	}
}

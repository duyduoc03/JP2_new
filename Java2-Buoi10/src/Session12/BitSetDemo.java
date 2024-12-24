package Session12;

import java.util.BitSet;

public class BitSetDemo {
	public static void main(String[] args) {
		BitSet bitSet1 = new BitSet();
	    BitSet bitSet2 = new BitSet();

	    // Đặt bit
	    bitSet1.set(0);
	    bitSet1.set(2);
	    bitSet2.set(1);
	    bitSet2.set(2);

	    System.out.println("BitSet 1: " + bitSet1);
	    System.out.println("BitSet 2: " + bitSet2);

	    // Toán tử OR
	    bitSet1.or(bitSet2);
	    System.out.println("BitSet 1 OR BitSet 2: " + bitSet1);

	    // Toán tử AND
	    bitSet1.and(bitSet2);
	    System.out.println("BitSet 1 AND BitSet 2: " + bitSet1);
	}	
}

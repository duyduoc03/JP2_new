package Stream;

import java.util.stream.Stream;

public class Main2 {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
			stream.takeWhile(n -> n < 4)
			      .forEach(System.out::println);
		
		System.out.println("------");
		
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
			stream2.dropWhile(n -> n < 4)
			      .forEach(System.out::println);	
			
		System.out.println("------");
		
		Stream.iterate(1, n -> n <= 10, n -> n+1)
		      .forEach(System.out::println);
	}

}

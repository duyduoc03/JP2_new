package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Khoi tao 1 mang, in ra cac phan tu trong mang
		//Mang thuan tuy
		int[] array = {1,2,3,4,5};
		for(int i =0; i< array.length; i++) {
			System.out.println(array[i]);
		}
		//Stream
		Arrays.stream(array)
			  .forEach(System.out::println);
		//In ra cac phan tu chan trong mang
		//Mang thuan tuy
		List<Integer> result = new ArrayList<>();
		for(int i=0;i< array.length; i++) {
			if(array[i] %2 == 0) {
				result.add(array[i]);
			}
		}
		System.out.println(result);
		//Stream
		Arrays.stream(array)
		      .filter(n -> n%2 == 0)
		      .forEach(System.out::println);
		//In ra mang co gia tri la gap doi cac gia tri trong mang array
		//Stream
		System.out.println("------");
		Arrays.stream(array)
	          .map(n -> n*1)
	          .forEach(System.out::println);
		//Tinh tong
		int tong = Arrays.stream(array)
				         .reduce(0, Integer::sum);
		System.out.println(tong);
		System.out.println("------");
		//Xu ly song song
		Arrays.stream(array)
		      .parallel()
              .map(n -> n*1)
              .forEach(System.out::println);
	}

}

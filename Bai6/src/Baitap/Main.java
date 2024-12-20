package Baitap;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
//		Cho 1 danh sách các số nguyên
//		1. Tìm và in ra các số lẻ
		System.out.println("--------------------");
		Arrays.stream(array)
	      .filter(n -> n%2 != 0)
	      .forEach(System.out::println);
//		2. Tính tổng các số chẵn
		System.out.println("--------------------");
		int sum = Arrays.stream(array)
				        .filter(n -> n%2 == 0)
				        .reduce(0, Integer::sum);
	    System.out.println(sum);
//		3. Tìm số max, min (max, min)
	    System.out.println("--------------------");
		int max = Arrays.stream(array)
				        .max()
				        .orElseThrow(() -> new RuntimeException("Khong co so nao"));
		int min = Arrays.stream(array)
		                .min()
		                .orElseThrow(() -> new RuntimeException("Khong co so nao"));
		System.out.println(max);
		System.out.println(min);
//		4. Sắp xếp theo thứ tự tăng dần (sorted)
		System.out.println("--------------------");
		Arrays.stream(array)
		      .sorted()
		      .forEach(System.out::println);
//		5. Đếm số phần tử thỏa mãn điều kiện chia hết cho 5 (count)
		System.out.println("--------------------");
		long count = Arrays.stream(array)
				          .filter(n -> n%5 == 0)
				          .count();
		System.out.println(count);
//		6. Loại bỏ các phần tử trùng lặp (distinct)
		System.out.println("--------------------");
		Arrays.stream(array)
	          .distinct()
	          .forEach(System.out::println);
//		7. Tạo danh sách bình phương của các phần tử
		System.out.println("--------------------");
		Arrays.stream(array)
		      .map(n -> n*n)
		      .forEach(System.out::println);
	}
}

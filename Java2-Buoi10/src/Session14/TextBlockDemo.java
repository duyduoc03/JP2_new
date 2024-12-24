package Session14;

public class TextBlockDemo {
	public static void main(String[] args) {
		//Sử dụng Text Blocks để tạo chuỗi nhiều dòng
		String json = """
                {
                    "name": "Hai",
                    "age": 30,
                    "city": "HN"
                }
                """;

        System.out.println(json);
	}
}

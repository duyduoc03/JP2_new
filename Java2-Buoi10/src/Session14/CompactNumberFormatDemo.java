package Session14;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatDemo {
	public static void main(String[] args) {
		//Định dạng số dạng ngắn gọn
		NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);

        System.out.println(formatter.format(1000));  // 1K
        System.out.println(formatter.format(1000000)); // 1M
        System.out.println(formatter.format(1000000000)); // 1B
	}
}

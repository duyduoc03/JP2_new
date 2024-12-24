package Session14;

import java.util.Scanner;

public class EnhancedSwitchDemo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ví dụ 1: Nhiều giá trị trong một case
        System.out.print("Nhập mã sản phẩm (101-105): ");
        int productId = scanner.nextInt();
        switch (productId) {
            case 101, 102, 103 -> System.out.println("Bạn đã chọn một đồng hồ thông minh!");
            case 104, 105 -> System.out.println("Bạn đã chọn một điện thoại thông minh!");
            default -> System.out.println("Sản phẩm không tồn tại!");
        }

        // Ví dụ 2: Sử dụng yield để trả về giá trị
        System.out.print("\nNhập mã trạng thái (0-3): ");
        int statusCode = scanner.nextInt();
        String status = switch (statusCode) {
            case 0 -> "Đang xử lý";
            case 1 -> "Đã hoàn thành";
            case 2 -> {
                String extraInfo = "Đã bị hủy - ";
                yield extraInfo + "Không thể hoàn thành đơn hàng.";
            }
            case 3 -> "Chờ xử lý";
            default -> "Mã trạng thái không hợp lệ!";
        };
        System.out.println("Trạng thái: " + status);

        // Ví dụ 3: Phạm vi riêng biệt cho từng case
        System.out.print("\nNhập mã khách hàng (1-2): ");
        int customerId = scanner.nextInt();
        switch (customerId) {
            case 1 -> {
                int discount = 10; // Biến chỉ tồn tại trong phạm vi này
                System.out.println("Khách hàng VIP! Giảm giá: " + discount + "%");
            }
            case 2 -> {
                int discount = 5; // Biến khác phạm vi trên
                System.out.println("Khách hàng thông thường. Giảm giá: " + discount + "%");
            }
            default -> System.out.println("Mã khách hàng không hợp lệ!");
        }
    }
}

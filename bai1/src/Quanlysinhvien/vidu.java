package Quanlysinhvien;

public class vidu {
    public static void main(String[] args) {
        System.out.println("Cau lenh 1");
        System.out.println("Cau lenh 2");
        try {
            int ketqua = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("loi");
        } finally {
            System.out.println("Luon chay khong can biet dung sai");
        }
        System.out.println("Cau lenh 3");
        System.out.println("Cau lenh 4");

        try {
            int[] dayso = {1,2,3,4};
            System.out.println(dayso[5]);
        } catch (Exception e) {
            System.out.println("loi");
        }
    }
}

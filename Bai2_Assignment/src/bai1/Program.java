package bai1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Student> liststudent = new ArrayList<>();
        liststudent.add(new Student(1, "Nguyen Van A"));
        liststudent.add(new Student(2, "Nguyen Van B"));
        liststudent.add(new Student(3, "Nguyen Van C"));

        // Hiển thị danh sách sinh viên
        for (Student student : liststudent) {
            System.out.println(student);
        }

        // Chuyển các student sang "Đại học công nghệ"
        Student.setCollege("Đại học công nghệ");

        // Hiển thị danh sách sinh viên
        System.out.println("Các sinh viên sau khi chuyển trường");
        for (Student student : liststudent) {
            System.out.println(student);
        }

        // Phần 2
        // Bước 1: Nộp quỹ - mỗi sinh viên nộp 100k
        for (Student student : liststudent) {
            Student.moneyGroup += 100;
            System.out.println(student.getName() + " đã nộp 100k vào quỹ lớp.");
        }
        System.out.println("Sau khi nộp quỹ, tiền quỹ lớp: " + Student.moneyGroup + "k");

        // Bước 2: Student 1 lấy 50k mua bim bim
        Student.moneyGroup -= 50;
        System.out.println(liststudent.get(0).getName() + " đã lấy 50k từ quỹ lớp mua bim bim, tiền quỹ lớp còn: " + Student.moneyGroup + "k");

        // Bước 3: Student 2 lấy 20k mua bánh mì
        Student.moneyGroup -= 20;
        System.out.println(liststudent.get(1).getName() + " đã lấy 20k từ quỹ lớp mua bánh mì, tiền quỹ lớp còn: " + Student.moneyGroup + "k");

        // Bước 4: Student 3 lấy 150k mua đồ dùng học tập
        Student.moneyGroup -= 150;
        System.out.println(liststudent.get(2).getName() + " đã lấy 150k từ quỹ lớp để mua đồ dùng học tập.");
        System.out.println("Sau khi mua đồ dùng học tập, tiền quỹ lớp còn: " + Student.moneyGroup + "k");

        // Bước 5: Mỗi sinh viên đóng lại 50k
        for (Student student : liststudent) {
            Student.moneyGroup += 50;
            System.out.println(student.getName() + " đã nộp lại 50k vào quỹ lớp.");
        }
        System.out.println("Sau khi cả nhóm đóng thêm tiền quỹ lớp: " + Student.moneyGroup + "k");
    }
}

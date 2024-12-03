package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------MENU--------");
            System.out.println("1. Nhập thông tin person");
            System.out.println("2. Hiển thị thông tin person");
            System.out.println("3. Nhập thông tin sinh viên");
            System.out.println("4. Hiển thị thông tin sinh viên");
            System.out.println("5. Kiểm tra học bổng");
            System.out.println("6. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Nhập thông tin person
                    Person person = new Person();
                    System.out.println("Nhập thông tin person:");
                    person.inputInfo();
                    personList.add(person);
                    System.out.println("Thêm person thành công!");
                    break;

                case 2:
                    // Hiển thị thông tin person
                    if (personList.isEmpty()) {
                        System.out.println("Danh sách person trống.");
                    } else {
                        System.out.println("Danh sách person:");
                        for (Person s : personList) {
                            s.showInfo();
                            System.out.println("-------------------");
                        }
                    }
                    break;
                case 3:
                    // Nhập thông tin sinh viên
                    Student student = new Student();
                    System.out.println("Nhập thông tin sinh viên:");
                    student.inputInfo();
                    studentList.add(student);
                    System.out.println("Thêm sinh viên thành công!");
                    break;

                case 4:
                    // Hiển thị thông tin sinh viên
                    if (studentList.isEmpty()) {
                        System.out.println("Danh sách sinh viên trống.");
                    } else {
                        System.out.println("Danh sách sinh viên:");
                        for (Student s : studentList) {
                            s.showInfo();
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 5:
                    // Kiểm tra học bổng
                    if (studentList.isEmpty()) {
                        System.out.println("Danh sách sinh viên trống.");
                    } else {
                        for (Student s : studentList) {
                            System.out.println(s.getName() + " " +
                                    (s.isScholarshipEligible() ? "đủ" : "không đủ") +
                                    " điều kiện nhận học bổng.");
                        }
                    }
                    break;

                case 6:
                    // Thoát chương trình
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn số");
            }
        }
    }
}
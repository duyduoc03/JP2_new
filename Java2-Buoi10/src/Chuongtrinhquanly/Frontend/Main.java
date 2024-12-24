package Chuongtrinhquanly.Frontend;

import java.util.Scanner;

import Chuongtrinhquanly.Backend.PersonDAOImp;
import Chuongtrinhquanly.Entity.Mentor;
import Chuongtrinhquanly.Entity.Student;

public class Main {
	private static PersonDAOImp person = new PersonDAOImp();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm dữ liệu");
            System.out.println("2. Hiển thị dữ liệu");
            System.out.println("3. Xóa dữ liệu");
            System.out.println("4. Sửa dữ liệu");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addData(scanner);
                    displayAll();
                    break;
                case 2:
                	displayData(scanner);
                    break;
                case 3:
                    deleteData(scanner);
                    break;
                case 4:
                    updateData(scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
        scanner.close();
    }
	private static void addData(Scanner scanner) {
        System.out.println("Chọn loại người muốn thêm:");
        System.out.println("1. Student");
        System.out.println("2. Mentor");
        System.out.print("Lựa chọn: ");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        String country = scanner.nextLine();

        if (type == 1) { // Thêm Student
            System.out.print("Nhập điểm Tin: ");
            double diemTin = scanner.nextDouble();
            System.out.print("Nhập điểm Toán: ");
            double diemToan = scanner.nextDouble();
            Student student = new Student(name, age, country, diemTin, diemToan);
            person.addStudent(student);
        } else if (type == 2) { // Thêm Mentor
            System.out.print("Nhập số ngày công: ");
            int ngayCong = scanner.nextInt();
            Mentor mentor = new Mentor(name, age, country, ngayCong);
            person.addMentor(mentor);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
    }
	private static void displayAll() {
		person.displayAll();
	}
	
	private static void displayData(Scanner scanner) {	
		System.out.println("Chọn loại dữ liệu muốn hiển thị:");
	    System.out.println("1. Student");
	    System.out.println("2. Mentor");
	    System.out.println("3. Tất cả");
	    System.out.print("Lựa chọn: ");
	    int type = scanner.nextInt();
	    if (type == 1) {
	        System.out.println("\n--- Danh sách Student ---");
	        person.displayStudents();
	    } else if (type == 2) {
	        System.out.println("\n--- Danh sách Mentor ---");
	        person.displayMentors();
	    } else if (type == 3) {
	        System.out.println("\n--- Danh sách tất cả ---");
	        person.displayAll();
	    } else {
	        System.out.println("Lựa chọn không hợp lệ!");
	    }
    }
	
	private static void deleteData(Scanner scanner) {
        System.out.print("Nhập ID của người muốn xóa: ");
        int id = scanner.nextInt();
        person.deletePerson(id);
    }
	
	private static void updateData(Scanner scanner) {
        System.out.print("Nhập ID của người muốn sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên mới: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi mới: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập quốc gia mới: ");
        String country = scanner.nextLine();

        person.updatePerson(id, name, age, country);
    }
}

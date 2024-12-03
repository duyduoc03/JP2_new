package bai2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
    private String studentId;
    private double gpa;
    private String email;

    public Student() {
        super();
    }

    public Student(String name, String sex, Date birthday, String address, String studentId, double gpa, String email) {
        super(name, sex, birthday, address);
        this.studentId = studentId;
        this.gpa = gpa;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sinh viên: ");
        this.studentId = scanner.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        try {
            this.gpa = scanner.nextDouble();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Phải nhập số");
        }

        System.out.print("Nhập email: ");
        this.email = scanner.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo(); // Gọi phương thức showInfo của Person
        System.out.println("Mã sinh viên: " + this.studentId);
        System.out.println("Điểm trung bình: " + this.gpa);
        System.out.println("Email: " + this.email);
    }

    public boolean isScholarshipEligible() {
        return this.gpa >= 8.0;
    }
}


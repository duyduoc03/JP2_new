package Quanlysinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Student> liststudent = new ArrayList<>(); // Khai báo danh sách bên ngoài vòng lặp
        Scanner nhap = new Scanner(System.in);

        while (true) {
            System.out.println("-------------Menu chuc nang----------");
            System.out.println("1. Hien thi sinh vien");
            System.out.println("2. Them sinh vien");
            System.out.println("3. Sua sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Thoat chuong trinh");

            try {
                System.out.print("Nhap lua chon: ");
                int choise = nhap.nextInt();
                nhap.nextLine();
                switch (choise) {
                    case 1:
                        hienthiSinhVien(liststudent);
                        break;
                    case 2:
                        themSinhVien(liststudent, nhap);
                        break;
                    case 3:
                        suaSinhVien(liststudent, nhap);
                        break;
                    case 4:
                        xoaSinhVien(liststudent, nhap);
                        break;
                    case 5:
                        System.out.println("Thoat chuong trinh");
                        return;
                    default:
                        System.out.println("Vui long nhap lai");
                }
            } catch (Exception e) {
                System.out.println("Phai nhap so!");
                nhap.nextLine();
            }
        }
    }

    public static void themSinhVien(List<Student> liststudent, Scanner nhap) {
        System.out.println("Them sinh vien");
        System.out.print("So sinh vien can them: ");
        int number = nhap.nextInt();
        nhap.nextLine();

        for (int i = 0; i < number; i++) {
            System.out.println("Sinh vien thu " + (i + 1));
            System.out.print("Nhap id: ");
            int masv = nhap.nextInt();
            nhap.nextLine();
            System.out.print("Nhap name: ");
            String name = nhap.nextLine();
            System.out.print("Nhap tuoi: ");
            int age = nhap.nextInt();
            nhap.nextLine();
            System.out.print("Nhap que quan: ");
            String country = nhap.nextLine();
            System.out.print("Nhap lop: ");
            String lop = nhap.nextLine();

            Student student = new Student(masv, name, age, country, lop);
            liststudent.add(student);
        }

        System.out.println("Them thanh cong!");
    }

    public static void hienthiSinhVien(List<Student> liststudent) {
        if (liststudent.isEmpty()) {
            System.out.println("Danh sach sinh vien trong!");
        } else {
            System.out.println("Danh sach sinh vien:");
            for (Student student : liststudent) {
                System.out.println(student);
            }
        }
    }

    public static void suaSinhVien(List<Student> liststudent, Scanner nhap) {
        System.out.print("Nhap id sinh vien can sua: ");
        int id = nhap.nextInt();
        nhap.nextLine();

        for (Student student : liststudent) {
            if (student.getId() == id) {
                System.out.print("Nhap ten moi: ");
                student.setName(nhap.nextLine());
                System.out.print("Nhap tuoi moi: ");
                student.setAge(nhap.nextInt());
                nhap.nextLine();
                System.out.print("Nhap que quan moi: ");
                student.setCountry(nhap.nextLine());
                System.out.print("Nhap lop moi: ");
                student.setClazz(nhap.nextLine());
                System.out.println("Sua thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien co id: " + id);
    }

    public static void xoaSinhVien(List<Student> liststudent, Scanner nhap) {
        System.out.print("Nhap id sinh vien can xoa: ");
        int id = nhap.nextInt();
        nhap.nextLine();

        for (int i = 0; i < liststudent.size(); i++) {
            if (liststudent.get(i).getId() == id) {
                liststudent.remove(i);
                System.out.println("Xoa thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien co id: " + id);
    }
}

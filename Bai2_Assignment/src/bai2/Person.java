package bai2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String name;
    private String sex;
    private Date birthday;
    private String  address;


    public Person() {
    }

    public Person(String name, String sex, Date birthday, String address) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        this.name = scanner.nextLine();

        System.out.print("Nhập giới tính: ");
        this.sex = scanner.nextLine();

        System.out.print("Nhập ngày sinh (dd-MM-yyyy): ");
        try {
            this.birthday = new SimpleDateFormat("dd-MM-yyyy").parse(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Ngày sinh không hợp lệ!");
            this.birthday = new Date();
        }

        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
    }

    public void showInfo() {
        System.out.println("Tên: " + this.name);
        System.out.println("Giới tính: " + this.sex);
        System.out.println("Ngày sinh: " + this.birthday);
        System.out.println("Địa chỉ: " + this.address);
    }
}

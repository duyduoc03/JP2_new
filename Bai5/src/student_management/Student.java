package student_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private Date birthday;
    private String address;

    public Student(String name, Date birthday, int id, String address) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Thêm sinh viên vào CSDL
    public static void addStudent(Student student) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO persons (name, birthday, address) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, student.getName());
            statement.setDate(2, student.getBirthday());
            statement.setString(3, student.getAddress());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Thêm sinh viên thành công!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Lấy danh sách tất cả sinh viên từ CSDL
    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM persons";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Date birthday = resultSet.getDate("birthday");
                String address = resultSet.getString("address");

                students.add(new Student(id, name, birthday, address));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    // Hiển thị danh sách sinh viên
    public static void displayStudents(List<Student> students) {
        System.out.println("+----+----------------+------------+------------------+");
        System.out.printf("| %-2s | %-14s | %-10s | %-16s |\n", "ID", "Name", "Birthday", "Address");
        System.out.println("+----+----------------+------------+------------------+");

        for (Student student : students) {
            System.out.printf("| %-2d | %-14s | %-10s | %-16s |\n",
                    student.getId(),
                    student.getName(),
                    student.getBirthday(),
                    student.getAddress());
        }
        System.out.println("+----+----------------+------------+------------------+");
    }
}

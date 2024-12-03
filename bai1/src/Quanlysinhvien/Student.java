package Quanlysinhvien;

public class Student {
    private int id;
    private String name;
    private int age;
    private String country;
    private String clazz;

    public Student(int id, String name, int age, String country, String clazz) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
        this.clazz = clazz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}

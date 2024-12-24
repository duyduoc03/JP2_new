package Chuongtrinhquanly.Entity;

public class Student extends Person {
	 private double diemTin;      
	 private double diemToan;
	 
	 public Student() {
		 
	 }
	 
	 public Student(String name, int age, String country, double diemTin, double diemToan) {
	     super(name, age, country, 0); // role = 0
	     this.diemTin = diemTin;
	     this.diemToan = diemToan;
	 }
	 
	 public Student(int id, String name, int age, String country, double diemTin, double diemToan) {
	     super(id, name, age, country, 0); // role = 0
	     this.diemTin = diemTin;
	     this.diemToan = diemToan;
	 }
	 
	 public Student (String name, int age, String country) {
		 super(name, age, country, 0);
	 }

	public double getDiemTin() {
		return diemTin;
	}

	public void setDiemTin(double diemTin) {
		this.diemTin = diemTin;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}
	
    public double getDiemTrungBinh() {
        return (diemTin + diemToan) / 2;
    }

    @Override
    public void displayInfo() {
        System.out.printf("| %-2d | %-14s | %-3d | %-8s | %-6s | %-6.2f | %-6.2f | %-15.2f |\n",
                getId(), getName(), getAge(), getCountry(), "Student", diemTin, diemToan, getDiemTrungBinh());
    } 
    
    public void displayInfo2() {
        System.out.printf("| %-14s | %-3d | %-8s | %-6s |\n",
               getName(), getAge(), getCountry(), "Student");
    } 
	 
}

package Chuongtrinhquanly.Entity;

public class Mentor extends Person {
	private int ngayCong;
	
	public Mentor() {
		
	}
	
    public Mentor(String name, int age, String country, int ngayCong) {
        super(name, age, country, 1); // role = 1
        this.ngayCong = ngayCong;
    }
    
    public Mentor(int id, String name, int age, String country, int ngayCong) {
        super(id, name, age, country, 1); // role = 1
        this.ngayCong = ngayCong;
    }
    
    public Mentor (String name, int age, String country) {
		 super(name, age, country, 1);
	 }

	public int getNgayCong() {
		return ngayCong;
	}

	public void setNgayCong(int ngayCong) {
		this.ngayCong = ngayCong;
	}
	
    public double getTienLuong() {
        return ngayCong * 1_000_000; // Mỗi ngày công là 1 triệu đồng
    }

    @Override
    public void displayInfo() {
    	System.out.printf("| %-2d | %-14s | %-3d | %-8s | %-6s | %-8d | %-10.2f |\n",
    			getId(), getName(), getAge(), getCountry(), "Mentor", ngayCong, getTienLuong());
    }
    
    public void displayInfo2() {
        System.out.printf("| %-14s | %-3d | %-8s | %-6s |\n",
               getName(), getAge(), getCountry(), "Mentor");
    } 
	
}

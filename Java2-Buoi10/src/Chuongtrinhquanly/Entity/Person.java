package Chuongtrinhquanly.Entity;

public class Person {
	private int id;             
    private String name;        
    private int age;            
    private String country;           
    private int role;  
    
    public Person() {
    }
    
	public Person(String name, int age, String country, int role) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
		this.role = role;
	}
	
	public Person(int id, String name, int age, String country, int role) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
		this.role = role;
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
	
	
    public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public void displayInfo() {
		System.out.printf("| %-2d | %-14s | %-3d | %-8s | %-6s |\n",
                id, name, age, country, (role == 0 ? "Student" : "Mentor"));
    }
	


    
    
}

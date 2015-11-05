package pt.example.cucumber.salary;

public class Employee {

	private int id;
	private String user;
	private double salary;

	public Employee(int id, String user, double salary) {
		this.id = id;
		this.user = user;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

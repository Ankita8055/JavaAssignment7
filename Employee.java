package ass7problem4;

public class Employee extends Person{
	private int eid;
	private String name2;
	private double salary;
	
	public Employee(String name, int age, int eid, String name2, double salary) {
		super(name, age);
		this.eid = eid;
		this.name2 = name2;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "Employee [eid=" + eid + ", name2=" + name2 + ", salary=" + salary + "]";
	}
}

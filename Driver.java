package ass7problem5;

public class Driver {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println("method of parent class by object of parent class: ");
		p1.dispParent();
		
		System.out.println();
		
		Child c1 = new Child();
		System.out.println("method of child class by object of child class: ");
		c1.dispChild();
		
		System.out.println();
		
		System.out.println("method of parent class by object of child class: ");
		c1.dispParent();
	}

}

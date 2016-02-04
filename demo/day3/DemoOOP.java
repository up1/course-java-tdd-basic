
public class DemoOOP {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.say();
	}
}

class Child extends Parent {

	@Override
	public void say() {
		System.out.println("Child say");
	}
	
}

class Parent {
	public void say(){
		System.out.println("Parent say");
	}
}

class Employee {
	public int id;
	public String name;
	public double salary;
	public String companyName;
}

class Employee3BB extends Employee {
	public double bonus;
}

class Employee4BB extends Employee {
	
}














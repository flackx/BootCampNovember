package module6.sample;

public abstract class Person_A{
	
	private int age;
		
	// default constructor

	
	//abstract methods have no implementation
	public abstract String getName();
	public abstract void setName(String name);
	
	// getter and setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

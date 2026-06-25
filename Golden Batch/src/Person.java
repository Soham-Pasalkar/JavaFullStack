
public class Person implements Cloneable{
	private String name;
	private int age;
	
	private Person() {
		this("Anonymous", -1);  //Constructor Chaining
	}
	
	private Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void Print() {
		System.out.println("Name: " + name + ", Age: " + age );
	}
	
	@Override
	public String toString() { // Source -> Override/Implement Methods -> toString
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) { // Source -> Override/Implement Methods -> equals
		// TODO Auto-generated method stub
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if(this.age == p.age && name.equals(p.name))
				return true;
		}
		return super.equals(obj);
	}

	public static void main(String[] args) throws CloneNotSupportedException{
		Person P1 = new Person("Polo", 21);
		P1.Print();
		
		Person P2 = new Person();
		P2.Print();
		
		System.out.println(P1.hashCode());
		System.out.println(P2.hashCode());
		
		System.out.println(P1); // implicitly calls toString on Object
		
		System.out.println(P1.equals(P2));
		
		Person PC = (Person) P1.clone(); // Shallow Cloning
		System.out.println(PC);
		
	}

}

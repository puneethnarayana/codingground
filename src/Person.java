
public class Person implements Cloneable {
	private String name;
	private int age;

	public Person() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		System.out.println();
		return "Name : "+name+" Age : "+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		if(obj instanceof Person){
			Person p1 = (Person) obj;
			if(p1.name.equals(this.name) && p1.age == this.age)
			{
				return true;				
			}
		}
		return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println("Person is no more!");
	}	
}
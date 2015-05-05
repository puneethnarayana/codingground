
public class TestPerson {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//		Person p1 = new Person("Klay Thompson",24);
//		
//		//Implicitly calls the toString method on teh specified object
//		System.out.println(p1);
//		System.out.println(p1.hashCode());
//		
//		Person p2 = new Person("Klay Thompson",24);
//		System.out.println(p2.equals(p1));
//		
//		Person pc = (Person) p1.clone();
//		System.out.println(pc);
		
		Person p = null;
		
		for(int i=0;i<5;i++)
		{
			p = new Person();
			//p.finalize();
		}
				
		System.gc();
		Thread.sleep(5000);
	}

}

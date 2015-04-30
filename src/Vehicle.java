
public class Vehicle {
	private String model;
	private String[] features;
	
	//var...args
	public Vehicle(String model, String...features){
		this.model = model;
		this.features = features;
	}
	
	public void specs(){
		System.out.printf("Model : %s\n",model);
		for (String ftr : features) {
			System.out.println(ftr);
		}
	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("XJ", "Auto Break","Noise Cancellation");
		v1.specs();
		
		Vehicle v2 = new Vehicle("i-8", "Hybrid Engine","KERS","Hydrogren cell");
		v2.specs();
		
		Vehicle v3 = new Vehicle("Ambassador");
		v3.specs();
	}
}

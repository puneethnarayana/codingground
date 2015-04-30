
public class GenericsDemo<T>  {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public GenericsDemo(T data) {
		super();
		this.data = data;
	}
	
	public static void main(String[] args) {
		GenericsDemo<String> g1 = new GenericsDemo<String>("Puneeth");
		g1.setData("L");
		System.out.println(g1.getData());
		
		GenericsDemo<Integer> i1 = new GenericsDemo<Integer>(767);
		System.out.println(i1.getData());
	}
}

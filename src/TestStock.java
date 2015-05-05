import com.puneeth.stock.Broker;
import com.puneeth.stock.Holder;
import com.puneeth.stock.StockSingleton;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
//		Holder h = new Stock();
//		h.view();
//		
//		Broker b = new Stock();
//		b.view();
//		b.get();
//		
//		Exchange e= new Stock();
//		e.view();
//		e.get();
//		e.set();
		Holder h1 = StockSingleton.getStock();
		h1.view();
		System.out.println(h1.hashCode());
		
		Broker s1 = StockSingleton.getStock();
		s1.view();
		System.out.println(s1.hashCode());
		
	}

}

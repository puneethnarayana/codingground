import com.puneeth.banking.BalanceException;
import com.puneeth.banking.Banking;
import com.puneeth.banking.BankingFactory;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Account ac = new Account();
//		ac.summary();
//		
//		Account ac1 = new Account(737,"Jaime",10000);
//		ac1.summary();
//		ac1.withdraw(2000);
		
		Banking c1 =  BankingFactory.openAccount("Kevin Love","current");
		c1.summary();
		try {
			c1.withdraw(0);
		} catch (BalanceException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		//c1.summary();
		c1.deposit(30000);
		//c1.summary();
		try {
			c1.withdraw(16000);
			c1.withdraw(23000);
			c1.deposit(5000);
		} catch (BalanceException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		//c1.summary();
		c1.statement();
	}
}

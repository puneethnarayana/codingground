
public class EmailValidator {

	public static void main(String[] args) {
		String email = "puneeth97@gma.co";
		if(		   email.indexOf('@') < 4 
				|| email.indexOf('.') < (email.length()-3) 
				|| email.indexOf('@') != email.lastIndexOf('@') 
				|| email.indexOf('.') != email.lastIndexOf('.')
				|| email.indexOf('.') - email.indexOf('@') < 3  
				)
		{
			System.out.println("invalid ID"+email.indexOf('.') +"--"+ (email.length()-2) );
		}
		else
		{
			System.out.println("Valid ID");
		}
		System.out.println(email.indexOf('.')+"---"+ email.indexOf('@'));
		
	}
}

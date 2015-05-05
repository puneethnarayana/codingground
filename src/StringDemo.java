
public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	
		s1 = s1 +"Work";
		System.out.println(s1 == s3);
	
	/*	System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.lastIndexOf("ll"));
		System.out.println(s1.substring(4));*/

		String week = "lundi-mardi-mercredi-juedi-vendredi-samedi-dimanche";
		String[] days = week.split("-");
		
		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}
		
		for (String string : days) {
			System.out.println(string);
		}
	}	
}
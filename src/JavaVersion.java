import java.net.*;
import java.io.*;

public class JavaVersion {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("java.runtime.version"));
		URLConnectionReader();
	}

	public static void URLConnectionReader() throws IOException {
		//public static void main(String[] args) throws Exception {
		URL oracle = new URL("https://data.ny.gov/api/views/wykp-id5i");
		URLConnection yc = oracle.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(
				yc.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) 
			System.out.println(inputLine);
		in.close();
		// }
	}
}
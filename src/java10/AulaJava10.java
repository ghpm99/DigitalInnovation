package java10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

public class AulaJava10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			var teste = connectAndPrintJavaOracle();
			System.out.println(teste);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static String connectAndPrintJavaOracle() throws IOException {
		var url  = new URL("https://www.naointendo.com.br");
		var urlConnection =(HttpURLConnection) url.openConnection();
		urlConnection.setRequestMethod("GET");
		var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		return bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n");
	}

}

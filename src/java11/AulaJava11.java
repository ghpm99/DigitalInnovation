package java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AulaJava11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			var teste = connectAndPrintJavaOracle();
			System.out.println("Status code: "+teste.statusCode());
			System.out.println("Headers code: "+teste.headers());
			System.out.println(teste.body());
			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static HttpResponse<String> connectAndPrintJavaOracle() throws IOException, InterruptedException {
		var request = HttpRequest.newBuilder().GET().uri(URI.create("https://www.naointendo.com.br")).build();
		HttpClient httpCliente = HttpClient.newHttpClient();
		HttpResponse<String> response = httpCliente.send(request, HttpResponse.BodyHandlers.ofString());		
		return response;
	}

}

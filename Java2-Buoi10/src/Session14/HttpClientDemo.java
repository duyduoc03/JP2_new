package Session14;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {
	//để gửi yêu cầu HTTP va trả về thông tin
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(new URI("https://jsonplaceholder.typicode.com/posts/1"))
                                         .GET()
                                         .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Response: " + response.body());
	}
}

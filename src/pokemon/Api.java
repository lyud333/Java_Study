package pokemon;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Api {
    private static final HttpClient client = HttpClient.newHttpClient();
    public static String get(String url) throws Exception{

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode()!=0) System.out.println("요청 실패! 상태 코드: " + response.statusCode());
        return response.body();

    }
}

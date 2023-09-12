import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;

public class ApiUtils {

    public static TcmbEvdsResponse getTcmbEvdsCurrencyValue(String tcmbEvdsCurrencyCode) {
        HttpResponse<String> httpResponse;

        try {
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(TcmbEvdsUtils.generateTcmbEvdsUri(tcmbEvdsCurrencyCode)))
                    .build();

            httpResponse = HttpClient.newHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException exception) {
            throw new RuntimeException(exception.getMessage());
        }

        if (Objects.nonNull(httpResponse) && httpResponse.statusCode() != 200) {
            throw new RuntimeException(String.format("Error with TCMB API call: %s", httpResponse.statusCode()));
        }

        return new GsonBuilder().create().fromJson(httpResponse.body(), TcmbEvdsResponse.class);
    }
}

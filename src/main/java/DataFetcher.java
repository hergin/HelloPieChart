import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.io.IOException;

public class DataFetcher {

    private static HttpRequestFactory requestFactory;

    public DataFetcher() {
        requestFactory = new NetHttpTransport().createRequestFactory();
    }

    public static String getRawJSONfromAPI() throws IOException {
        HttpRequest getRequest = requestFactory.buildGetRequest(
                new GenericUrl("https://wuhan-coronavirus-api.laeyoung.endpoint.ainize.ai/jhu-edu/brief"));
        String rawResponse = getRequest.execute().parseAsString();
        return rawResponse;
    }

}

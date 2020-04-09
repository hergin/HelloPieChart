import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.io.IOException;

public class DataFetcher {


    public static String getRawJSONfromAPI() throws Exception {
        HttpRequestFactory requestFactory = new NetHttpTransport().createRequestFactory();
        HttpRequest getRequest = requestFactory.buildGetRequest(
                new GenericUrl("https://wuhan-coronavirus-api.laeyoung.endpoint.ainize.ai/jhu-edu/brief"));
        String rawResponse = getRequest.execute().parseAsString();
        return rawResponse;
    }

}

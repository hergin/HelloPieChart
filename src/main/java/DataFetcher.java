import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DataFetcher {

    HttpRequestFactory requestFactory;
    String baseURL = "https://wuhan-coronavirus-api.laeyoung.endpoint.ainize.ai/jhu-edu/brief";

    public static String getRawJSONfromAPI() throws IOException {
        // TODO
        HttpRequestFactory requestFactory;
        String baseURL = "https://wuhan-coronavirus-api.laeyoung.endpoint.ainize.ai/jhu-edu/brief";
        requestFactory = new NetHttpTransport().createRequestFactory();
        HttpRequest getRequest = requestFactory.buildGetRequest(
                new GenericUrl(baseURL));
        String rawResponse = getRequest.execute().parseAsString();
        return rawResponse;
    }

}

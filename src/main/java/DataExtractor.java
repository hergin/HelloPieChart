import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.javatuples.Pair;

import java.util.*;

public class DataExtractor {

    public static List<Pair<String, Integer>> extractDataFromJSON(String rawJson) {
        // TODO
        List<Pair<String, Integer>> theList = new LinkedList<>();
        JsonParser jsonParser = new JsonParser();
        JsonElement rootElement = jsonParser.parse(rawJson);
        JsonObject rootObject = rootElement.getAsJsonObject();
        Set<Map.Entry<String, JsonElement>> es = rootObject.entrySet();
        for (Map.Entry<String, JsonElement> e : es){
            String theKey = e.getKey();
            int theValue = e.getValue().getAsInt();
            theList.add(new Pair<String, Integer>(theKey, theValue));
        }
        return theList;
    }

}

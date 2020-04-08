import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataExtractor {

    public static List<Pair<String, Integer>> extractDataFromJSON(String rawJson) {
        JsonParser jsonParser = new JsonParser();
        JsonElement rootElement = jsonParser.parse(rawJson);
        JsonObject rootObject = rootElement.getAsJsonObject();
        // rootObject.entrySet() will give you a list of Key-Value for the data in JSON.
        // Basically, go over each entry in a for loop and add a Pair to a resulting list for each.

        List<Pair<String, Integer>> resultList = new ArrayList<>();

        for (Map.Entry<String, JsonElement> e : rootObject.entrySet()) {
            resultList.add(new Pair<String, Integer>(e.getKey(), e.getValue().getAsInt()));
        }

        return resultList;
    }

}

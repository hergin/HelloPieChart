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
        List<Pair<String, Integer>> pairList = new ArrayList<>();
        for (Map.Entry<String, JsonElement> entry : rootObject.entrySet()) {
            var someString = entry.getKey();
            var someInt = entry.getValue().getAsInt();
            pairList.add(new Pair<String, Integer>(someString, someInt));
        }
        return pairList;
    }

}

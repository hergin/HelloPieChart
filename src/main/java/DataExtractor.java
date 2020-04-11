import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataExtractor {

    public static List<Pair<String, Integer>> extractDataFromJSON(String rawJson){
    JsonParser jsonParser = new JsonParser();
    JsonElement rootElement = jsonParser.parse(rawJson);
    JsonObject rootObject = rootElement.getAsJsonObject();
    List<Pair<String,Integer>> list = new ArrayList<>();
        for (Map.Entry<String, JsonElement> entry:rootObject.entrySet()) {
        String key = entry.getKey();
        Integer integer = entry.getValue().getAsInt();
        Pair<String, Integer> pair = new Pair<String, Integer>(key , integer);
        list.add(pair);
    }
        return list;
}

}

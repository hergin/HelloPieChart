import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataExtractor {

    public static List<Pair<String, Integer>> extractDataFromJSON(String rawJson) {
        // TODO
        List<Pair<String, Integer>> pairList = new ArrayList<>();
        JsonParser jsonParser = new JsonParser();
        JsonElement element = jsonParser.parse(rawJson);
        JsonObject object = element.getAsJsonObject();
        object.entrySet();
        for (Map.Entry<String, JsonElement> jsonElementEntry : object.entrySet()){
            pairList.add(new Pair<>(jsonElementEntry.getKey(),jsonElementEntry.getValue().getAsInt()));
        }
        return pairList;
    }

}

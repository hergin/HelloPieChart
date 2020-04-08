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
        JsonParser jsonParser = new JsonParser();
        JsonElement rootElement = jsonParser.parse(rawJson);
        JsonObject rootObject = rootElement.getAsJsonObject();
        ArrayList<Pair<String,Integer>> list = new ArrayList<>();
        for(Map.Entry e : rootObject.entrySet()){
            Pair pair = new Pair<>(String.valueOf(e.getKey()), Integer.valueOf(String.valueOf(e.getValue())));
            list.add(pair);
        }

        return list;
    }

}

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.List;

public class DataExtractor {

    ArrayList resultingList;

    public static List<Pair<String, Integer>> extractDataFromJSON(String rawJson) {
        JsonParser jsonParser = new JsonParser();
        JsonElement rootElement = jsonParser.parse(rawJson);
        JsonObject rootObject = rootElement.getAsJsonObject();
        for (int i = 0; i < rootObject.entrySet().size(); i++){
            return new Pair<String, Integer>("Some String", SomeInt);
        }

    }

}

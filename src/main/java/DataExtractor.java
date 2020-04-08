import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataExtractor
{
    public static List<Pair<String, Integer>> extractDataFromJSON(String rawJson)
    {
        ArrayList<Pair<String, Integer>> returnList = new ArrayList <Pair<String, Integer>> ();

        JsonParser jsonParser = new JsonParser();
        JsonElement rootElement = jsonParser.parse(rawJson);
        JsonObject rootObject = rootElement.getAsJsonObject();

        Pair newestPair;
        for (Map.Entry<String, JsonElement> entry : rootObject.entrySet())
        {
            newestPair = new Pair<String,Integer>(entry.getKey(),
                    entry.getValue().getAsInt());
            returnList.add(newestPair);
        }

        return returnList;
    }
}

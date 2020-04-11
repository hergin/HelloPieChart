import org.javatuples.Pair;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import java.util.List;

public class UIUtils {

    public static PieDataset convertPairsToPieDataset(List<Pair<String, Integer>> pairs) {
        DefaultPieDataset result = new DefaultPieDataset();
        for (int x = 0; x < pairs.size(); x++) {
            result.setValue(pairs.get(x).getValue0(), pairs.get(x).getValue1());
        }
        return result;
    }
}



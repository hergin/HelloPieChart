import org.javatuples.Pair;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import java.util.List;

public class UIUtils {

    public static PieDataset convertPairsToPieDataset(List<Pair<String, Integer>> pairs) {
        // TODO
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue(pairs.get(0).getValue0(), pairs.get(0).getValue1());
        result.setValue(pairs.get(1).getValue0(), pairs.get(1).getValue1());
        result.setValue(pairs.get(2).getValue0(), pairs.get(2).getValue1());
        return result;
    }
}

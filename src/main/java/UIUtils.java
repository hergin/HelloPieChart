import org.javatuples.Pair;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import java.util.List;

public class UIUtils
{
    public static PieDataset convertPairsToPieDataset(List<Pair<String, Integer>> pairs)
    {
        DefaultPieDataset result = new DefaultPieDataset();

        for (int i = 0; i < pairs.size(); i++)
        {
            result.setValue(pairs.get(i).getValue0(), pairs.get(i).getValue1());
        }

        return result;
    }
}

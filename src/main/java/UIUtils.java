import org.javatuples.Pair;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import java.util.List;

public class UIUtils {

    public static PieDataset convertPairsToPieDataset(List<Pair<String, Integer>> pairs) {
        // TODO
        DefaultPieDataset pieData = new DefaultPieDataset();
        for(Pair<String,Integer> p : pairs){
            pieData.setValue(p.getValue0(),p.getValue1());
        }
        return pieData;
    }

}

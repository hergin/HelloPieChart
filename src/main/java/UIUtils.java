import org.javatuples.Pair;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.util.Rotation;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import java.util.List;

public class UIUtils {

    public static PieDataset convertPairsToPieDataset(List<Pair<String, Integer>> pairs) {
        // TODO
        DefaultPieDataset result = new DefaultPieDataset();
        for (Pair<String, Integer> p : pairs){
            result.insertValue(result.getItemCount(), p.getValue0(), p.getValue1());
        }
        return result;
        /*
        // based on the dataset we create the chart
        JFreeChart chart = createChart(dataset, "Corona Chart");
        // we put the chart into a panel
        ChartPanel chartPanel = new ChartPanel(chart);
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        return dataset;
         */
    }
}

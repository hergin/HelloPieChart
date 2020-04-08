import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.util.Rotation;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import javax.swing.*;

public class CoronaUI extends JFrame {

    public CoronaUI(String title) {
        super(title);

        JFreeChart chart = ChartFactory.createPieChart3D(
                title,                  // chart title
                getPieData(),                // data
                true,                   // include legend
                true,
                false
        );

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);

        ChartPanel chartPanel = new ChartPanel(chart);
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        // add it to our application
        setContentPane(chartPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        setVisible(true);
    }

    private PieDataset getPieData() {
        String rawData = null;
        try {
            rawData = DataFetcher.getRawJSONfromAPI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Couldn't get data!");
            return new DefaultPieDataset();
        }
        var actualdata = DataExtractor.extractDataFromJSON(rawData);

        return UIUtils.convertPairsToPieDataset(actualdata);
    }

    public static void main(String[] args) {
        new CoronaUI("Corona Summary Chart");
    }

}

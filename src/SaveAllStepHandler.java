import java.util.ArrayList;
import java.util.List;

public class SaveAllStepHandler implements StepHandler {

    List<Double> tValues = new ArrayList<>();
    List<Double> xValues = new ArrayList<>();

    @Override
    public void handleStep(double t, double x) {
        tValues.add(t);
        xValues.add(x);
    }//end of handleStep
}//end of class

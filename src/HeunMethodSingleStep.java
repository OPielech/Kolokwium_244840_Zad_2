public class HeunMethodSingleStep implements ODESingleStep {
    @Override
    public double singleStep(FirstOrderODE ode, double t, double x, double h) {
        double k1 = ode.function(t, x);
        double k2 = ode.function(t + h, x + h * k1);

        return x + 0.5 * (k1 + k2) * h;
    }//end of singleStep
}//end of class

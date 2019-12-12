public class Main {
    public static void main(String[] args) {
        //Values for h=0.25 with Heun method:
        FirstOrderODESolver solver = new FirstOrderODESolver((new HeunMethodSingleStep()));
        SaveAllStepHandler saveAllStepHandler = new SaveAllStepHandler();
        solver.addStepHandler(saveAllStepHandler);
        double xStop = solver.integrate((t, x) -> -2 * Math.pow(t, 3) + 12 * Math.pow(t, 2) - 20 * t + 8.5, 0, 1, 4, 16);
        System.out.println("\nValues for h=0.25 with Heun method:");
        for (int i = 0; i < saveAllStepHandler.xValues.size(); i++) {
            System.out.printf("t: %f x: %f\n", saveAllStepHandler.tValues.get(i), saveAllStepHandler.xValues.get(i));
        }


        System.out.println();
        //Values for h=0.5 with Heun method:
        FirstOrderODESolver solver1 = new FirstOrderODESolver((new HeunMethodSingleStep()));
        SaveAllStepHandler saveAllStepHandler1 = new SaveAllStepHandler();
        solver1.addStepHandler(saveAllStepHandler1);
        double xStop1 = solver1.integrate((t, x) -> -2 * Math.pow(t, 3) + 12 * Math.pow(t, 2) - 20 * t + 8.5, 0, 1, 4, 8);
        System.out.println("\nValues for h=0.5 with Heun method:");
        for (int i = 0; i < saveAllStepHandler1.xValues.size(); i++) {
            System.out.printf("t: %f x: %f\n", saveAllStepHandler1.tValues.get(i), saveAllStepHandler1.xValues.get(i));
        }

        System.out.println();
        for (double i = 0; i <= 4; i += 0.5)
            System.out.println(functionx(i));

    }//end of main

    public static double functionx(double x) {
        return -0.5 * Math.pow(x, 4) + 4 * Math.pow(x, 3) - 10 * Math.pow(x, 2) + 8.5 * x + 1;

    }
}//end of class

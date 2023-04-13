package md.itstep.math.algebra;

public class Calculator {

    private void action() {
        sum(4,5);
        System.out.println("ACTION CALLED");
    }

    public double sum(double a, double b) {
        action();
        return a + b;
    }

    public static double sum(int a, int b) {
        return a + b;
    }



}

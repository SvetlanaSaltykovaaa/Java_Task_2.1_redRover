public class Calculator {


    public int addition(int first, int second) {
        return first + second;
    }

    public int subtraction(int first, int second) {
        return first - second;
    }

    public int multiplication(int first, int second) {
        return first * second;
    }

    public double division(int first, int second) {

        try {
            return (double) first / second;
        } catch (ArithmeticException e) {
            return Double.NaN;
        }

    }

    public int remainderOfDivision(int first, int second) {
        return first % second;
    }
}

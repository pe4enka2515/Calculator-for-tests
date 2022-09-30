public class Calculator {
    int sum (int first, int second) {
        return first + second;
    }

    int subtract(int first, int second) {
        return first - second;
    }

    int multiply(int first, int second) {
        return first * second;
    }

    int divide(int first, int second) {
        if (second == 0) throw new IllegalArgumentException("Ne delitsya na 0");
        return first / second;
    }
}
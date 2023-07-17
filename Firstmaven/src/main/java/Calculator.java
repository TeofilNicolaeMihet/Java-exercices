public class Calculator {
    public double calculateTenPercent(double value) {
        return value * 0.1;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double value = 1000;
        double result = calculator.calculateTenPercent(value);
        System.out.println("10% of " + value + " is: " + result);
    }
}

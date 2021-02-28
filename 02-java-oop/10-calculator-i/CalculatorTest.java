class CalculatorTest {
    public static void main(String[] args) {

        Calculator plus = new Calculator(10.5, 5.2, "+");
        plus.performOperation();
        System.out.println(plus.getResults());
    }
}
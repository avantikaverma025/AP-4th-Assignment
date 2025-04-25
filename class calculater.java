public class Calculator {

    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.addNumbers(5, 3);
        System.out.println("Sum is: " + result);
    }
}

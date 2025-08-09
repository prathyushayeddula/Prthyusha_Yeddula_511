import java.util.Scanner;

class Calculator {
    private double a, b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a / b;
    }

    public double operate(String op) {
        op = op.toLowerCase();
        switch (op) {
            case "add":
            case "+":
                return add();
            case "subtract":
            case "-":
                return subtract();
            case "multiply":
            case "*":
                return multiply();
            case "divide":
            case "/":
                return divide();
            default:
                throw new IllegalArgumentException("Invalid operation: " + op);
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double type number ");
        double a = sc.nextDouble();

        System.out.print("Enter b double type number ");
        double b = sc.nextDouble();

        System.out.print("Enter operation like add, subtract, multiply, divide ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b);
        try {
            double result = calc.operate(op);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error Message" + e.getMessage());
        }

        sc.close();
    }
}


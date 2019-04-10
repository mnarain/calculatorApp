package sr.unasat.calculator.service;

public class CalculateService {
    public void multiply(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public void divide(int num1, int num2) {
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    public void add(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public void subtract(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

}

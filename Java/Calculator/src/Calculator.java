/*
Calculator
This program receives two numbers from the user and does basic mathematical processes and returns the answer.
*/

public class Calculator {
    public void calculator() {

    }

    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    //Subtraction method where one number is subtracted from the other number
    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
    //multiplication method where the product of two numbers is found
    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    //Division method where the first number is divided by the second number
    public int divide(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
    //Modulo method where the first number is divided by the second number and the remainder is outputted
    public int modulo(int num1, int num2){
        int result = num1 % num2;
        return result;
    }
    //Main method
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        //Prints out the answers after calling each method
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.subtract(45,11));
        System.out.println(myCalculator.multiply(5,6));
        System.out.println(myCalculator.divide(100,10));
        System.out.println(myCalculator.modulo(10,6));
    }
}

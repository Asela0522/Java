import java.util.Scanner;
public class cal {
    // Addition method
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction method
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication method
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    //power method
    public static double power(double num1, double num2) {
        return Math.pow(num1,num2);
    }
    //Square root method
    public static double sqrt(double num1) {
        return Math.sqrt(num1);
    }

    // Division method
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Example usage of the Calculator class
        System.out.print("Enter the first number:(Double Input): ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number:(Double Input): ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operation:{+,-,*,/,^,s}");
        char operation = sc.next().charAt(0);


        // Addition
        if (operation == '+') {
            System.out.println("The sum of two numbers is: " + add(num1, num2));
        }
        // Subtraction
        else if (operation == '-') {
            System.out.println("The difference of two numbers is: " + subtract(num1, num2));
        }
        // Multiplication
        else if (operation == '*') {
            System.out.println("The product of two numbers is: " + multiply(num1, num2));
        }
        //power
        else if (operation == '^') {
            System.out.println("The power of two numbers is: " + power(num1, num2));
        }
        //Square root
        else if (operation == 's') {
            System.out.println("The square root of "+ num1 +" =" + sqrt(num1));
            System.out.println("The square root of "+num2 +" ="+ sqrt(num2));
        }
        // Division
        else if (operation == '/') {
            try {
                System.out.println("The division of two numbers is: " + divide(num1, num2));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}

import java.util.Scanner; // Importing Scanner class from java.util package
public class Calculator { // Class declaration

    public static void main(String[] args) { // Main method declaration
        Scanner  sc = new Scanner(System.in);   // Creating an object of Scanner class
        System.out.println("Enter the first number: "); // Printing the message
        int a = sc.nextInt();   // Taking the first number as input
        System.out.println("Enter the second number: ");    // Printing the message
        int b = sc.nextInt();   // Taking the second number as input
        System.out.println("Enter the operation:{+,-,*,/}");    // Printing the message
        char operation = sc.next().charAt(0);   // Taking the operation as input
        
        if (operation == '+') { // If the operation is addition
            System.out.println("The sum of two numbers is: " + (a + b));
        }
         else if (operation == '-') {  // If the operation is subtraction
            System.out.println("The difference of two numbers is: " + (a - b));
        } 
        else if (operation == '*') {  // If the operation is multiplication
            System.out.println("The product of two numbers is: " + (a * b));
        } 
        else if (operation == '/') {  // If the operation is division
            System.out.println("The division of two numbers is: " + (a / b));
        } 
        else {    // If the operation is invalid
            System.out.println("Invalid operation");
        }
    }
}
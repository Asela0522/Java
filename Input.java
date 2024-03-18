import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner newobject = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = newobject.nextLine();
        System.out.println("My name is " + name);

        System.out.print("Enter your Age:");
        int Age = newobject.nextInt();
        newobject.nextLine(); // Consume the newline character
        System.out.println("My Age " + Age);

        System.out.println("School: ");
        String school = newobject.nextLine();
        System.out.println("My School is " + school);

        System.out.print("Enter your Age:");
        int Ages = newobject.nextInt();
        newobject.close();
        System.out.println("My Age " + Ages);
    }
}

import java.util.Scanner; // 1. Import the Scanner class

public class UserInputExample {
    public static void main(String[] args) {
        
        // 2. Create a Scanner object (reads from keyboard)
        Scanner scanner = new Scanner(System.in);
        
        // 3. Read a String
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a whole line of text
        
        // 4. Read an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer
        
        // 5. Read a decimal number
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble(); // Reads a decimal
        
        // 6. Display the inputs
        System.out.println("\nHello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " meters.");
        
        // 7. Close the scanner
        scanner.close();
    }
}

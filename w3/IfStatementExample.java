import java.util.Scanner;
/**
* IfStatementExample
* ------------------
* Checks if a number is positive using an if statement.
*/
public class IfStatementExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // IF condition
        if (number > 0) {
            System.out.println(number + " is positive!");
        }
        System.out.println("End of IfStatementExample.");
        scanner.close();
    }
}
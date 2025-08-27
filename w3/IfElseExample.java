import java.util.Scanner;
/**
* If-Else Example
* -------------
* Checks if a number is even or odd using if-else.
*/
public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        // IF-ELSE condition
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        System.out.println("End of IfElseExample.");
        scanner.close();
    }
}
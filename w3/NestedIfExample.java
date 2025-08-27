import java.util.Scanner;
/**
* Nested-If Example
* ---------------
* Classifies temperature into "Cold", "Warm", or "Hot" using
nested if-else.
*/
public class NestedIfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temp = scanner.nextInt();
        // OUTER IF-ELSE
        if (temp < 15) {
            System.out.println("It's Cold.");
        } else {
        // INNER IF-ELSE
        if (temp <= 30) {
            System.out.println("It's Warm.");
        } else {
            System.out.println("It's Hot.");
        }
        }
        System.out.println("End of NestedIfExample.");
        scanner.close();
    }
}
import model.Car;
import utils.Calculator;
import utils.StringProcessor;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //System.out.println("This submission belongs to 12345678, Your Name\n");

        Scanner scanner = new Scanner(System.in);

        // Car object (Class & Object + Abstraction + Encapsulation)
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter year of manufacture: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        Car myCar = new Car(brand, model, year);
        myCar.displayCarInfo();
        myCar.accelerate();
        myCar.brake();

        // String Processing
        System.out.print("\nEnter a sentence for string processing: ");
        String inputSentence = scanner.nextLine();
        StringProcessor.process(inputSentence);

        // Calculator (Utility Class + Static Methods)
        System.out.print("\nEnter two integers (space-separated): ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.printf("Sum: %d\n", Calculator.calculateSum(num1, num2));
        System.out.printf("Difference: %d\n", Calculator.calculateDifference(num1, num2));
        System.out.printf("Average: %.2f\n", Calculator.calculateAverage(num1, num2));

        // Primitive vs Reference Demo
        int x = 5; // primitive
        String msg = new String("Hi!"); // reference
        System.out.println("\nPrimitive x = " + x);
        System.out.println("Reference msg = " + msg);

        scanner.close();
    }
}

import java.util.Scanner;

public class VariableExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");   
        // userName is the variable (identifier), input is the value  
        String userName = scanner.nextLine(); 
        
        System.out.print("Enter your age: ");
        // userAge is the variable, input is the value
        int userAge = scanner.nextInt(); 
        
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + userAge);
        scanner.close();
    }
}
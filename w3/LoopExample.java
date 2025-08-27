/**
 * Loop Example - Expanded Guide
 * ----------------------------
 * Shows usage of for, while, and do-while loops in Java
 * with additional examples and best practices for beginners.
 */
public class LoopExample {
    public static void main(String[] args) {
        
        // ===== BASIC LOOPS (Your Original Examples) =====
        
        // 1. FOR LOOP: Print numbers 1 to 5
        System.out.println("FOR LOOP:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        
        // 2. WHILE LOOP: Print even numbers less than 10
        System.out.println("\nWHILE LOOP:");
        int num = 2;
        while (num < 10) {
            System.out.println("num = " + num);
            num += 2; // increment by 2
        }
        
        // 3. DO-WHILE LOOP: Print a countdown from 3
        System.out.println("\nDO-WHILE LOOP:");
        int count = 3;
        do {
            System.out.println("count = " + count);
            count--;
        } while (count > 0);
        
        System.out.println("\n" + "=".repeat(40));
        System.out.println("EXPANDED EXAMPLES AND BEST PRACTICES");
        System.out.println("=".repeat(40));
        
        // ===== MORE FOR LOOP EXAMPLES =====
        forLoopExamples();
        
        // ===== MORE WHILE LOOP EXAMPLES =====
        whileLoopExamples();
        
        // ===== MORE DO-WHILE LOOP EXAMPLES =====
        doWhileLoopExamples();
        
        // ===== ENHANCED FOR LOOP =====
        enhancedForLoopExamples();
        
        // ===== LOOP CONTROL (break and continue) =====
        loopControlExamples();
        
        // ===== NESTED LOOPS =====
        nestedLoopExamples();
        
        // ===== COMMON MISTAKES TO AVOID =====
        commonMistakes();
        
        System.out.println("\nEnd of LoopExample - Expanded Version.");
    }
    
    // ===== FOR LOOP VARIATIONS =====
    static void forLoopExamples() {
        System.out.println("\n--- MORE FOR LOOP EXAMPLES ---");
        
        // Counting backwards
        System.out.println("Counting backwards:");
        for (int i = 5; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }
        
        // Skip counting (increment by 3)
        System.out.println("\nSkip counting by 3:");
        for (int i = 0; i <= 15; i += 3) {
            System.out.println("Skip: " + i);
        }
        
        // Loop through an array
        System.out.println("\nLoop through array:");
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit " + (i + 1) + ": " + fruits[i]);
        }
        
        // Using multiple variables
        System.out.println("\nMultiple variables in for loop:");
        for (int i = 0, j = 10; i < 5; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
    
    // ===== WHILE LOOP VARIATIONS =====
    static void whileLoopExamples() {
        System.out.println("\n--- MORE WHILE LOOP EXAMPLES ---");
        
        // Sum numbers until reaching a target
        System.out.println("Sum numbers until reaching 20:");
        int sum = 0;
        int number = 1;
        while (sum < 20) {
            sum += number;
            System.out.println("Added " + number + ", sum = " + sum);
            number++;
        }
        
        // Find first number divisible by 7
        System.out.println("\nFind first number > 20 divisible by 7:");
        int testNum = 21;
        while (testNum % 7 != 0) {
            testNum++;
        }
        System.out.println("Found: " + testNum);
        
        // Process array elements
        System.out.println("\nProcess array with while loop:");
        int[] numbers = {2, 4, 6, 8, 10};
        int index = 0;
        while (index < numbers.length) {
            System.out.println("numbers[" + index + "] = " + numbers[index]);
            index++;
        }
    }
    
    // ===== DO-WHILE LOOP VARIATIONS =====
    static void doWhileLoopExamples() {
        System.out.println("\n--- MORE DO-WHILE LOOP EXAMPLES ---");
        
        // Menu simulation (runs at least once)
        System.out.println("Menu simulation:");
        int choice = 0;
        int menuCount = 0;
        do {
            menuCount++;
            System.out.println("Showing menu (time " + menuCount + ")");
            System.out.println("1. Play Game");
            System.out.println("2. Settings");
            System.out.println("3. Exit");
            
            // Simulate user choosing exit after 2 times
            if (menuCount >= 2) {
                choice = 3;
                System.out.println("User chose: Exit");
            } else {
                choice = 1;
                System.out.println("User chose: Play Game");
            }
        } while (choice != 3);
        
        // Generate numbers until condition met
        System.out.println("\nGenerate random-like numbers until > 8:");
        int randomNum;
        do {
            randomNum = (int)(Math.random() * 10) + 1;
            System.out.println("Generated: " + randomNum);
        } while (randomNum <= 8);
        System.out.println("Found number > 8: " + randomNum);
    }
    
    // ===== ENHANCED FOR LOOP (For-Each) =====
    static void enhancedForLoopExamples() {
        System.out.println("\n--- ENHANCED FOR LOOP (For-Each) ---");
        
        // Simple array iteration
        System.out.println("Enhanced for with array:");
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        for (String color : colors) {
            System.out.println("Color: " + color);
        }
        
        // With calculations
        System.out.println("\nCalculate sum using enhanced for:");
        int[] grades = {85, 92, 78, 96, 88};
        int total = 0;
        for (int grade : grades) {
            total += grade;
            System.out.println("Grade: " + grade + ", Running total: " + total);
        }
        double average = (double) total / grades.length;
        System.out.println("Average grade: " + average);
        
        // When to use enhanced for vs regular for
        System.out.println("\nWhen to use each type:");
        System.out.println("- Use enhanced for: when you just need the values");
        System.out.println("- Use regular for: when you need the index position");
    }
    
    // ===== LOOP CONTROL (break and continue) =====
    static void loopControlExamples() {
        System.out.println("\n--- LOOP CONTROL: break and continue ---");
        
        // Using break to exit early
        System.out.println("Using break to find first even number:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Checking: " + i);
            if (i % 2 == 0) {
                System.out.println("Found first even number: " + i);
                break; // Exit the loop immediately
            }
        }
        
        // Using continue to skip iterations
        System.out.println("\nUsing continue to skip odd numbers:");
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 1) {
                continue; // Skip the rest of this iteration
            }
            System.out.println("Even number: " + i);
        }
        
        // Practical example: processing valid data only
        System.out.println("\nProcess only positive numbers:");
        int[] data = {5, -2, 8, -1, 3, 0, 7};
        for (int value : data) {
            if (value <= 0) {
                System.out.println("Skipping non-positive: " + value);
                continue;
            }
            int squared = value * value;
            System.out.println(value + " squared = " + squared);
        }
    }
    
    // ===== NESTED LOOPS =====
    static void nestedLoopExamples() {
        System.out.println("\n--- NESTED LOOPS ---");
        
        // Simple multiplication table
        System.out.println("3x3 multiplication table:");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                int product = row * col;
                System.out.print(product + "\t"); // \t is tab
            }
            System.out.println(); // New line after each row
        }
        
        // Pattern printing
        System.out.println("\nStar pattern:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Finding pairs
        System.out.println("\nAll pairs from two arrays:");
        String[] firstNames = {"John", "Jane"};
        String[] lastNames = {"Doe", "Smith"};
        
        for (String first : firstNames) {
            for (String last : lastNames) {
                System.out.println("Full name: " + first + " " + last);
            }
        }
    }
    
    // ===== COMMON MISTAKES TO AVOID =====
    static void commonMistakes() {
        System.out.println("\n--- COMMON MISTAKES TO AVOID ---");
        
        System.out.println("MISTAKE 1: Infinite loops");
        System.out.println("   BAD:  while (i < 10) { print(i); }  // forgot i++");
        System.out.println("   GOOD: while (i < 10) { print(i); i++; }");
        
        System.out.println("\nMISTAKE 2: Off-by-one errors");
        System.out.println("   Array length is 5, valid indices are 0-4");
        System.out.println("   BAD:  for (i = 0; i <= array.length; i++)  // goes too far");
        System.out.println("   GOOD: for (i = 0; i < array.length; i++)");
        
        System.out.println("\nMISTAKE 3: Modifying loop variable incorrectly");
        System.out.println("   Be careful when changing loop variables inside the loop");
        
        System.out.println("\nBEST PRACTICES:");
        System.out.println("   • Use enhanced for-loop when you don't need the index");
        System.out.println("   • Always make sure your loop condition can become false");
        System.out.println("   • Use meaningful variable names (not just i, j, k)");
        System.out.println("   • Consider using break/continue for cleaner logic");
        System.out.println("   • Test your loops with small examples first");
        
        // Safe loop example
        System.out.println("\nSAFE LOOP EXAMPLE:");
        System.out.println("Using a counter to prevent infinite loops:");
        
        int attempts = 0;
        int maxAttempts = 5;
        boolean found = false;
        
        while (!found && attempts < maxAttempts) {
            attempts++;
            // Simulate searching for something
            found = (attempts == 3); // Found on 3rd attempt
            System.out.println("Attempt " + attempts + ": " + (found ? "Found!" : "Not found"));
        }
        
        if (!found) {
            System.out.println("Stopped after " + maxAttempts + " attempts to avoid infinite loop");
        }
    }
}
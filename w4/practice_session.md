# Week 4 Java Tutorial: Arrays & Loops


### 1. Loops & Static Methods

#### 1.1 Overview of Loops
Loops allow repeated execution of code blocks, reducing redundancy. Choose the right loop based on your needs:
- **while**: For conditions checked before execution.
- **do-while**: For at least one execution regardless of condition.
- **for**: For known iteration counts.
- **for-each**: For iterating collections without index management.

**Best Practice**: Always initialize variables outside loops if needed, and avoid infinite loops by ensuring conditions change.

#### 1.2 while Loop
A `while` loop executes as long as a condition is true. It's ideal for scenarios where the number of iterations is unknown.

**Best Practice**: Use a counter or flag to control the loop, and handle potential infinite loops with safeguards (e.g., max iterations).

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        int counter = 1;  // Meaningful variable name
        final int MAX_VALUE = 5;  // Constant for magic number avoidance

        while (counter <= MAX_VALUE) {
            System.out.println("Counter value: " + counter);
            counter++;  // Update inside loop to prevent infinite loop
        }
        System.out.println("End of WhileLoopExample.");
    }
}
```

**Expected Output**:
```
This submission belongs to [Your SID], [Your Name]
Counter value: 1
Counter value: 2
Counter value: 3
Counter value: 4
Counter value: 5
End of WhileLoopExample.
```

#### 1.3 do-while Loop
Similar to `while`, but guarantees at least one execution.

**Best Practice**: Useful for user input validation where you need to prompt at least once. Close resources properly.

```java
import java.util.Scanner;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        try (Scanner scanner = new Scanner(System.in)) {  // Try-with-resources for auto-closing
            int userInput;
            do {
                System.out.print("Enter a positive number (0 to exit): ");
                userInput = scanner.nextInt();
                if (userInput > 0) {
                    System.out.println("You entered: " + userInput);
                }
            } while (userInput > 0);
        }  // Scanner closes automatically
        System.out.println("End of DoWhileLoopExample.");
    }
}
```

**Expected Output** (Sample Interaction):
```
This submission belongs to [Your SID], [Your Name]
Enter a positive number (0 to exit): 5
You entered: 5
Enter a positive number (0 to exit): 3
You entered: 3
Enter a positive number (0 to exit): 0
End of DoWhileLoopExample.
```

#### 1.4 for Loop
Used when iterations are fixed.

**Best Practice**: Declare loop variables inside the `for` statement for scope limitation.

```java
public class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        final int ITERATIONS = 5;
        for (int i = 0; i < ITERATIONS; i++) {  // Variable scoped to loop
            System.out.println("Iteration: " + i);
        }
        System.out.println("End of ForLoopExample.");
    }
}
```

**Expected Output**:
```
This submission belongs to [Your SID], [Your Name]
Iteration: 0
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
End of ForLoopExample.
```

#### 1.5 for-each Loop
Simplifies iterating over arrays or collections.

**Best Practice**: Use when you don't need indices; it's read-only and prevents off-by-one errors.

```java
public class ForEachLoopExample {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        String[] fruits = {"Apple", "Banana", "Cherry"};  // Array initialization

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        System.out.println("End of ForEachLoopExample.");
    }
}
```

**Expected Output**:
```
This submission belongs to [Your SID], [Your Name]
Fruit: Apple
Fruit: Banana
Fruit: Cherry
End of ForEachLoopExample.
```

#### 1.6 Break & Continue Statements
- `break`: Exit loop early.
- `continue`: Skip to next iteration.

**Best Practice**: Use sparingly; prefer clear conditions. Label loops for nested scenarios if needed.

```java
public class BreakContinueExample {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping: " + i);
                continue;  // Skip rest of iteration
            }
            if (i == 5) {
                System.out.println("Breaking at: " + i);
                break;  // Exit loop
            }
            System.out.println("Processing: " + i);
        }
    }
}
```

**Expected Output**:
```
This submission belongs to [Your SID], [Your Name]
Processing: 1
Processing: 2
Skipping: 3
Processing: 4
Breaking at: 5
```

### 2. Static Methods
Static methods are class-level and don't require instances.

**Best Practice**: Use for utility functions. Keep them pure (no side effects) and thread-safe.

```java
public class StaticMethodsExample {
    // Static utility method
    public static int square(int number) {
        return number * number;
    }

    // Another static method
    public static int cube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        int value = 5;
        System.out.println("Square: " + square(value));
        System.out.println("Cube: " + cube(value));
    }
}
```

**Expected Output**:
```
This submission belongs to [Your SID], [Your Name]
Square: 25
Cube: 125
```

### 3. Arrays & Strings

#### 3.1 Arrays Overview
Arrays store fixed-size collections of elements.

**Best Practice**: Use `Arrays` utility class for operations like sorting. Handle `ArrayIndexOutOfBoundsException`.

| Operation | Example | Description | Best Practice |
|-----------|---------|-------------|---------------|
| Declare | `int[] arr;` | Defines variable | Declare with type. |
| Create | `arr = new int[5];` | Allocates space | Check length to avoid overflows. |
| Initialize | `int[] arr = {1,2,3};` | Pre-sets values | Use for small arrays. |
| Access | `arr[0]` | Retrieves element | Validate indices. |
| Length | `arr.length` | Gets size | Cache in variable for loops. |

#### 3.2 Finding Max & Min in an Array
**Best Practice**: Initialize min/max with array elements, not arbitrary values. Use enhanced for-loop for readability.

```java
import java.util.Scanner;

public class ArrayMaxMinExample {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        try (Scanner scanner = new Scanner(System.in)) {
            final int SIZE = 5;
            int[] numbers = new int[SIZE];

            for (int i = 0; i < SIZE; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            if (numbers.length == 0) {
                System.out.println("Array is empty.");
                return;
            }

            int max = numbers[0];
            int min = numbers[0];

            for (int num : numbers) {
                if (num > max) max = num;
                if (num < min) min = num;
            }

            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
        }
    }
}
```

**Expected Output** (Sample Input: 10 20 5 30 15):
```
This submission belongs to [Your SID], [Your Name]
Enter number 1: 10
Enter number 2: 20
Enter number 3: 5
Enter number 4: 30
Enter number 5: 15
Maximum: 30
Minimum: 5
```

#### 3.3 String Manipulations in Java
Strings are immutable; operations return new strings.

**Best Practice**: Use `StringBuilder` for heavy concatenations. Always check for nulls.

| Operation | Example | Description | Best Practice |
|-----------|---------|-------------|---------------|
| Length | `str.length()` | Char count | Use for bounds checking. |
| Concatenation | `"Hello" + " World"` | Joins | Prefer `String.format()` for complex. |
| Substring | `str.substring(0,5)` | Extracts | Handle out-of-bounds with try-catch. |
| Char at Index | `str.charAt(2)` | Gets char | Validate index. |
| Equality | `str1.equals(str2)` | Compares | Use `equalsIgnoreCase` for case-insensitivity. |
| Case Conversion | `str.toLowerCase()` | Lowers case | Chain methods. |
| Trim | `str.trim()` | Removes whitespace | Always trim user input. |
| Replace | `str.replace('a', 'b')` | Replaces | Use regex for patterns. |
| Split | `str.split(" ")` | To array | Handle empty results. |

#### 3.4 String Example: Checking Vowel Count
**Best Practice**: Convert to lowercase for case-insensitivity. Use `String.contains()` or sets for checks.

```java
import java.util.Scanner;

public class StringVowelCounter {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine().trim();  // Trim whitespace

            if (input.isEmpty()) {
                System.out.println("Input is empty.");
                return;
            }

            String lowerInput = input.toLowerCase();
            int vowelCount = 0;
            final String VOWELS = "aeiou";  // Constant for vowels

            for (char ch : lowerInput.toCharArray()) {
                if (VOWELS.indexOf(ch) != -1) {
                    vowelCount++;
                }
            }
            System.out.println("Total vowels: " + vowelCount);
        }
    }
}
```

**Expected Output** (Input: "Hello World"):
```
This submission belongs to [Your SID], [Your Name]
Enter a string: Hello World
Total vowels: 3
```

### 4. Exception Handling
Handles runtime errors gracefully.

**Best Practice**: Catch specific exceptions, use `finally` for cleanup, and log errors (e.g., `e.printStackTrace()` for debugging).

```java
public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        try {
            int a = 10;
            int b = 0;
            int result = a / b;  // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            // e.printStackTrace();  // For debugging, uncomment in development
        } finally {
            System.out.println("Cleanup: This always executes.");
        }
    }
}
```

**Expected Output**:
```
This submission belongs to [Your SID], [Your Name]
Error: Cannot divide by zero.
Cleanup: This always executes.
```

---


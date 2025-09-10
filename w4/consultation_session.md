##  Hands-on Coding

Implement these tasks using the concepts above. Solutions provided with best practices. Run each, screenshot outputs, and include in your document.

### Task A: Sum of Odd Numbers (1 to 50)

**Solution**:
```java
public class SumOddNumbers {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        final int START = 1;
        final int END = 50;
        int sum = 0;

        for (int i = START; i <= END; i++) {
            if (i % 2 != 0) {  // Check for odd
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from " + START + " to " + END + ": " + sum);
    }
}
```

**Expected Output**:
```
This submission belongs to [Your SID], [Your Name]
Sum of odd numbers from 1 to 50: 625
```

### Task B: Factorial Calculation
**Solution** (Handles non-negative input):
```java
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Factorial not defined for negative numbers.");
                return;
            }

            long factorial = 1;  // Use long for larger values
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println(n + "! = " + factorial);
        }
    }
}
```

**Expected Output** (Input: 5):
```
This submission belongs to [Your SID], [Your Name]
Enter a non-negative integer: 5
5! = 120
```

### Task C: 2D Array Input & Output
**Solution** (3x3 matrix):
```java
import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        final int ROWS = 3;
        final int COLS = 3;
        int[][] matrix = new int[ROWS][COLS];

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLS; j++) {
                    System.out.print("Enter value for [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
```

**Expected Output** (Sample Input: 1 2 3 4 5 6 7 8 9):
```
This submission belongs to [Your SID], [Your Name]
Enter value for [0][0]: 1
... (prompts continue)
Matrix:
1 2 3 
4 5 6 
7 8 9 
```

### Task D: Armstrong Number Finder
An Armstrong number equals the sum of its digits raised to the power of digit count (e.g., 153 = 1^3 + 5^3 + 3^3).

**Solution**:
```java
import java.util.Scanner;

public class ArmstrongFinder {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter start of range: ");
            int start = scanner.nextInt();
            System.out.print("Enter end of range: ");
            int end = scanner.nextInt();

            System.out.println("Armstrong numbers:");
            for (int num = start; num <= end; num++) {
                if (isArmstrong(num)) {
                    System.out.println(num);
                }
            }
        }
    }

    // Static method for reusability
    private static boolean isArmstrong(int num) {
        String numStr = String.valueOf(num);
        int digits = numStr.length();
        int sum = 0;
        for (char ch : numStr.toCharArray()) {
            int digit = Character.getNumericValue(ch);
            sum += (int) Math.pow(digit, digits);
        }
        return sum == num;
    }
}
```

**Expected Output** (Range: 1 to 999):
```
This submission belongs to [Your SID], [Your Name]
Enter start of range: 1
Enter end of range: 999
Armstrong numbers:
1
2
3
4
5
6
7
8
9
153
370
371
407
```

### Task E: String Reversal & Palindrome Check
**Solution**:
```java
import java.util.Scanner;

public class StringReversalPalindrome {
    public static void main(String[] args) {
        System.out.println("This submission belongs to [Your SID], [Your Name]");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Input is empty.");
                return;
            }

            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed: " + reversed);

            if (input.equalsIgnoreCase(reversed)) {
                System.out.println("It is a palindrome.");
            } else {
                System.out.println("It is not a palindrome.");
            }
        }
    }
}
```

**Expected Output** (Input: "radar"):
```
This submission belongs to [Your SID], [Your Name]
Enter a string: radar
Reversed: radar
It is a palindrome.
```

---

## References & Next Steps
- Lecture Slides – Week 4
- Java: The Complete Reference (Herbert Schildt) – Chapters 5,7,8,13

For submission: Compile all code outputs (with screenshots) into one document and upload to Canvas. Practice optional tasks from lectures for extra credit. If you have questions, discuss in consultation sessions!
import java.util.*;

/**
 * Week 4 - Arrays & Loops (Complete Tutorial Runner)
 * Covers: Loops, Static Methods, Arrays & Strings, Exception Handling
 * Practice: Tasks A–E
 *
 * How to compile/run:
 *   javac -d out src/week4/Week4Main.java
 *   java -cp out week4.Week4Main
 */
public class Week4Main {

    // ======= Replace these before submitting screenshots =======
    private static final String STUDENT_ID   = "REPLACE_WITH_YOUR_SID";
    private static final String STUDENT_NAME = "REPLACE_WITH_YOUR_NAME";
    // ===========================================================

    private static final Scanner SC = new Scanner(System.in);

    private static void printSubmissionTag() {
        System.out.println("This submission belongs to " + STUDENT_ID + ", " + STUDENT_NAME);
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Week 4: Arrays & Loops – Main Menu ===");
            System.out.println("1) Loop demos (while / do-while / for / for-each / break-continue)");
            System.out.println("2) Static methods (square/cube)");
            System.out.println("3) Arrays: Max & Min (length=5)");
            System.out.println("4) Strings: Vowel counter");
            System.out.println("5) Exception handling demo");
            System.out.println("6) Task A: Sum of odd numbers (1..50)");
            System.out.println("7) Task B: Factorial using while");
            System.out.println("8) Task C: 3x3 matrix input + print");
            System.out.println("9) Task D: Armstrong numbers in range");
            System.out.println("10) Task E: Reverse & Palindrome check");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");

            int choice = readIntLineSafe();
            switch (choice) {
                case 1 -> demoLoops();
                case 2 -> demoStaticMethods();
                case 3 -> demoArrayMaxMin();
                case 4 -> demoStringVowelCounter();
                case 5 -> demoExceptionHandling();
                case 6 -> taskSumOdd();
                case 7 -> taskFactorial();
                case 8 -> taskMatrix3x3();
                case 9 -> taskArmstrongRange();
                case 10 -> taskReversePalindrome();
                case 0 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // ---------- Safe input helpers ----------
    private static int readIntLineSafe() {
        while (true) {
            try {
                String line = SC.nextLine().trim();
                return Integer.parseInt(line);
            } catch (Exception e) {
                System.out.print("Please enter a valid integer: ");
            }
        }
    }

    private static long readLongLineSafe() {
        while (true) {
            try {
                String line = SC.nextLine().trim();
                return Long.parseLong(line);
            } catch (Exception e) {
                System.out.print("Please enter a valid long integer: ");
            }
        }
    }

    private static String readLine() {
        return SC.nextLine();
    }

    // ---------- 1) Loops ----------
    private static void demoLoops() {
        printSubmissionTag();

        // while: print 1..5
        System.out.println("[while] Count 1..5");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        // do-while: countdown 5..1
        System.out.println("[do-while] Countdown 5..1");
        int j = 5;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= 1);
        System.out.println("\n");

        // for: print even numbers < 10
        System.out.println("[for] Even numbers < 10");
        for (int k = 0; k < 10; k += 2) {
            System.out.print(k + " ");
        }
        System.out.println("\n");

        // for-each: iterate array
        System.out.println("[for-each] Fruits");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String f : fruits) {
            System.out.println("- " + f);
        }
        System.out.println();

        // break / continue
        System.out.println("[break/continue] Iterate 1..5, skip 3, break at 5");
        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                System.out.println("continue at " + n);
                continue;
            }
            if (n == 5) {
                System.out.println("break at " + n);
                break;
            }
            System.out.println("n = " + n);
        }
    }

    // ---------- 2) Static Methods ----------
    private static int square(int x) { return x * x; }
    private static int cube(int x) { return x * x * x; }

    private static void demoStaticMethods() {
        printSubmissionTag();
        System.out.print("Enter an integer to square & cube: ");
        int x = readIntLineSafe();
        System.out.println("square(" + x + ") = " + square(x));
        System.out.println("cube(" + x + ")   = " + cube(x));
    }

    // ---------- 3) Arrays & Strings ----------
    private static void demoArrayMaxMin() {
        printSubmissionTag();
        System.out.println("Enter 5 integers:");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = readIntLineSafe();
        }

        int max = arr[0], min = arr[0];
        for (int v : arr) {
            if (v > max) max = v;
            if (v < min) min = v;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    private static void demoStringVowelCounter() {
        printSubmissionTag();
        System.out.print("Enter a string: ");
        String s = readLine().toLowerCase(Locale.ROOT);
        int count = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) count++;
        }
        System.out.println("Total vowels: " + count);
    }

    // ---------- 4) Exception Handling ----------
    private static void demoExceptionHandling() {
        printSubmissionTag();
        try {
            int a = 10, b = 0;
            int r = a / b; // will throw ArithmeticException
            System.out.println("Result: " + r); // unreachable
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("This block always executes.");
        }
    }

    // ---------- Practice Tasks ----------
    // Task A: Sum of Odd Numbers (1..50)
    private static void taskSumOdd() {
        printSubmissionTag();
        int sum = 0;
        for (int n = 1; n <= 50; n += 2) sum += n;
        System.out.println("Sum of odd numbers from 1..50 = " + sum);
    }

    // Task B: Factorial using while
    private static void taskFactorial() {
        printSubmissionTag();
        System.out.print("Enter n (0..20) for n!: ");
        int n = readIntLineSafe();
        if (n < 0 || n > 20) {
            System.out.println("Please enter 0..20 (to avoid overflow in long).");
            return;
        }
        long fact = 1L;
        int i = n;
        while (i > 1) {
            fact *= i;
            i--;
        }
        System.out.println(n + "! = " + fact);
    }

    // Task C: 3x3 Matrix I/O
    private static void taskMatrix3x3() {
        printSubmissionTag();
        int[][] m = new int[3][3];
        System.out.println("Enter 9 integers for a 3x3 matrix:");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("m[" + r + "][" + c + "] = ");
                m[r][c] = readIntLineSafe();
            }
        }
        System.out.println("Matrix:");
        for (int[] row : m) {
            for (int v : row) System.out.printf("%4d", v);
            System.out.println();
        }
    }

    // Task D: Armstrong numbers in range
    private static void taskArmstrongRange() {
        printSubmissionTag();
        System.out.print("Enter range start: ");
        int start = readIntLineSafe();
        System.out.print("Enter range end: ");
        int end = readIntLineSafe();
        if (start > end) {
            int tmp = start; start = end; end = tmp;
        }
        System.out.println("Armstrong numbers in [" + start + ", " + end + "]:");
        boolean found = false;
        for (int n = Math.max(0, start); n <= end; n++) {
            if (isArmstrong(n)) {
                System.out.print(n + " ");
                found = true;
            }
        }
        System.out.println(found ? "" : "(none)");
    }

    private static boolean isArmstrong(int n) {
        String s = Integer.toString(n);
        int d = s.length();
        int sum = 0, x = n;
        while (x > 0) {
            int digit = x % 10;
            sum += powInt(digit, d);
            x /= 10;
        }
        return sum == n || n == 0; // consider 0 as Armstrong
    }

    private static int powInt(int base, int exp) {
        int r = 1;
        for (int i = 0; i < exp; i++) r *= base;
        return r;
    }

    // Task E: Reverse & Palindrome
    private static void taskReversePalindrome() {
        printSubmissionTag();
        System.out.print("Enter a string: ");
        String s = readLine();
        String reversed = new StringBuilder(s).reverse().toString();

        // Palindrome check (ignore case & non-alphanumeric)
        String norm = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase(Locale.ROOT);
        String normRev = new StringBuilder(norm).reverse().toString();
        boolean isPal = norm.equals(normRev);

        System.out.println("Reversed: " + reversed);
        System.out.println("Palindrome (ignore case & non-alphanumeric): " + isPal);
    }
}

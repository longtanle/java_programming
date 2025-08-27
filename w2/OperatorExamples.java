public class OperatorExamples {
    public static void main(String[] args) {
        // Declaration and Initialization
        int a = 9; // 'a = 10' is an expression, '=' is the assignment operator
        int b = 5;

        // Arithmetic Operators and Expressions
        int sum = a + b; // 'a + b' is an expression, '+' is the addition operator
        int difference = a - b; // '-' is the subtraction operator
        int product = a * b; // '*' is the multiplication operator
        int quotient = a / b; // '/' is the division operator
        int remainder = a % b; // '%' is the modulus operator

        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Relational Operators and Expressions
        boolean isGreaterThan = a > b; // '>' is the greater than operator
        boolean isEqual = a == b; // '==' is the equality operator

        System.out.println("\nRelational Operations:");
        System.out.println("a > b: " + isGreaterThan);
        System.out.println("a == b: " + isEqual);

        // Logical Operators and Expressions
        boolean x = true;
        boolean y = false;
        boolean logicalAND = x && y; // '&&' is the logical AND operator
        boolean logicalOR = x || y; // '||' is the logical OR operator
        boolean logicalNOT = !x; // '!' is the logical NOT operator

        System.out.println("\nLogical Operations:");
        System.out.println("x && y: " + logicalAND);
        System.out.println("x || y: " + logicalOR);
        System.out.println("!x: " + logicalNOT);

        // Unary Operators and Expressions
        int c = 7;
        c++; // '++' is the increment operator (postfix)
        int d = --c; // '--' is the decrement operator (prefix)

        System.out.println("\nUnary Operations:");
        System.out.println("c after increment: " + c);
        System.out.println("d after prefix decrement: " + d);

        // Compound Assignment Operators and Expressions
        int e = 20;
        e += 5; // 'e += 5' is equivalent to 'e = e + 5'
        System.out.println("\nCompound Assignment:");
        System.out.println("e after e += 5: " + e);
    }
}
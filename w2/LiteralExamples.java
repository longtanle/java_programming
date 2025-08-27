public class LiteralExamples {
    public static void main(String[] args) {
        // Integer Literals
        int decimalLiteral = 123;         // Decimal (base 10)
        int octalLiteral = 0173;          // Octal (base 8) - prefix with 0
        int hexadecimalLiteral = 0x7B;    // Hexadecimal (base 16) - prefix with 0x
        int binaryLiteral = 0b1111011;    // Binary (base 2) - prefix with 0b
        long longLiteral = 550000L;       // Long integer - suffix with L or l

        // Floating-Point Literals
        float floatLiteral = 3.14f;       // Float - suffix with f or F
        double doubleLiteral = 2.718;     // Double (default for floating-point literals)
        double scientificNotation = 1.23e-4; // Scientific notation

        // Character Literals
        char charLiteral = 'A';           // Single character enclosed in single quotes
        char unicodeChar = '\u0041';      // Unicode escape sequence for 'A'
        char newLineChar = '\n';          // Escape sequence for newline
        char tabChar = '\t';              // Escape sequence for tab

        // Boolean Literals
        boolean trueLiteral = true;       // Represents true logical value
        boolean falseLiteral = false;     // Represents false logical value

        // String Literals
        String stringLiteral = "Hello, Java!"; // Sequence of characters enclosed in double quotes

        // Printing the values to demonstrate
        System.out.println("Integer Literals:");
        System.out.println("Decimal: " + decimalLiteral);
        System.out.println("Octal: " + octalLiteral);
        System.out.println("Hexadecimal: " + hexadecimalLiteral);
        System.out.println("Binary: " + binaryLiteral);
        System.out.println("Long: " + longLiteral);

        System.out.println("\nFloating-Point Literals:");
        System.out.println("Float: " + floatLiteral);
        System.out.println("Double: " + doubleLiteral);
        System.out.println("Scientific Notation: " + scientificNotation);

        System.out.println("\nCharacter Literals:");
        System.out.println("Char: " + charLiteral);
        System.out.println("Unicode Char: " + unicodeChar);
        System.out.println("Newline Char: " + newLineChar + "After Newline");
        System.out.println("Tab Char: " + tabChar + "After Tab");

        System.out.println("\nBoolean Literals:");
        System.out.println("True: " + trueLiteral);
        System.out.println("False: " + falseLiteral);

        System.out.println("\nString Literals:");
        System.out.println("String: " + stringLiteral);
    }
}
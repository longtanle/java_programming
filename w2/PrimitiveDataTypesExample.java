public class PrimitiveDataTypesExample {

    public static void main(String[] args) {

        // Integer types
        byte myByte = 100; // 8-bit signed integer
        short myShort = 30000; // 16-bit signed integer
        int myInt = 2000000000; // 32-bit signed integer
        long myLong = 9000000000000000000L; // 64-bit signed integer (note the 'L')

        // Floating-point types
        float myFloat = 3.14f; // 32-bit single-precision floating-point (note the 'f')
        double myDouble = 3.141592653589793; // 64-bit double-precision floating-point

        // Character type
        char myChar = 'A'; // 16-bit Unicode character

        // Boolean type
        boolean myBoolean = true; // Represents true or false

        // Printing the values
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);
    }
}
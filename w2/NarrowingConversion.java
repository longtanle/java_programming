class NarrowingConversion {
    public static void main(String[] args) {
        double doubleValue = 100.75;
        float floatValue = (float) doubleValue; // double is explicitly cast to int
        System.out.println("Double value: " + doubleValue);
        System.out.println("Float value: " + floatValue); // Output will be 100 (decimal part truncated)
    }
}
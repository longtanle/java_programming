public class StringExample {
    public static void main(String[] args) {
        String sentence = "Java Programming is fun!";
        System.out.println("Length: " + sentence.length());
        System.out.println("Char at index 5: " + sentence.charAt(5));
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Substring: " + sentence.substring(5, 16));
        System.out.println("Replace: " + sentence.replace("fun", "awesome"));
    }
}

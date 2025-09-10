package utils;
public class StringProcessor {
    public static void process(String sentence) {
        String lower = sentence.toLowerCase();
        String upper = sentence.toUpperCase();
        int length = sentence.length();
        String replaced = sentence.replace("java", "Python");
        boolean containsJava = sentence.toLowerCase().contains("java");
        int wordCount = sentence.trim().split("\\s+").length;

        System.out.println("\n--- String Analysis ---");
        System.out.println("Original: " + sentence);
        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
        System.out.println("Length: " + length);
        System.out.println("Replaced: " + replaced);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Contains 'java'? " + containsJava);
    }
}

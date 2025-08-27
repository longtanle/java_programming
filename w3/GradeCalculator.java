public class GradeCalculator {

    // Using constants for clarity and easy modification
    private static final int GRADE_A_MIN = 90;
    private static final int GRADE_B_MIN = 80;
    private static final int GRADE_C_MIN = 70;

    public static String calculateGrade(int score) {
        // Order conditions from most specific/highest probability to least specific/lowest probability.
        // This can improve performance if certain conditions are met frequently.
        if (score >= GRADE_A_MIN) {
            return "Grade A";
        } else if (score >= GRADE_B_MIN) {
            return "Grade B";
        } else if (score >= GRADE_C_MIN) {
            return "Grade C";
        } else {
            // The 'else' block handles all remaining cases, ensuring all paths are covered.
            return "Grade F";
        }
    }

    public static void main(String[] args) {
        int studentScore = 85;
        String grade = calculateGrade(studentScore);
        System.out.println("Student score: " + studentScore + ", Grade: " + grade); // Output: Student score: 85, Grade: B

        studentScore = 92;
        grade = calculateGrade(studentScore);
        System.out.println("Student score: " + studentScore + ", Grade: " + grade); // Output: Student score: 92, Grade: A

        studentScore = 60;
        grade = calculateGrade(studentScore);
        System.out.println("Student score: " + studentScore + ", Grade: " + grade); // Output: Student score: 60, Grade: F
    }
}
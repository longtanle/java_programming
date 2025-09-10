package java_programming.w4;
public class Example {

    // Static variable (belongs to the class)
    static int staticCounter = 0;

    // Non-static variable (belongs to the object)
    int instanceCounter = 0;

    // Static method
    public static void staticMethod() {
        System.out.println("I am a static method.");
        // Can access static variables
        System.out.println("Static counter: " + staticCounter);
        // Cannot access instanceCounter directly here
    }

    // Non-static method
    public void instanceMethod() {
        System.out.println("I am a non-static method.");
        // Can access both static and non-static variables
        System.out.println("Instance counter: " + instanceCounter);
        System.out.println("Static counter: " + staticCounter);
    }

    public static void main(String[] args) {

        // Call static method without creating an object
        Example.staticMethod();

        // Create first object
        Example obj1 = new Example();
        obj1.instanceCounter++;
        staticCounter++;

        // Create second object
        Example obj2 = new Example();
        obj2.instanceCounter++;
        staticCounter++;

        // Call non-static methods (need an object)
        obj1.instanceMethod();
        obj2.instanceMethod();

        // Check values
        System.out.println("obj1.instanceCounter = " + obj1.instanceCounter); // 1
        System.out.println("obj2.instanceCounter = " + obj2.instanceCounter); // 1
        System.out.println("Static counter (shared) = " + Example.staticCounter); // 2
    }
}

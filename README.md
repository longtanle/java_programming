# Java Syntax Cheat Sheet

## 1. Program Structure

```java
// 1. Comments
package mypackage;         // 2. Package (optional)
import java.util.Scanner;  // 3. Import statements (optional)

public class MyProgram {   // 4. Class declaration
    public static void main(String[] args) { // 5. Main method
        System.out.println("Hello, Java!");  // 6. Statements
    }
}
```

**Rules:**

* **Filename = public class name** (`MyProgram.java` → `public class MyProgram`)
* The `main` method is the **entry point** for execution:

  ```java
  public static void main(String[] args)
  ```

---

## 2. Comments

```java
// Single-line comment
/* Multi-line
   comment */
/** Documentation comment (Javadoc) */
```

---

## 3. Data Types & Variables

Java is **strongly typed**: you must declare the type.

| Type      | Example                  | Purpose           |
| --------- | ------------------------ | ----------------- |
| `int`     | `int age = 25;`          | Whole numbers     |
| `double`  | `double pi = 3.14;`      | Decimal numbers   |
| `boolean` | `boolean isOn = true;`   | True/false values |
| `char`    | `char grade = 'A';`      | Single character  |
| `String`  | `String name = "Alice";` | Text (object)     |

---

## 4. Operators

### Arithmetic

`+`, `-`, `*`, `/`, `%`

```java
int a = 10, b = 3;
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

### Comparison

`==`, `!=`, `>`, `<`, `>=`, `<=`

### Logical

`&&` (and), `||` (or), `!` (not)

### Assignment

`=`, `+=`, `-=`, `*=`, `/=`

---

## 5. Control Flow

### If-Else

```java
if (score >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

### Switch

```java
switch (day) {
    case 1: System.out.println("Mon"); break;
    case 2: System.out.println("Tue"); break;
    default: System.out.println("Other");
}
```

### Loops

```java
// for loop
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// while loop
int x = 0;
while (x < 5) {
    System.out.println(x);
    x++;
}

// do-while loop
int y = 0;
do {
    System.out.println(y);
    y++;
} while (y < 5);
```

---

## 6. Methods

```java
public static int add(int x, int y) {
    return x + y;
}

int sum = add(3, 4);
```

**Keywords:**

* `public` → accessible anywhere
* `static` → can run without creating an object
* Return type (`int`, `void`, etc.)
* Parameters in parentheses

---

## 7. Classes & Objects

```java
public class Car {
    String model;
    int year;

    public void honk() {
        System.out.println("Beep!");
    }
}

Car myCar = new Car();  // Create object
myCar.model = "Toyota"; // Assign value
myCar.honk();           // Call method
```

---

## 8. Strings

```java
String s = "Java";
System.out.println(s.length());      // 4
System.out.println(s.toUpperCase()); // JAVA
System.out.println(s.charAt(0));     // J
```

---

## 9. Escape Sequences

| Sequence | Meaning      |
| -------- | ------------ |
| `\n`     | New line     |
| `\t`     | Tab          |
| `\"`     | Double quote |
| `\'`     | Single quote |
| `\\`     | Backslash    |
| `\b`     | Backspace    |

Example:

```java
System.out.println("Hello,\nWorld!");
```

---

## 10. Printing

```java
System.out.println("Line with newline");
System.out.print("Same line");
System.out.printf("Name: %s, Age: %d", "Alex", 25);
```

---

## 11. Compilation & Execution

```bash
# Compile
javac MyProgram.java

# Run (no .java)
java MyProgram
```

---

## 12. Common Errors

* **Filename/Class Mismatch** → must match exactly.
* **Missing Semicolon `;`** → every statement ends with `;`.
* **Case Sensitivity** → Java keywords, class names, and variables are case-sensitive.
* **Unmatched Braces** `{ }` → every `{` must have a `}`.

---
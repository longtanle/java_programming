# Java Gotchas & Good Practices

## 1. **Filename vs Class Name**

**Gotcha:**
If your class is declared as:

```java
public class HelloWorld { ... }
```

your file **must** be saved as:

```
HelloWorld.java
```

Otherwise, compilation will fail.
**Good Practice:** Always keep file and public class names identical.

---

## 2. **Case Sensitivity**

**Gotcha:**
Java is case-sensitive:
`System.out.println()` works, but `system.out.Println()` will fail.
**Good Practice:** Follow Java naming conventions:

* Classes: **PascalCase** (`MyProgram`)
* Variables & methods: **camelCase** (`myVariable`, `doSomething`)
* Constants: **UPPER\_CASE** (`MAX_SIZE`)

---

## 3. **Missing Semicolons**

**Gotcha:**
Every statement must end with `;`. Forgetting it causes syntax errors.
**Good Practice:** Get into the habit of finishing statements immediately.

---

## 4. **Braces `{}` and Indentation**

**Gotcha:**
Unmatched braces cause compilation errors.
**Good Practice:**

* Use proper indentation.
* Most IDEs auto-format code with `Ctrl+Shift+F` (Windows/Linux) or `Cmd+Shift+F` (Mac).

---

## 5. **Main Method Signature**

**Gotcha:**
Java won’t run without:

```java
public static void main(String[] args)
```

**Good Practice:** Don’t change `String[] args` spelling or order.

---

## 6. **Integer Division Trap**

**Gotcha:**
`5 / 2` = `2` (not `2.5`) because both are integers.
**Good Practice:**
Use at least one `double`:

```java
double result = 5 / 2.0; // 2.5
```

---

## 7. **String Comparison**

**Gotcha:**
Using `==` compares object references, **not content**.
**Good Practice:**

```java
if (str1.equals(str2)) { ... }
```

Use `.equalsIgnoreCase()` for case-insensitive comparison.

---

## 8. **Null Pointer Exceptions (NPEs)**

**Gotcha:**
Accessing methods/fields of a `null` object throws `NullPointerException`.
**Good Practice:**

* Always check for `null` before using an object.
* Initialize variables before use.

---

## 9. **Type Mismatch in Assignments**

**Gotcha:**

```java
int x = 3.5; // Error: double to int
```

**Good Practice:**
Explicitly cast only when safe:

```java
int x = (int) 3.5; // x = 3
```

---

## 10. **Forgetting to Import Classes**

**Gotcha:**
Using classes like `Scanner` without importing:

```java
import java.util.Scanner;
```

**Good Practice:**

* Import only what you need or use `import java.util.*;` for multiple.

---

## 11. **Infinite Loops**

**Gotcha:**
Forgetting loop exit conditions causes infinite loops.
**Good Practice:**
Double-check loop logic and test with small datasets.

---

## 12. **Escape Sequences Misuse**

**Gotcha:**

```java
System.out.println("C:\newfolder"); // Error: \n is newline
```

**Good Practice:**
Escape backslashes:

```java
System.out.println("C:\\newfolder");
```

---

## 13. **Magic Numbers**

**Gotcha:**
Hardcoding values makes code harder to read/maintain.
**Good Practice:**
Use constants:

```java
final int MAX_USERS = 100;
```

---

## 14. **Using Public Fields**

**Gotcha:**
Public fields can be modified directly, breaking encapsulation.
**Good Practice:**
Use `private` fields + getters/setters.

---

## 15. **Printing vs Debugging**

**Gotcha:**
Using `System.out.println()` everywhere for debugging clutters output.
**Good Practice:**

* Use a debugger in your IDE.
* Remove debugging prints before submission.

---

## 16. **Resource Leaks**

**Gotcha:**
Not closing files or scanners leads to resource leaks.
**Good Practice:**
Use try-with-resources:

```java
try (Scanner sc = new Scanner(System.in)) {
    // use sc
}
```

---

## 17. **Mixing Tabs & Spaces**

**Gotcha:**
Inconsistent indentation makes code messy.
**Good Practice:**
Set your IDE to use spaces or tabs consistently.

---

## 18. **Overcomplicating Beginner Programs**

**Gotcha:**
Trying to use advanced features too early can confuse logic.
**Good Practice:**
Start with simple syntax, test often, then build up.

---
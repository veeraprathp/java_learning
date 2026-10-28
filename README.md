# Java Learning

My notes and practice code while learning Java.

## How to run

```
java .\FileName.java
```

Or compile first, then run by class name:

```
javac FileName.java
java ClassName
```

Requires JDK 17 or newer. Check with `java --version`.

## What I have covered

| Topic | File |
|---|---|
| Hello World | `Hello_World.java` |
| Loops | `loops.java` |
| Switch case | `switch_case.java` |
| Matrix (2D arrays) | `matrix.java` |
| Methods | `Methods.java` |
| Classes and objects | `app_form.java` |
| Constructors | `constructor.java` |
| Inheritance | `inheritance.java`, `Son.java` |
| Polymorphism (method overriding) | `polymorphism.java` |
| Abstract classes | `abstract.java` |
| Exception handling | `exception.java` |
| User input (`Scanner`) | `user_input.java` |
| Week 1 lesson and exercises | `week1/` |

## Key notes

- `public static void main(String[] args)` is where a Java program starts.
- `static` means the method belongs to the class, so no object is needed.
- `void` means the method returns nothing.
- **Inheritance:** a child class reuses a parent class (`extends`).
- **Polymorphism:** the same method call behaves differently depending on the actual object.
- **Method overriding:** a child class replaces a parent method with its own version.
- **Abstract class:** cannot be created directly; child classes must implement its abstract methods.
- `Scanner` is built in. Add `import java.util.Scanner;` to use it.

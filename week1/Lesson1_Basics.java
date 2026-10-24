// Week 1 - Lesson 1: Variables, data types, operators, if/else, loops
// Run:  javac Lesson1_Basics.java
//       java Lesson1_Basics   (Java 17 also allows: java Lesson1_Basics.java)

public class Lesson1_Basics {
    public static void main(String[] args) {
        // Variables and data types
        int age = 25;
        double price = 19.99;
        boolean isStudent = true;
        char grade = 'A';
        String name = "Veera";

        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Price: " + price + ", Student: " + isStudent + ", Grade: " + grade);

        // Operators
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a / b = " + (a / b) + " (integer division)");
        System.out.println("a % b = " + (a % b) + " (remainder)");

        // if / else
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // while loop
        int n = 3;
        while (n > 0) {
            System.out.println("Countdown: " + n);
            n--;
        }
    }
}

public class Operators {
    public static void main(String[] args) {
        
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operations:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus
        
        // Relational Operators
        System.out.println("\nRelational Operations:");
        System.out.println("a == b: " + (a == b));  // Equal to
        System.out.println("a != b: " + (a != b));  // Not equal to
        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));  // Less than or equal to
        
        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operations:");
        System.out.println("x && y: " + (x && y));  // AND
        System.out.println("x || y: " + (x || y));  // OR
        System.out.println("!x: " + !x);             // NOT
        
        // Assignment Operators
        int c = 15;
        System.out.println("\nAssignment Operations:");
        c += 5;  // c = c + 5
        System.out.println("c += 5: " + c);  // 20
        c -= 3;  // c = c - 3
        System.out.println("c -= 3: " + c);  // 17
        c *= 2;  // c = c * 2
        System.out.println("c *= 2: " + c);  // 34
        c /= 4;  // c = c / 4
        System.out.println("c /= 4: " + c);  // 8
        c %= 3;  // c = c % 3
        System.out.println("c %= 3: " + c);  // 2
        
        // Unary Operators
        System.out.println("\nUnary Operations:");
        int d = 5;
        System.out.println("++d: " + ++d);  // Pre-increment
        System.out.println("d++: " + d++);  // Post-increment
        System.out.println("d after d++: " + d);  // 7
        System.out.println("--d: " + --d);  // Pre-decrement
        System.out.println("d--: " + d--);  // Post-decrement
        System.out.println("d after d--: " + d);  // 5
        
        // Ternary Operator
        System.out.println("\nTernary Operation:");
        int result = (a > b) ? a : b;  // If a > b, result is a, else result is b
        System.out.println("The larger number is: " + result);
        
    }
}

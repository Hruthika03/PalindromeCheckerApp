import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: String Reverse
    public static boolean stringReverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    // Method 2: Stack
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Method 3: Deque
    public static boolean dequeMethod(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "madam";

        // Measure String Reverse
        long start1 = System.nanoTime();
        boolean res1 = stringReverse(str);
        long end1 = System.nanoTime();

        // Measure Stack
        long start2 = System.nanoTime();
        boolean res2 = stackMethod(str);
        long end2 = System.nanoTime();

        // Measure Deque
        long start3 = System.nanoTime();
        boolean res3 = dequeMethod(str);
        long end3 = System.nanoTime();

        // Display results
        System.out.println("String Reverse Result: " + res1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method Result: " + res2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Method Result: " + res3 +
                " | Time: " + (end3 - start3) + " ns");

        System.out.println("Performance comparison completed.");
    }
}
public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String str = "Madam In Eden Im Adam";

        // Normalize string: remove spaces & convert to lowercase
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        // Reverse the normalized string
        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Check palindrome
        if (normalized.equals(reversed)) {
            System.out.println("The string \"" + str + "\" is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The string \"" + str + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}

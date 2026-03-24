public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String str = "radar";

        // Convert string to character array
        char[] arr = str.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + str + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
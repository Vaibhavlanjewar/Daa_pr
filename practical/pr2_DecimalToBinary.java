package Design_Algo_Analysis.practical;

public class pr2_DecimalToBinary {

    public static String reverse(String str) {
        // Base case: if the string is empty or has only one character
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Recursive call: take the first character and append it to the reverse of the remaining string
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String originalString = "Hello"; // Example string
        String reversedString = reverse(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}

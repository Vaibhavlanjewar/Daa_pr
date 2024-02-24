package Design_Algo_Analysis.practical;

public class pr1_DecimalToBinary {
    public static String decimalToBinary(int n) {
        // Base case
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            // Recursive call
            return decimalToBinary(n / 2) + n % 2;
        }
    }

    public static void main(String[] args) {
        int decimalNumber = 10; // Example decimal number
        String binaryRepresentation = decimalToBinary(decimalNumber); 
        System.out.println("Decimal Number: " + decimalNumber);
        System.out.println("Binary Representation: " + binaryRepresentation);
    }
}

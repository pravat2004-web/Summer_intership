import java.util.Scanner;       

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: " );
        int number = sc.nextInt();
        
        int reversedNumber = reverse(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
        sc.close();
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit
        }
        return reversed;
    }
}

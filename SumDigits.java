// Name: Nguyen Hoang
// Class: CS 3305/H01
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ

// Import the Scanner class from java.util package for taking user input
import java.util.Scanner;

// Define a public class named SumDigits
public class SumDigits
{
    // Define a recursive method that calculates the sum of digits of an integer 'n'
    public static int sumDigits(int n)
    {
        // Base case: if 'n' is 0, return 0 (stopping condition of recursion)
        if (n == 0)
        {
            return 0;
        }
        // Recursive case: get the last digit (n % 10) and add it to the sum of the remaining digits (n / 10)
        return n % 10 + sumDigits(n / 10);
    }

    // Main method: the entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a 4-digit integer
        System.out.print("Please enter 4-digit integer number:\t");

        // Store the user’s input into the variable 'user_inputs'
        int user_inputs = sc.nextInt();

        // Call the recursive method sumDigits to calculate the sum of digits of the input number
        int result = SumDigits.sumDigits(user_inputs);

        // Print the result of the sum of digits
        System.out.println("The sum of digits is:\t\t\t\t\t" + result);

        // Close the Scanner object to prevent resource leak
        sc.close();
    }
}



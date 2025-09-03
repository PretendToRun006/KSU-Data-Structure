// Name: Nguyen Hoang
// Class: CS 3305/H01
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ

// Define a public class named TestTemps
public class TestTemps
{
    // Main method: entry point of the program
    public static void main(String[] args)
    {
        // Create a DailyTemps object (prompts user for temperatures of the week)
        DailyTemps Testing = new DailyTemps();

        // Allow the user to update a specific day's temperature
        Testing.setTemp();

        // Display the number of freezing days in the week
        System.out.println("Number of freezing days is " + Testing.Freezing() + " days");

        // Display which day was the warmest
        System.out.println("The warmest day of the week is " + Testing.Warmest());

        // Print all temperatures for the week
        Testing.printTemps();
    }
}
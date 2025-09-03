// Name: Nguyen Hoang
// Class: CS 3305/H01
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ

// Import Scanner for user input
import java.util.Scanner;

// Define a class named DailyTemps
public class DailyTemps {
    // Array to store temperatures for 7 days (Monday–Sunday)
    private static double[] temperature = new double[7];

    // Scanner objects for reading user input
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    // Constructor: prompts the user to enter temperatures for each day of the week
    public DailyTemps() {
        System.out.print("Enter the temperature for Monday:\t\t");
        temperature[0] = sc.nextDouble();

        System.out.print("Enter the temperature for Tuesday:\t\t");
        temperature[1] = sc.nextDouble();

        System.out.print("Enter the temperature for Wednesday:\t");
        temperature[2] = sc.nextDouble();

        System.out.print("Enter the temperature for Thursday:\t\t");
        temperature[3] = sc.nextDouble();

        System.out.print("Enter the temperature for Friday:\t\t");
        temperature[4] = sc.nextDouble();

        System.out.print("Enter the temperature for Saturday:\t\t");
        temperature[5] = sc.nextDouble();

        System.out.print("Enter the temperature for Sunday:\t\t");
        temperature[6] = sc.nextDouble();
    }

    // Method to update the temperature for a chosen day of the week
    public void setTemp()
    {
        Scanner sc = new Scanner(System.in);  // local scanner for input

        // Ask which day to update
        System.out.print("Which day of the week would you like to change the temperature? ");
        String text = sc.nextLine().toLowerCase().trim();  // normalize input

        // Ask for the new temperature
        System.out.print("Enter the temperature: ");
        double temp = sc.nextDouble();

        // Update the correct day’s temperature
        switch (text) {
            case "monday":
                temperature[0] = temp;
                break;
            case "tuesday":
                temperature[1] = temp;
                break;
            case "wednesday":
                temperature[2] = temp;
                break;
            case "thursday":
                temperature[3] = temp;
                break;
            case "friday":
                temperature[4] = temp;
                break;
            case "saturday":
                temperature[5] = temp;
                break;
            case "sunday":
                temperature[6] = temp;
                break;
        }
    }

    // Method to count how many days had freezing temperatures (below 32°F)
    public int Freezing() {
        int days = 0;  // counter for freezing days
        for (int i = 0; i < 7; i++) {
            if (temperature[i] < 32) {
                days += 1;  // increment counter if below freezing
            }
        }
        return days;  // return total freezing days
    }

    // Method to determine which day was the warmest
    public String Warmest()
    {
        double warmest_day = temperature[0]; // assume Monday is warmest initially
        int index = 0;  // store index of warmest day

        // loop through all 7 days to find warmest
        for (int i = 0; i < 7; i++)
        {
            if (temperature[i] > warmest_day) {
                warmest_day = temperature[i];
                index = i;
            }
        }

        // return the name of the warmest day based on index
        switch (index)
        {
            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 2:
                return "Wednesday";
            case 3:
                return "Thursday";
            case 4:
                return "Friday";
            case 5:
                return "Saturday";
            case 6:
                return "Sunday";
            default:
                return ""; // fallback (should not happen)
        }
    }

    // Method to print all stored temperatures for the week
    public void printTemps()
    {
        System.out.println("Monday:\t\t" + temperature[0]);
        System.out.println("Tuesday:\t" + temperature[1]);
        System.out.println("Wednesday:\t" + temperature[2]);
        System.out.println("Thursday:\t" + temperature[3]);
        System.out.println("Friday:\t\t" + temperature[4]);
        System.out.println("Saturday:\t" + temperature[5]);
        System.out.println("Sunday:\t\t" + temperature[6]);
    }
}






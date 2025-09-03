// Name: Nguyen Hoang
// Class: CS 3305/H01
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ

// Import the Scanner class from java.util package for reading user input
import java.util.Scanner;

// Define a public class named TestRectangle
public class TestRectangle
{
    // Main method: the entry point of the program
    public static void main(String[] args)
    {
        // Create a Scanner object 'sc' to take input from the user
        Scanner sc = new Scanner(System.in);

        // Declare variables to hold user-provided height and width
        double user_height;
        double user_width;

        // Ask user for the width and read input value
        System.out.print("Please enter your width value:\t");
        user_width = sc.nextDouble();

        // Ask user for the height and read input value
        System.out.print("Please enter your height value:\t");
        user_height = sc.nextDouble();

        // Create a default Rectangle object (uses default constructor)
        Rectangle myRectangle = new Rectangle();

        // Display details of the default rectangle
        System.out.println("myRectangle:");
        System.out.println("-----------");
        System.out.println("Width:\t\t" + myRectangle.getWidth());
        System.out.println("Height:\t\t" + myRectangle.getHeight());
        System.out.println("Area:\t\t" + myRectangle.getArea());
        System.out.println("Perimeter:\t" + myRectangle.getPerimeter());
        System.out.println("");  // Blank line for formatting
        System.out.println(myRectangle.printRectangle("myRectangle"));
        System.out.println("");  // Blank line for formatting

        // Create a rectangle using user-provided width and height (parameterized constructor)
        Rectangle yourRectangle = new Rectangle(user_width, user_height);

        // Display details of the user-defined rectangle
        System.out.println("yourRectangle:");
        System.out.println("-----------");
        System.out.println("Width:\t\t" + yourRectangle.getWidth());
        System.out.println("Height:\t\t" + yourRectangle.getHeight());
        System.out.println("Area:\t\t" + yourRectangle.getArea());
        System.out.println("Perimeter:\t" + yourRectangle.getPerimeter());
        System.out.println("");  // Blank line for formatting
        System.out.println(yourRectangle.printRectangle("yourRectangle"));

    }
}

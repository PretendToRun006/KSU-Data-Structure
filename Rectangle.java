// Name: Nguyen Hoang
// Class: CS 3305/H01
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ

// Define a public class named Rectangle
public class Rectangle
{
    // Private data field to store the rectangle width (default value = 1.00)
    private double width = 1.00;

    // Private data field to store the rectangle height (default value = 1.00)
    private double height = 1.00;

    // Private data field to store the rectangle area (calculated in method getArea)
    private double area;

    // Private data field to store the rectangle perimeter (calculated in method getPerimeter)
    private double perimeter;

    // Default constructor: creates a default rectangle with width = 1.00 and height = 1.00
    public Rectangle() {}

    // Parameter constructor: creates a rectangle with specified width and height from the user
    public Rectangle(double w, double h)
    {
        width = w;     // assign user input width to instance variable
        height = h;    // assign user input height to instance variable
    }

    // Getter method for width
    public double getWidth()
    {
        return width;
    }

    // Getter method for height
    public double getHeight()
    {
        return height;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea()
    {
        area = width * height;  // area = width × height
        return area;
    }

    // Method to calculate and return the perimeter of the rectangle
    public double getPerimeter()
    {
        perimeter = (2 * width) + (2 * height);  // perimeter = 2w + 2h
        return perimeter;
    }

    // Method to return a description of the rectangle in string format
    public String printRectangle(String objectName)
    {
        return "Rectangle " + objectName + " is " + width + " units wide and " + height + " units high.";
    }
}

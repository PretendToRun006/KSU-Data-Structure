// Name: Nguyen Hoang
// Class: CS 3305/H01
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 2
// IDE Name: IntelliJ

import java.util.Scanner;

public class AverageGrades
{
    public static double findAverage(int[] grades, int n)
    {
        if (n == 0)
        {
            return 0;
        }

        return grades[n-1] + findAverage(grades, n - 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int[] grades = null;
        while (true) {
            System.out.println("--------MAIN MENU-------");
            System.out.println("1. Read class size");
            System.out.println("2. Read class grades");
            System.out.println("3. Compute class average");
            System.out.println("4. Exit program");

            System.out.print("Enter option number: ");
            int option = sc.nextInt();
            System.out.println();

            switch (option)
            {
                case 1:
                    System.out.print("Enter your class size: ");
                    size = sc.nextInt();
                    grades = new int[size];
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter your classes grade:\n");
                    for(int i = 0; i < size; i++)
                    {
                        grades[i] = sc.nextInt();
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("You entered class size:\t" + size);
                    System.out.print("You entered grades:\t");
                    for (int i = 0; i < size; i++)
                    {
                        System.out.print(grades[i]);
                        if(i < grades.length - 1)
                        {
                            System.out.print(", ");
                        }
                    }
                    double sum = findAverage(grades, size);
                    double average = sum/size;
                    System.out.println();
                    System.out.println("Class average:\t" + String.format("%.2f", average));
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
            }


        }
    }
}
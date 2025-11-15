//Tamson Winstone Msiska NCE/NG/SCI/150/23

import java.util.Scanner; // Import Scanner class for user input

class AverageCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // ask the user for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble(); // Read and store the first number

        // ask the user for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble(); // Read and store the second number

        // ask the user for the third number
        System.out.print("Enter the third number: ");

        double num3 = scanner.nextDouble(); // Read and store the third number

        // as the user for the fourth number
        System.out.print("Enter the fourth number: ");

        double num4 = scanner.nextDouble(); // Read and store the fourth number

        // Calculate the sum of the four numbers
        double sum = num1 + num2 + num3 + num4;

        // Calculate the average by dividing the sum by 4
        double average = sum / 4.0;

        // Output the result to two decimal places
        System.out.printf("The average of the four numbers is: %.2f%n", average);
    }
}
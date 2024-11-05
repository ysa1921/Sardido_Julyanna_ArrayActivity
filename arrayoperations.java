import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueOperations = true;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Sum and Average of an Array");
            System.out.println("2. Maximum and Minimum Finder");
            System.out.println("3. Reverse an Array");
            System.out.println("4. Frequency Counter");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateSumAndAverage(scanner);
                    break;
                case 2:
                    findMaxMin(scanner);
                    break;
                case 3:
                    reverseArrayElements(scanner);
                    break;
                case 4:
                    countFrequency(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    continueOperations = false; 
                    continue;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue; 
            }

           
            System.out.print("Do you want to perform another operation? (yes/no): ");
            String userResponse = scanner.next();
            continueOperations = userResponse.equalsIgnoreCase("yes");

        } while (continueOperations); 

        scanner.close();
    }

    private static void calculateSumAndAverage(Scanner scanner) {
        int[] values = new int[10];
        int total = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
            total += values[i];
        }

        double average = total / (double) values.length;
        System.out.println("Sum: " + total);
        System.out.println("Average: " + average);
    }

    private static void findMaxMin(Scanner scanner) {
        int[] values = new int[15];

        System.out.println("Enter 15 numbers:");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        int maxValue = values[0];
        int minValue = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
            if (values[i] < minValue) {
                minValue = values[i];
            }
        }

        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);
    }

    private static void reverseArrayElements(Scanner scanner) {
        float[] values = new float[5];

        System.out.println("Enter 5 floating-point numbers:");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextFloat();
        }

        System.out.println("Array in reverse order:");
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    private static void countFrequency(Scanner scanner) {
        int[] values = new int[10];

        System.out.println("Enter 10 integers between 1 and 100:");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to check frequency: ");
        int targetNumber = scanner.nextInt();
        int occurrenceCount = 0;

        for (int num : values) {
            if (num == targetNumber) {
                occurrenceCount++;
            }
        }

        System.out.println("The number " + targetNumber + " appears " + occurrenceCount + " times in the array.");
    }
}


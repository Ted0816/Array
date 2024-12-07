/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.implementation.and.pkgfor.loop.practice2;

import javax.swing.JOptionPane;

/**
 *
 * @author GERALDINO_COMP111
 */
public class ArrayImplementationAndForLoopPractice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Show the different option of the given array operation
        String[] options = {
            "Sum and Average",
            "Maximum and Minimum",
            "Reverse an Array",
            "Frequency Counter"
        };

        // Show the options for the user
        int choice = JOptionPane.showOptionDialog(
            null,
            "Select an option:",
            "Array Operations",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            options,
            options[0]
        );

        // This is where the program process the choice of the user
        if (choice == 0) {
            calculateSumAndAverage();
        } else if (choice == 1) {
            findMaxAndMin();
        } else if (choice == 2) {
            reverseArray();
        } else if (choice == 3) {
            countFrequency();
        } else {
            JOptionPane.showMessageDialog(null, "No valid option selected.");
        }
    }
    // Calculate the sum and average of the array
    public static void calculateSumAndAverage() {
       // Get the size of the array
        int size = getValidArraySize("Enter the size of the array:");
        int[] array = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            array[i] = getValidInteger("Enter integer " + (i + 1) + ":");
            sum += array[i];
        }

        double average = sum / (double) size;

        JOptionPane.showMessageDialog(null, "Sum: " + sum + "\nAverage: " + average);
    }

    public static void findMaxAndMin() {
        int size = getValidArraySize("Enter the size of the array:");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = getValidInteger("Enter integer " + (i + 1) + ":");
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Maximum: " + max + "\nMinimum: " + min);
    }

    public static void reverseArray() {
        int size = getValidArraySize("Enter the size of the array:");
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            array[i] = getValidDouble("Enter floating-point number " + (i + 1) + ":");
        }

        StringBuilder reversedArray = new StringBuilder("Reversed Array:\n");
        for (int i = size - 1; i >= 0; i--) {
            reversedArray.append(array[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, reversedArray.toString());
    }

    public static void countFrequency() {
        int size = getValidArraySize("Enter the size of the array:");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = getValidInteger("Enter integer " + (i + 1) + " (1 to 100):");
        }

        int numberToCheck = getValidInteger("Enter the number to check its frequency:");
        int count = 0;

        for (int num : array) {
            if (num == numberToCheck) {
                count++;
            }
        }

        JOptionPane.showMessageDialog(null, "The number " + numberToCheck + " appears " + count + " times.");
    }

    private static int getValidInteger(String message) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(message);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
            }
        }
    }

    private static double getValidDouble(String message) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(message);
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid floating-point number.");
            }
        }
    }

    private static int getValidArraySize(String message) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(message);
                int size = Integer.parseInt(input);
                if (size > 0) {
                    return size;
                } else {
                    JOptionPane.showMessageDialog(null, "Array size must be greater than 0.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid size.");
            }
        }
    }
} 
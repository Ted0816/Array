/*
 * Name: Ted Andrei Josef C. Geraldino
 *Course: Computer Engineering - 1st year
 *Lab Activity: Array Implementation and For Loop Practice - Problem 1
 * Submission Date: December 7, 2024
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geraldino_tedandreijosef_labarrayactivity_problem3;

import javax.swing.JOptionPane;

/**
 *
 * @author GERALDINO_COMP111
 */
public class Geraldino_TedAndreiJosef_LabArrayActivity_Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
    


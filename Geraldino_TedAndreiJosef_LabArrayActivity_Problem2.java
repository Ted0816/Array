/*
 * Name: Ted Andrei Josef C. Geraldino
 *Course: Computer Engineering - 1st year
 *Lab Activity: Array Implementation and For Loop Practice - Problem 1
 * Submission Date: December 7, 2024
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geraldino_tedandreijosef_labarrayactivity_problem2;

import javax.swing.JOptionPane;

/**
 *
 * @author GERALDINO_COMP111
 */
public class Geraldino_TedAndreiJosef_LabArrayActivity_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
    


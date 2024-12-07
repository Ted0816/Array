/*
  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geraldino_tedandreijosef_labarrayactivity_problem1;

import javax.swing.JOptionPane;

/**
 *
 * @author GERALDINO_COMP111
 */
public class Geraldino_TedAndreiJosef_LabArrayActivity_Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
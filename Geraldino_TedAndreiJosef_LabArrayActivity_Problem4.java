/*
 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geraldino_tedandreijosef_labarrayactivity_problem4;

import javax.swing.JOptionPane;

/**
 *
 * @author GERALDINO_COMP111
 */
public class Geraldino_TedAndreiJosef_LabArrayActivity_Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utill;

import javax.swing.JOptionPane;
/**
 *
 * @author nirleka
 */
public class MessageDialog {
    
    public static void showSuccessMessage(String message) {
        JOptionPane.showMessageDialog(
            null,
            message,
            "Berhasil",
            JOptionPane.INFORMATION_MESSAGE
        );
    }


    public static void showUserErrorMessage(String message) {
        JOptionPane.showMessageDialog(
            null,
            message,
            "Kesalahan Pengguna",
            JOptionPane.WARNING_MESSAGE
        );
    }


    public static void showProgramErrorMessage(String message) {
        JOptionPane.showMessageDialog(
            null,
            message,
            "Error Program",
            JOptionPane.ERROR_MESSAGE
        );
    }

    public static boolean showConfirmDialog(String message)
    {
        int pilihan = JOptionPane.showConfirmDialog(
                null,
                message,
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION
        );

        if (pilihan == JOptionPane.YES_OPTION) 
        {
            return true;
        } else if (pilihan == JOptionPane.NO_OPTION) {
            
        }
            // User klik "Tidak"
            return false;
        }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.kelompok.pkg4;

import Utill.DBConnection;
/**
 *
 * @author nirleka
 */
public class TugasKelompok4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBConnection.connect("root", "", "photography");
        new HalamanLogin().setVisible(true);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


/**
 *
 * @author nirleka
 */
public class DBConnection 
{
    public static Connection conn;
    public static int ID;
    
    public static void connect(String username, String password, String DBName)
    {
        String url = "jdbc:mysql://localhost:3306/" + DBName; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Koneksi ke database berhasil!");
            DBConnection.conn = conn;
            
        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver tidak ditemukan.");
            e.printStackTrace();
            
        } catch (SQLException e) {
            System.out.println("❌ Gagal koneksi ke database.");
            e.printStackTrace();
            
        }
    }
    
    
    public static ResultSet getData (String query)
    {
        try{
            
            PreparedStatement statement = DBConnection.conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            
            return result;
            
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return null;
    }
    
    /**
     *
     * @param query => query string with '?' parameters
     * @param parameters => parameters to replace the '?'
     * @return result => ResultSet Containing the query result
     */
    public static ResultSet getData (String query, Object[] parameters)
    {
        try {
            
            PreparedStatement statement = DBConnection.conn.prepareStatement(query);
            
            for (int i = 1; i <= parameters.length; i++)
            {
                statement.setString(i, String.valueOf(parameters[i - 1]));        
            }
            
            return statement.executeQuery();
        } catch (SQLException e)
        {
            MessageDialog.showProgramErrorMessage(e.getMessage());
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public static int updateData(String query, Object[] parameters) 
    {
        try {
            PreparedStatement statement = DBConnection.conn.prepareStatement(query);

            for (int i = 1; i <= parameters.length; i++) {
                statement.setString(i, String.valueOf(parameters[i - 1]));
            }

            return statement.executeUpdate(); // jumlah baris yang berhasil diubah
        } catch (SQLException e) {
            MessageDialog.showProgramErrorMessage(e.getMessage());
            System.out.println(e.getMessage());
            return -1;
    }
}

}

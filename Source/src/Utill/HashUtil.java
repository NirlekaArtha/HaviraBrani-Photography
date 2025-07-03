package Utill;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.security.MessageDigest;
/**
 *
 * @author nirleka
 */
public class HashUtil {
    public static String hashPassword (String password)
    {
        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes("UTF-8"));
            
            StringBuilder hexstring = new StringBuilder();
            for (byte b : hash)
            {
                hexstring.append(String.format("%02x",b));
            }
            return hexstring.toString();
            
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}

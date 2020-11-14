/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proje;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ayşe
 */
public class mySqlBaglantisi {
    public static Connection Baglan() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection baglanti =
             //       DriverManager.getConnection("jdbc:mysql://91.227.6.30:3306/emrecin1_safakikramdb2?useUnicode=true&characterEncoding=UTF-8&useSSL=false&autoReconnect=true", "emrecin1_sfk", "135205E.c.E.c");
           DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8", "root", "");
             // DriverManager.getConnection("jdbc:mysql://95.173.167.85:3306/emrecin1_msrtakip", "emrecin1_emr", "001966");
           // JOptionPane.showMessageDialog(null, "BAŞARILI BAĞLANTI KURULDU", "MESAJ",
              //     JOptionPane.INFORMATION_MESSAGE);
            return baglanti;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "HATA :" + ex, "MESAJ", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        System.out.println("couldn't connect!");     
            return null;
        }
    }
}

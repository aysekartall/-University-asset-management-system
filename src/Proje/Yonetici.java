package Proje;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ayşe
 */
public class Yonetici {
    public String yoneticiAdi;
    private String şifre;
    public boolean sonuc;
    Connection baglanti = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    
    public Yonetici(){
        baglanti=mySqlBaglantisi.Baglan();
    }

    public String getYoneticiAdi() {
        return yoneticiAdi;
    }

    public void setYoneticiAdi(String yoneticiAdi) {
        this.yoneticiAdi = yoneticiAdi;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }
    
    public boolean yoneticiDogruMu(String YoneticiAdi,String şifre){
        String yoneticiSorgu = "SELECT * FROM KULLANICI WHERE KULLANICIADI= ? AND PAROLA =?";
        try{
            preparedStatement = baglanti.prepareStatement(yoneticiSorgu);
            preparedStatement.setString(1, YoneticiAdi);
            preparedStatement.setString(2, şifre);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return true;
            }
            else{
                return false;
            }
        }catch(Exception e){
            System.err.println("Hata"+e);
        }
    return sonuc;
}
    public boolean YoneticiKaydet(){
        /*Kodlar gelecek*/
    return true; 
    }
    
     public boolean YoneticiSil(){
      /*Kodlar gelecek*/
         return true; 
    }
}
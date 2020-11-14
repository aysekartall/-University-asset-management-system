package Proje;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ayşe
 */
public class dnm extends javax.swing.JFrame {
Object[] dugme ={"Tamam"};
    /**
     * Creates new form Loginn
     */
    public dnm() {
        initComponents();
        showDate();
       // getContentPane().setBackground(Color.BLUE);
    }
    
    void showDate(){
        Date d=new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd.MM.yyyy");
        lblDate.setText(s.format(d));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblbaslik = new javax.swing.JLabel();
        lblKullaniciAdi = new javax.swing.JLabel();
        lblSifre = new javax.swing.JLabel();
        txtKullanici = new javax.swing.JTextField();
        txtSifre = new javax.swing.JPasswordField();
        btnGiris = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblbackground = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ÜNİVERSİTE VARLIK YÖNETİM SİSTEMİ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        lblbaslik.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblbaslik.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "     ÜVYS GİRİŞ EKRANI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.add(lblbaslik);
        lblbaslik.setBounds(180, 10, 200, 40);

        lblKullaniciAdi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblKullaniciAdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/username.png"))); // NOI18N
        lblKullaniciAdi.setText("Kullanıcı Adı");
        jPanel1.add(lblKullaniciAdi);
        lblKullaniciAdi.setBounds(110, 90, 130, 26);

        lblSifre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSifre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pswrd.png"))); // NOI18N
        lblSifre.setText("Şifre");
        jPanel1.add(lblSifre);
        lblSifre.setBounds(110, 150, 110, 30);
        jPanel1.add(txtKullanici);
        txtKullanici.setBounds(240, 90, 140, 30);
        jPanel1.add(txtSifre);
        txtSifre.setBounds(240, 150, 140, 30);

        btnGiris.setBackground(new java.awt.Color(153, 153, 153));
        btnGiris.setForeground(new java.awt.Color(255, 255, 255));
        btnGiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginn.png"))); // NOI18N
        btnGiris.setText("GİRİŞ");
        btnGiris.setToolTipText("");
        btnGiris.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnGiris.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGiris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGirisMousePressed(evt);
            }
        });
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });
        jPanel1.add(btnGiris);
        btnGiris.setBounds(150, 240, 110, 40);

        btnCikis.setBackground(new java.awt.Color(153, 153, 153));
        btnCikis.setForeground(new java.awt.Color(255, 255, 255));
        btnCikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnCikis.setText("ÇIKIŞ YAP");
        btnCikis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });
        jPanel1.add(btnCikis);
        btnCikis.setBounds(300, 240, 120, 40);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDate.setText("Time");
        jPanel1.add(lblDate);
        lblDate.setBounds(420, 0, 110, 30);

        lblbackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ayşe\\Desktop\\ArayüzTasarım\\bckgrnd.jpeg")); // NOI18N
        jPanel1.add(lblbackground);
        lblbackground.setBounds(-10, -40, 670, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection baglanti = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
 baglanti=(Connection) mySqlBaglantisi.Baglan();         // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCikisActionPerformed

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
        Yonetici y = new Yonetici();
        boolean sonuc = y.yoneticiDogruMu(txtKullanici.getText(), txtSifre.getText());
        if(sonuc){
            JOptionPane.showOptionDialog(rootPane, "Kullanıcı adı ve parolası doğrulandı.", "Girişiniz Onaylandı", WIDTH, WIDTH, null, dugme, rootPane);
            this.setVisible(false);  //giriş panelini gizle

            //AnaPanel ana = new AnaPanel();
            //ana.setVisible(true);

        }else{
            JOptionPane.showOptionDialog(rootPane, "Kullanıcı adı veya parolası geçersiz.", "Hata Meydana Geldi", WIDTH, JOptionPane.ERROR_MESSAGE, null, dugme, rootPane);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnGirisActionPerformed

    private void btnGirisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGirisMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGirisMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dnm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dnm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dnm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dnm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dnm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnGiris;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JLabel lblbackground;
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JTextField txtKullanici;
    private javax.swing.JPasswordField txtSifre;
    // End of variables declaration//GEN-END:variables
}

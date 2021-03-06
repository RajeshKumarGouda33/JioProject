package Jio_Package;

import Database.JavaConnect;
import com.sun.glass.events.KeyEvent;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import static javafx.scene.input.KeyCode.V;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajesh
 */
public class Phoneandotp extends javax.swing.JFrame {

    
    public Phoneandotp() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        getotp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        otp = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        verify = new javax.swing.JButton();
        resend = new javax.swing.JButton();
        wrong = new javax.swing.JLabel();
        voice = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Login to your Account");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        number.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberMouseClicked(evt);
            }
        });
        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 51, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Enter your Jio Number");

        getotp.setBackground(new java.awt.Color(0, 102, 255));
        getotp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getotp.setForeground(new java.awt.Color(255, 255, 255));
        getotp.setText("Get OTP");
        getotp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getotpActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 102, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jio_Package/images.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 153, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Enter OTP sent to your JIO");

        otp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        verify.setBackground(new java.awt.Color(0, 102, 255));
        verify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        verify.setForeground(new java.awt.Color(255, 255, 255));
        verify.setText("Verify");
        verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyActionPerformed(evt);
            }
        });

        resend.setBackground(new java.awt.Color(255, 0, 0));
        resend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resend.setForeground(new java.awt.Color(255, 255, 255));
        resend.setText("Resend");
        resend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resendActionPerformed(evt);
            }
        });

        wrong.setBackground(new java.awt.Color(51, 204, 255));
        wrong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wrong.setForeground(new java.awt.Color(204, 0, 0));
        wrong.setText("You Enter Wrong OTP");

        voice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jio_Package/download.png"))); // NOI18N
        voice.setDefaultCapable(false);
        voice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voiceActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(getotp, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(verify)
                        .addGap(45, 45, 45)
                        .addComponent(resend))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wrong, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(otp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(voice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wrong)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getotp)
                    .addComponent(verify)
                    .addComponent(resend))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getotpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getotpActionPerformed
        String s1;
        s1=number.getText();

        
        int s2=910;
        String s4=Integer.toString(s2);
        String f=s1.substring(0,(s1.length() -7));
        if(f.equals(s4))
        {
                int randnum=(int)((Math.random()* 900000)+100000);
        System.out.println("Random Number is : "+randnum);       
        String s3=Integer.toString(randnum);
        label1.setText(s3);
//              int n=5;
//            String alphnumeric="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
//            StringBuilder sb=new StringBuilder(n);
//            for(int i =0; i<n; i++)
//            {
//                int index=(int)(alphnumeric.length()*Math.random());
//                sb.append(alphnumeric.charAt(index));
//                String captcha=sb.toString();
//                label1.setText(captcha);
//            }
        }
        else{
            JOptionPane.showMessageDialog(null,"This is not a Valid Jio Number");
        }
        
//try {
//            Class.forName("com.mysql.jdbc.Driver");
//            
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jio_recharge", "root", "");
//            
//            Statement stmt = con.createStatement();
//            String query = "insert into recharge_table (Mobile_No,OTP) values('" + s1 + "','" + s3 + "')";
//            stmt.executeUpdate(query);
//            JOptionPane.showMessageDialog(null, "Data stored !");
//            setVisible(false);
//            Item obj=new Item();
//            obj.setVisible(true);
//            
//        } catch (ClassNotFoundException | SQLException ex) {
//            ex.getMessage();
//        }


    }//GEN-LAST:event_getotpActionPerformed

    private void verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyActionPerformed
        
        String s1,s2;
        int s3;
        s1=otp.getText();
        s2=label1.getText();
        System.out.println(s2);
        if(s1.equals(s2))
        {
            
            JOptionPane.showMessageDialog(null,"OTP is Verified");
            resend.setEnabled(false);
            

            setVisible(false);
            Menu obj=new Menu();
            obj.setVisible(true);
        }
        else
        {
            wrong.setEnabled(true);
            resend.setEnabled(true);
            verify.setEnabled(false);
            setVisible(true);
            
        }
//        String p1,p2;
//        p1=user.getText();
//        p2=password.getText();
//        try{
//             Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jio_recharge", "root", "");
//            Statement stmt = con.createStatement();
//
//            String query = "SELECT * FROM login where username='"+p1+"' AND password='"+p2+"'";
//            ResultSet rs = stmt.executeQuery(query);
//            if(rs.next())
//            {
//                setVisible(false);
//                Menu obj=new Menu();
//                obj.setVisible(true);
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(null, "Incorrect Usrname or Password");
//            }
//            
//        }
//        catch(ClassNotFoundException | SQLException e){
//        }
    }//GEN-LAST:event_verifyActionPerformed

    private void resendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resendActionPerformed
      
        wrong.setEnabled(false);
        int randnum=(int)((Math.random()* 900000)+100000);
        System.out.println("Random Number is : "+randnum);
        
        otp.setText("");
        String s1;
        s1=Integer.toString(randnum);
        label1.setText(s1);
        
        verify.setEnabled(true);

// TODO add your handling code here:
    }//GEN-LAST:event_resendActionPerformed

    private void numberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyTyped
           char c=evt.getKeyChar();
           if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || c==KeyEvent.VK_DELETE))
           {
               getToolkit().beep();
            evt.consume();   
           }
        

// TODO add your handling code here:
    }//GEN-LAST:event_numberKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        wrong.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened
private static final String VOICENAME="kevin16";
    private void voiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voiceActionPerformed
        
        Voice voice;
        VoiceManager vm=VoiceManager.getInstance();
        voice= vm.getVoice(VOICENAME);
        voice.allocate();
try
    
    
{
            String s=label1.getText();
            voice.speak(s);
}
catch(Exception e){
        
}
    }//GEN-LAST:event_voiceActionPerformed

    private void numberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberMouseClicked
          String s1,s2,s3,s4;
          s1=user.getText();
          s2=password.getText();
          try{
              Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jio_recharge", "root", "");
            Statement stmt = con.createStatement();

            String query = "SELECT * FROM login where username='"+s1+"'";
            ResultSet rs = stmt.executeQuery(query);
            
                if(rs.next())
                {
                    number.setText(rs.getString("mobile_no"));
                }
            
                
          }
          catch(SQLException | ClassNotFoundException e){
              e.printStackTrace();
          }
    }//GEN-LAST:event_numberMouseClicked

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
            java.util.logging.Logger.getLogger(Phoneandotp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Phoneandotp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Phoneandotp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Phoneandotp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Phoneandotp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getotp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel label1;
    public static javax.swing.JTextField number;
    private javax.swing.JTextField otp;
    private javax.swing.JTextField password;
    private javax.swing.JButton resend;
    public static javax.swing.JTextField user;
    private javax.swing.JButton verify;
    private javax.swing.JButton voice;
    private javax.swing.JLabel wrong;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DISD3
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class POE2 extends javax.swing.JFrame {

    /**
     * Creates new form POE2
     */
    public POE2() {
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
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Surname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Surname:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Username:");

        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Password:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Name)
                            .addComponent(Surname)
                            .addComponent(User)
                            .addComponent(Pass, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String Username = User.getText();
       String Password = Pass.getText();
       String S = Password;
       String A = Username;
       LoginPage lp = new LoginPage();
       
     
       if(Username.contains("_")&& Username.length() <= 5){
           System.out.println("Username successfully captured");
           lp.setVisible(true);
           
          }

       else {
          System.out.println("“Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in length.");
          lp.setVisible(false);
                  }
       
     //  if(S.length()>=8)
      // {
           Pattern letter = Pattern.compile("[a-zA-z]");
           Pattern digit =Pattern.compile("[0-9]");
           Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
           
           Matcher hasLetter = letter.matcher(S);
           Matcher hasDigit = digit.matcher(S);
           Matcher hasSpecial = special.matcher(S);
           
         
     //  }
     
     if (hasLetter.find() && hasDigit.find() && hasSpecial.find())
     {
         System.out.println("Password Successfully Captured");
         lp.setVisible(true);
     }
     else
     {
         System.out.println("“Password is not correctly formatted please ensure that the password contains at least characters, a capital letter, a number and a special character.”");
         lp.setVisible(false);
     }
       
       //if(Password.contains() && Password.length() >= 8) {
          // System.out.println("Password Successfully Captured");
       
       //}
       
      // else {
       //    System.out.println("“Password is not correctly formatted please ensure that the password contains at least characters, a capital letter, a number and a special character.”");
       //}
     
       
       
    //for(int i = 0; i<S.length(); i++)
   // {
    //    if(Character.isUpperCase(S.charAt(i)))
        {
    //         System.out.println("Password Successfully Captured");
        }
    }
   // System.out.println("“Password is not correctly formatted please ensure that the password contains at least characters, a capital letter, a number and a special character.”");
         
   // for (int i = 0; i>=A.length(); i++)
    {
    //    if (Character.isDigit(A.charAt(i)))
        {
    //         System.out.println("Password Successfully Captured");
        }
       // System.out.println("“Password is not correctly formatted please ensure that the password contains at least characters, a capital letter, a number and a special character.”");
 //   }
         
// TODO add your handling code here
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection DatabaseConnection = null;
        Statement DatabaseStatement = null;
        ResultSet DatabaseResult = null;
     
                
        
        POE2 poe2 = new POE2();
        String Query = "INSERT * INTO Andiswa.UserInformation";
       // String Query2 = poe2.User.toString();
        
        try{
            DatabaseConnection = DriverManager.getConnection("jdbc:derby://localhost:1527/UserDatabse");
           // DatabaseConnection = DriverManager.getDrivers();
            DatabaseStatement = DatabaseConnection.createStatement();
            DatabaseResult = DatabaseStatement.executeQuery(Query);
            
            while(DatabaseResult.next())
            {
               String Password = DatabaseResult.getString("PASSWORD");
               String Username = DatabaseResult.getString("USERNAME");
            }
            //DatabaseResult = DatabaseStatement.executeQuery(Query2);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(POE2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POE2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POE2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POE2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POE2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Surname;
    private javax.swing.JTextField User;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

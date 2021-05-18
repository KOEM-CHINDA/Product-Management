
package Form;
import Class.AccountCls;
import Class.AccountDB;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class LogIn extends javax.swing.JFrame {
  private AccountDB db;
  private Color hover = new Color(102,102,255);
  private Color exit = new Color(51,0,255);
  public LogIn() {
    initComponents();
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    lbClose = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    lbShow = new javax.swing.JLabel();
    lbHide = new javax.swing.JLabel();
    txtUser = new javax.swing.JTextField();
    txtPass = new javax.swing.JPasswordField();
    btnSignIn = new javax.swing.JButton();
    btnSignUp = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("User LogIn");
    setUndecorated(true);
    setResizable(false);
    addWindowFocusListener(new java.awt.event.WindowFocusListener() {
      public void windowGainedFocus(java.awt.event.WindowEvent evt) {
        formWindowGainedFocus(evt);
      }
      public void windowLostFocus(java.awt.event.WindowEvent evt) {
      }
    });
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(204, 204, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/color_multi_x24.png"))); // NOI18N
    lbClose.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbCloseMouseClicked(evt);
      }
    });
    jPanel1.add(lbClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 24, 24));

    jPanel2.setBackground(new java.awt.Color(204, 204, 255));
    jPanel2.setLayout(new java.awt.BorderLayout());

    jLabel2.setBackground(new java.awt.Color(204, 204, 255));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User_Group_x100.png"))); // NOI18N
    jPanel2.add(jLabel2, java.awt.BorderLayout.CENTER);

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 100));

    lbShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Black_Eye_24.png"))); // NOI18N
    lbShow.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbShowMouseClicked(evt);
      }
    });
    jPanel1.add(lbShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 30, 20));

    lbHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Black_Eye_hide_24.png"))); // NOI18N
    lbHide.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        lbHideMousePressed(evt);
      }
    });
    jPanel1.add(lbHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 30, 20));

    txtUser.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtUser.setText("Username");
    txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtUserFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtUserFocusLost(evt);
      }
    });
    txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtUserKeyTyped(evt);
      }
    });
    jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 216, 40));

    txtPass.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtPass.setText("Password");
    txtPass.setEchoChar('\u0000');
    txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtPassFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtPassFocusLost(evt);
      }
    });
    txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPassKeyTyped(evt);
      }
    });
    jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 216, 40));

    btnSignIn.setBackground(new java.awt.Color(51, 0, 255));
    btnSignIn.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
    btnSignIn.setText("Sign In");
    btnSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnSignInMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnSignInMouseExited(evt);
      }
    });
    btnSignIn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSignInActionPerformed(evt);
      }
    });
    jPanel1.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 216, -1));

    btnSignUp.setBackground(new java.awt.Color(51, 0, 255));
    btnSignUp.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
    btnSignUp.setText("Sign Up");
    btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnSignUpMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnSignUpMouseExited(evt);
      }
    });
    btnSignUp.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSignUpActionPerformed(evt);
      }
    });
    jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 216, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
    if(txtUser.getText().equals("Username")){
      removePlaceHolder(txtUser);
      txtUser.setText(null);
      txtUser.requestFocus();
    }
  }//GEN-LAST:event_txtUserFocusGained

  private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    this.requestFocusInWindow();
  }//GEN-LAST:event_formWindowGainedFocus

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    db = new AccountDB();
    lbHide.setVisible(false);
    addPlaceHolder(txtUser);
    addPlaceHolder(txtPass);
//    AccountCls acc = new AccountCls(0, "chinda", "Male", "087629243", "koemchinda.it@gmail.com", "123");
//    db.add(acc);
    ImageIcon icon = new ImageIcon("src/Images/imac_64px.png");
    this.setIconImage(icon.getImage());
  }//GEN-LAST:event_formWindowOpened

  private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
    if(txtUser.getText().equals("")){
      addPlaceHolder(txtUser);
      txtUser.setText("Username");
    }
  }//GEN-LAST:event_txtUserFocusLost

  private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
    if(txtPass.getText().equals("Password")){
      removePlaceHolder(txtPass);
      txtPass.setText(null);
      //check lbShow
      if(click == 1){
        txtPass.setEchoChar('\u0000');
        //click = 0;
      }else{
        txtPass.setEchoChar('*');
        txtPass.requestFocus();
      }
      
    }
  }//GEN-LAST:event_txtPassFocusGained

  private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
    if(txtPass.getText().equals("")){
      addPlaceHolder(txtPass);
      txtPass.setText("Password");
      txtPass.setEchoChar('\u0000');
    }
  }//GEN-LAST:event_txtPassFocusLost
  private int click =0;
  private void lbShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbShowMouseClicked
    lbShow.setVisible(false);
    lbHide.setVisible(true);
    txtPass.setEchoChar('\u0000');
    click = 1;
    
  }//GEN-LAST:event_lbShowMouseClicked

  private void lbHideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHideMousePressed
    lbShow.setVisible(true);
    lbHide.setVisible(false);
    click = 0;
    if(txtPass.getText().equals("Password"))
      txtPass.setEchoChar('\u0000');
    else
      txtPass.setEchoChar('*');
  }//GEN-LAST:event_lbHideMousePressed

  private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
    logIn(db.getAll());

  }//GEN-LAST:event_btnSignInActionPerformed

  private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
    this.dispose();
    Register.main(null);
  }//GEN-LAST:event_btnSignUpActionPerformed

  private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
    if(evt.getKeyChar()==10)
      txtPass.requestFocus();
  }//GEN-LAST:event_txtUserKeyTyped

  private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
    if(evt.getKeyChar()==10)
      logIn(db.getAll());
  }//GEN-LAST:event_txtPassKeyTyped

  private void lbCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCloseMouseClicked
    System.exit(0);
  }//GEN-LAST:event_lbCloseMouseClicked

  private void btnSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseEntered
    btnSignIn.setBackground(hover);
  }//GEN-LAST:event_btnSignInMouseEntered

  private void btnSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseExited
    btnSignIn.setBackground(exit);
  }//GEN-LAST:event_btnSignInMouseExited

  private void btnSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseEntered
    btnSignUp.setBackground(hover);
  }//GEN-LAST:event_btnSignUpMouseEntered

  private void btnSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseExited
    btnSignUp.setBackground(exit);
  }//GEN-LAST:event_btnSignUpMouseExited
  private void logIn(ArrayList<AccountCls> ls){
        String user = txtUser.getText().trim();
        String pass= String.valueOf(txtPass.getPassword());
        if(user.equals("Admin")&&pass.equals("123")){
            JOptionPane.showMessageDialog(this, "Connected");
            ShopManagement.main(null);
            this.dispose();
        }else{
            for(int i=0; i<ls.size(); i++){
                if(ls.get(i).getName().equals(user)&& ls.get(i).getPassword().equals(pass)){
                    JOptionPane.showMessageDialog(this, "Success");
                    ProductOrder.main(null);
                    this.dispose();
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Account does't exist.");
        }
        
   }
  
  private void addPlaceHolder(JTextField txt){
    Font font = txt.getFont();
    font = font.deriveFont(Font.PLAIN);
    txt.setFont(font);
    txt.setForeground(Color.GRAY);
  }
  private void removePlaceHolder(JTextField txt){
    Font font = txt.getFont();
    font = font.deriveFont(Font.BOLD);
    txt.setFont(font);
    txt.setForeground(Color.BLACK);
  }
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
      java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LogIn().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnSignIn;
  private javax.swing.JButton btnSignUp;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel lbClose;
  private javax.swing.JLabel lbHide;
  private javax.swing.JLabel lbShow;
  private javax.swing.JPasswordField txtPass;
  private javax.swing.JTextField txtUser;
  // End of variables declaration//GEN-END:variables
}

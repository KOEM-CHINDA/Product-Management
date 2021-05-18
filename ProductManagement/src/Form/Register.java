                                                                           
package Form;


import Class.AccountCls;
import Class.AccountDB;
import PlugIn.MyInput;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author CHINDA
 */
public class Register extends javax.swing.JFrame {
  private AccountDB db;
  public Register() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    lbHidePass = new javax.swing.JLabel();
    lbShowPass = new javax.swing.JLabel();
    lbShowComfirm = new javax.swing.JLabel();
    lbHideComfirm = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtUser = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtPhone = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtPass = new javax.swing.JPasswordField();
    txtComfirmPass = new javax.swing.JPasswordField();
    btnBack = new javax.swing.JButton();
    btnRegister = new javax.swing.JButton();
    comboGender = new javax.swing.JComboBox<>();
    jLabel7 = new javax.swing.JLabel();
    txtEmail = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

    lbHidePass.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    lbHidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Black_Eye_hide_24.png"))); // NOI18N
    lbHidePass.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbHidePassMouseClicked(evt);
      }
    });
    jPanel1.add(lbHidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 24, 24));

    lbShowPass.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    lbShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Black_Eye_24.png"))); // NOI18N
    lbShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        lbShowPassMousePressed(evt);
      }
    });
    jPanel1.add(lbShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 24, 24));

    lbShowComfirm.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    lbShowComfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Black_Eye_24.png"))); // NOI18N
    lbShowComfirm.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        lbShowComfirmMousePressed(evt);
      }
    });
    jPanel1.add(lbShowComfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 24, 24));

    lbHideComfirm.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    lbHideComfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Black_Eye_hide_24.png"))); // NOI18N
    lbHideComfirm.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbHideComfirmMouseClicked(evt);
      }
    });
    jPanel1.add(lbHideComfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 24, 24));

    jLabel1.setFont(new java.awt.Font("Kh Content", 1, 24)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Register Account");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 317, 33));

    jLabel2.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User_x24.png"))); // NOI18N
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

    txtUser.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtUser.setText("UserName");
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
    jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 235, -1));

    jLabel3.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phone-call_x24.png"))); // NOI18N
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

    txtPhone.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtPhone.setText("Phone");
    txtPhone.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtPhoneFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtPhoneFocusLost(evt);
      }
    });
    txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPhoneKeyTyped(evt);
      }
    });
    jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 235, -1));

    jLabel4.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lock_x24.png"))); // NOI18N
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

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
    jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 235, 35));

    txtComfirmPass.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtComfirmPass.setText("ComfirmPassword");
    txtComfirmPass.setEchoChar('\u0000');
    txtComfirmPass.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtComfirmPassFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtComfirmPassFocusLost(evt);
      }
    });
    txtComfirmPass.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtComfirmPassKeyTyped(evt);
      }
    });
    jPanel1.add(txtComfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 235, -1));

    btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/previous_x24.png"))); // NOI18N
    btnBack.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBackActionPerformed(evt);
      }
    });
    jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 73, -1));

    btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check_x24.png"))); // NOI18N
    btnRegister.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRegisterActionPerformed(evt);
      }
    });
    jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 73, -1));

    comboGender.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
    jPanel1.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 240, -1));

    jLabel7.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gmail_x24.png"))); // NOI18N
    jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

    txtEmail.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtEmail.setText("Email");
    txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtEmailFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtEmailFocusLost(evt);
      }
    });
    txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtEmailKeyTyped(evt);
      }
    });
    jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 235, -1));

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/color_multi_x24.png"))); // NOI18N
    jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabel5MouseClicked(evt);
      }
    });
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 24, 24));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
    focusGainedText(txtUser, "UserName");
  }//GEN-LAST:event_txtUserFocusGained

  private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    this.requestFocusInWindow();
  }//GEN-LAST:event_formWindowGainedFocus

  private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
    focusLostText(txtUser, "UserName");
  }//GEN-LAST:event_txtUserFocusLost

  private void txtPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusGained
    focusGainedText(txtPhone, "Phone");
  }//GEN-LAST:event_txtPhoneFocusGained

  private void txtPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusLost
    focusLostText(txtPhone, "Phone");
  }//GEN-LAST:event_txtPhoneFocusLost

  private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
    focusGainedPass(txtPass, "Password",clickpass);
  }//GEN-LAST:event_txtPassFocusGained

  private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
    focusLostPass(txtPass, "Password");
  }//GEN-LAST:event_txtPassFocusLost

  private void txtComfirmPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtComfirmPassFocusGained
    focusGainedPass(txtComfirmPass, "ComfirmPassword",clickpassCom);
  }//GEN-LAST:event_txtComfirmPassFocusGained

  private void txtComfirmPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtComfirmPassFocusLost
    focusLostPass(txtComfirmPass, "ComfirmPassword");
  }//GEN-LAST:event_txtComfirmPassFocusLost

  private void lbHidePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHidePassMouseClicked
    lbShowPass.setVisible(true);
    lbHidePass.setVisible(false);
    if(txtPass.getText().equals("Passsword"))
      txtPass.setEchoChar('\u0000');
    else
      txtPass.setEchoChar('*');
  }//GEN-LAST:event_lbHidePassMouseClicked

  private void lbShowPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbShowPassMousePressed
    lbShowPass.setVisible(false);
    lbHidePass.setVisible(true);
    txtPass.setEchoChar((char)0);
    clickpass = 1;
  }//GEN-LAST:event_lbShowPassMousePressed

  private void lbHideComfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHideComfirmMouseClicked
    lbShowComfirm.setVisible(true);
    lbHideComfirm.setVisible(false);
    if(txtComfirmPass.getText().equals("ComfirmPasssword"))
      txtComfirmPass.setEchoChar('\u0000');
    else
      txtComfirmPass.setEchoChar('*');
  }//GEN-LAST:event_lbHideComfirmMouseClicked

  private void lbShowComfirmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbShowComfirmMousePressed
    lbShowComfirm.setVisible(false);
    lbHideComfirm.setVisible(true);
    txtComfirmPass.setEchoChar((char)0);
    clickpassCom =1;
  }//GEN-LAST:event_lbShowComfirmMousePressed

  private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
   if(evt.getKeyChar()==10)
     txtPhone.requestFocus();
  }//GEN-LAST:event_txtUserKeyTyped

  private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
    MyInput.inputInteger(evt);
    if(evt.getKeyChar()==10)
      txtEmail.requestFocus();
  }//GEN-LAST:event_txtPhoneKeyTyped

  private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
    if(evt.getKeyChar()==10)
      txtComfirmPass.requestFocus();
  }//GEN-LAST:event_txtPassKeyTyped

  private void txtComfirmPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComfirmPassKeyTyped
    if(evt.getKeyChar()==10)
      register();
  }//GEN-LAST:event_txtComfirmPassKeyTyped

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    db = new AccountDB();
    addPlaceHolder(txtUser);
    addPlaceHolder(txtPhone);
    addPlaceHolder(txtEmail);
    addPlaceHolder(txtPass);
    addPlaceHolder(txtComfirmPass);
    lbHidePass.setVisible(false);
    lbHideComfirm.setVisible(false);
    ImageIcon icon = new ImageIcon("src/Images/imac_64px.png");
    this.setIconImage(icon.getImage());
  }//GEN-LAST:event_formWindowOpened

  private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
    register();
  }//GEN-LAST:event_btnRegisterActionPerformed

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    this.dispose();
    LogIn.main(null);
  }//GEN-LAST:event_btnBackActionPerformed

  private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
    focusGainedText(txtEmail, "Email");
  }//GEN-LAST:event_txtEmailFocusGained

  private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
    focusLostText(txtEmail, "Email");
  }//GEN-LAST:event_txtEmailFocusLost

  private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
    if(evt.getKeyChar()==10)
      txtPass.requestFocus();
  }//GEN-LAST:event_txtEmailKeyTyped

  private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    System.exit(0);
  }//GEN-LAST:event_jLabel5MouseClicked
  private boolean check(JTextField...txt){
    for(JTextField temp:txt){
      String str = temp.getText();
      if(str.equals("")){
        temp.requestFocus();
        return false;
      }
    }
    return true;
  }
  private int clickpass = 0;
  private int clickpassCom = 0;
  private void register(){
    String name = txtUser.getText();
    String gender = comboGender.getSelectedItem().toString();
    String email = txtEmail.getText();
    String phone = txtPhone.getText();
    String pass = String.valueOf(txtPass.getPassword());
    String comfirmPass = String.valueOf(txtComfirmPass.getPassword());
    if(pass.equals(comfirmPass)){
        int id =0;
        for(int i=0; i<db.size(); i++){
            id = db.get(i).getId();
          }
        if(db.size()==0){
          id=1;
        }else
          id++;
        AccountCls acc = new AccountCls(id, name, gender, phone, email, pass);  
        db.add(acc);
        JOptionPane.showMessageDialog(this, "Success");
        clearText(txtUser,txtEmail,txtPhone,txtPass,txtComfirmPass);
    }else
        txtComfirmPass.selectAll();

  }
  private void clearText(JTextField ...txt){
    for(JTextField temp:txt)
      temp.setText("");
    txt[0].requestFocus();
  }
  private void focusLostPass(JPasswordField txt,String str){
    if(txt.getText().equals("")){
      addPlaceHolder(txt);
      txt.setText(str);
      txt.setEchoChar('\u0000');
    }
  }
  private void focusGainedPass(JPasswordField txt, String str,int index){
    if(txt.getText().equals(str)){
      removePlaceHolder(txt);
      txt.setText(null);
      if(index==1){
        txt.setEchoChar('\u0000');
      }else{
        txt.setEchoChar('*');
        txt.requestFocus();
      }
    }
  }
  private void focusLostText(JTextField txt,String str){
    if(txt.getText().equals("")){
      addPlaceHolder(txt);
      txt.setText(str);
    }
  }
  private void focusGainedText(JTextField txt,String str){
    if(txt.getText().equals(str)){
      removePlaceHolder(txt);
      txt.setText(null);
      txt.requestFocus();
    }
  }
  private void addPlaceHolder(JTextField txt){
    Font font = txt.getFont();
    font = font.deriveFont(font.PLAIN);
    txt.setFont(font);
    txt.setForeground(Color.GRAY);
  }
  private void removePlaceHolder(JTextField txt){
    Font font = txt.getFont();
    font = font.deriveFont(font.BOLD);
    txt.setFont(font);
    txt.setForeground(Color.BLACK);
  }
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
      java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
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
        new Register().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBack;
  private javax.swing.JButton btnRegister;
  private javax.swing.JComboBox<String> comboGender;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lbHideComfirm;
  private javax.swing.JLabel lbHidePass;
  private javax.swing.JLabel lbShowComfirm;
  private javax.swing.JLabel lbShowPass;
  private javax.swing.JPasswordField txtComfirmPass;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JPasswordField txtPass;
  private javax.swing.JTextField txtPhone;
  private javax.swing.JTextField txtUser;
  // End of variables declaration//GEN-END:variables
}


package Form;

import Class.Supplier;
import Class.SupplierDB;
import PlugIn.MyInput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddSupplier extends javax.swing.JPanel {
  private SupplierDB db;
  private String gender[] = {"Male","Female"};
  private String address[] ={ "Banteay Meanchey", "Battambang", "Kampong Cham", "Kampong Chhnang", "Kampong Speu", "Kampong Thom", "Kampot", "Kandal", "Kep", "Koh Kong", "Kratie", "Mondulkiri", "Phnom Penh", "Preah Vihear", "Prey Veng", "Pursat", "Ratanak Kiri", "Siem Reap", "Preah Sihanouk", "Stung Treng", "Svay Rieng", "Takeo", "Oddar Meanchey", "Pailin", "Tboung Khmum" };
  
  public AddSupplier() {
    initComponents();
    th.start();
    setComboBox(comboGender, gender);
    setComboBox(comboAddress,address);
    setCalendar();
  }
  public void setDB(SupplierDB db){
    this.db = db;
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    pHeader = new javax.swing.JPanel();
    lbDate = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtID = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    comboGender = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    txtPhone = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    txtEmail = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    comboDay = new javax.swing.JComboBox<>();
    comboMonth = new javax.swing.JComboBox<>();
    comboYear = new javax.swing.JComboBox<>();
    btnNew = new javax.swing.JButton();
    btnAdd = new javax.swing.JButton();
    jLabel9 = new javax.swing.JLabel();
    comboAddress = new javax.swing.JComboBox<>();
    jPanel1 = new javax.swing.JPanel();
    lbImage = new javax.swing.JLabel();
    btnAddPhoto = new javax.swing.JButton();
    jSeparator1 = new javax.swing.JSeparator();

    setBackground(new java.awt.Color(204, 204, 255));
    setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

    pHeader.setBackground(new java.awt.Color(0, 102, 102));
    pHeader.setBorder(null);
    pHeader.setPreferredSize(new java.awt.Dimension(207, 50));

    lbDate.setFont(new java.awt.Font("AKbalthom KhmerGothic", 1, 14)); // NOI18N
    lbDate.setForeground(new java.awt.Color(255, 255, 255));
    lbDate.setText("Mon,12/Apil/2000 12:12:12 AM");

    javax.swing.GroupLayout pHeaderLayout = new javax.swing.GroupLayout(pHeader);
    pHeader.setLayout(pHeaderLayout);
    pHeaderLayout.setHorizontalGroup(
      pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHeaderLayout.createSequentialGroup()
        .addContainerGap(370, Short.MAX_VALUE)
        .addComponent(lbDate)
        .addContainerGap())
    );
    pHeaderLayout.setVerticalGroup(
      pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pHeaderLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lbDate, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        .addContainerGap())
    );

    jLabel1.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Supplier Information");

    jLabel2.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel2.setText("ID");

    txtID.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtID.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtIDKeyTyped(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel3.setText("Name");

    txtName.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtName.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtNameKeyTyped(evt);
      }
    });

    jLabel4.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel4.setText("Gender");

    comboGender.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    comboGender.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        comboGenderKeyTyped(evt);
      }
    });

    jLabel5.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel5.setText("Phone");

    txtPhone.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPhoneKeyTyped(evt);
      }
    });

    jLabel6.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel6.setText("Email");

    txtEmail.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtEmailKeyTyped(evt);
      }
    });

    jLabel8.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel8.setText("Date");

    comboDay.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    comboDay.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        comboDayKeyTyped(evt);
      }
    });

    comboMonth.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    comboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
    comboMonth.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboMonthActionPerformed(evt);
      }
    });
    comboMonth.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        comboMonthKeyTyped(evt);
      }
    });

    comboYear.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    comboYear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboYearActionPerformed(evt);
      }
    });
    comboYear.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        comboYearKeyTyped(evt);
      }
    });

    btnNew.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnNew.setText("New");
    btnNew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNewActionPerformed(evt);
      }
    });

    btnAdd.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus_x24.png"))); // NOI18N
    btnAdd.setText("Add");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });

    jLabel9.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel9.setText("Address");

    comboAddress.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    comboAddress.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        comboAddressKeyTyped(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(204, 204, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Product JPEG/No-image.jpg"))); // NOI18N
    jPanel1.add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 200));

    btnAddPhoto.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnAddPhoto.setText("Add Photo");
    btnAddPhoto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddPhotoActionPerformed(evt);
      }
    });
    jPanel1.add(btnAddPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 40));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
      .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(2, 2, 2)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(txtID))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(comboAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(comboDay, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(comboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(comboYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(btnNew)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd)))))
            .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGap(2, 2, 2))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addComponent(jSeparator1)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2)
              .addComponent(txtID))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4)
              .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel8)
              .addComponent(comboDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(comboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel9)
              .addComponent(comboAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnNew)
          .addComponent(btnAdd))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(11, 11, 11))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void comboMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMonthActionPerformed
    setDay();
  }//GEN-LAST:event_comboMonthActionPerformed

  private void comboYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboYearActionPerformed
    setDay();
  }//GEN-LAST:event_comboYearActionPerformed

  private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    clearText(txtID,txtName,txtPhone,txtEmail);
    setCalendar();
    setComboBox(comboGender, gender);
    setComboBox(comboAddress, address);
  }//GEN-LAST:event_btnNewActionPerformed

  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    if(checkText(txtID,txtName,txtPhone,txtEmail)){
      addElement();
      btnNewActionPerformed(evt);
    }
      
    //System.out.println(db.size());
  }//GEN-LAST:event_btnAddActionPerformed

  private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
    MyInput.inputCharacter(evt);
    enter(comboGender, evt);
  }//GEN-LAST:event_txtNameKeyTyped

  private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
    MyInput.inputInteger(evt);
    enter(txtEmail, evt);
  }//GEN-LAST:event_txtPhoneKeyTyped

  private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
    MyInput.inputInteger(evt);
    enter(txtName, evt);
  }//GEN-LAST:event_txtIDKeyTyped

  private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
    enter(comboDay, evt);
  }//GEN-LAST:event_txtEmailKeyTyped

  private void comboDayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboDayKeyTyped
    enter(comboMonth, evt);
  }//GEN-LAST:event_comboDayKeyTyped

  private void comboMonthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboMonthKeyTyped
    enter(comboYear, evt);
  }//GEN-LAST:event_comboMonthKeyTyped

  private void comboYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboYearKeyTyped
    enter(comboAddress, evt);
  }//GEN-LAST:event_comboYearKeyTyped

  private void comboAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboAddressKeyTyped
    if(evt.getKeyChar()==10){
      if(checkText(txtID,txtName,txtPhone,txtEmail)){
      addElement();
      clearText(txtID,txtName,txtPhone,txtEmail);
      setCalendar();
      setComboBox(comboGender, gender);
      setComboBox(comboAddress, address);
      }
    }
  }//GEN-LAST:event_comboAddressKeyTyped

  private void comboGenderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboGenderKeyTyped
    enter(txtPhone, evt);
  }//GEN-LAST:event_comboGenderKeyTyped
  private JFileChooser fc = new JFileChooser();
  private String nameImage;
  private void btnAddPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhotoActionPerformed
    int click = fc.showOpenDialog(this);
    if(click == fc.APPROVE_OPTION){
      File f = fc.getSelectedFile();
      lbImage.setIcon(new ImageIcon(f.getPath()));
      nameImage = f.getPath();
    }
  }//GEN-LAST:event_btnAddPhotoActionPerformed
  private void enter(JComboBox combo,KeyEvent evt){
    if(evt.getKeyChar()==10){
      combo.requestFocus();
    }
  }
  private void enter(JTextField txt,KeyEvent evt){
    if(evt.getKeyChar()==10){
      txt.requestFocus();
    }
  }
  private void clearText(JTextField ...txt){
    for(JTextField temp:txt)
      temp.setText("");
    txt[0].requestFocus();
  }
  private void addElement(){
      int id = Integer.parseInt(txtID.getText());
      String name = txtName.getText();
      String gender = comboGender.getSelectedItem().toString();
      String phone = txtPhone.getText();
      String email = txtEmail.getText();
      String address = comboAddress.getSelectedItem().toString();
      Supplier sup = new Supplier(id, name, gender, phone, email, date(), address, nameImage);
      db.add(sup);
      for(int i=0; i<db.size(); i++)
        for(int j=0; j<i; j++)
          if(db.get(i).getId()==db.get(j).getId()){
            db.remove(i);
            JOptionPane.showMessageDialog(this, "ID is Duplicate..");
            return;
          }
    JOptionPane.showMessageDialog(this, "Save");
  }
  private boolean checkText(JTextField...txt){
    for(JTextField temp:txt){
      String str = temp.getText();
      if(str.equals("")){
        temp.requestFocus();
        return false;
      }
    }
    return true;
  }
  private Date date(){
    Calendar calen = Calendar.getInstance();
    int year = Integer.parseInt(comboYear.getSelectedItem().toString());
    int month = comboMonth.getSelectedIndex();
    int day = Integer.parseInt(comboDay.getSelectedItem().toString());
    calen.set(year, month, day);
    Date date = new Date();
    return date = calen.getTime();
  }
  private void setDay(){
    Calendar calen = Calendar.getInstance();
    int year = Integer.parseInt(comboYear.getSelectedItem().toString());
    int month = comboMonth.getSelectedIndex();
    calen.set(year, month, 1);
    int maxDay = calen.getActualMaximum(calen.DATE);
    String backUpDay = String.valueOf(comboDay.getSelectedItem());//comboDay.getSelectedItem()+"";
    int oldDay = 0;
    if(!backUpDay.equals("null"))
      oldDay = Integer.parseInt(backUpDay);
    comboDay.removeAllItems();
    for(int i=1; i<=maxDay;i++){
      comboDay.addItem(""+i);
    }
    if(oldDay>maxDay)
      comboDay.setSelectedItem(""+maxDay);
    else
      comboDay.setSelectedItem(""+oldDay);
  }
  private void setCalendar(){
    Calendar calen = Calendar.getInstance();
    int year = calen.get(calen.YEAR);
    for(int i=year-30; i<=year+30; i++)
      comboYear.addItem(i+"");
    int day = calen.get(Calendar.DATE);
    int month = calen.get(calen.MONTH);
    comboDay.setSelectedItem(""+day);
    comboMonth.setSelectedIndex(month);
    comboYear.setSelectedItem(year+"");
  }
  private void setComboBox(JComboBox combo, String str[]){
    combo.removeAllItems();
    for(String temp:str)
      combo.addItem(temp);
  }
  private Thread th = new Thread(new Runnable() {
    @Override
    public void run() {
      try {
      while(true){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE,dd/MMMM/yyyy,hh:mm:ss a");
        lbDate.setText(sdf.format(date));
        Thread.sleep(1000);
      }
    } catch (Exception e) {
    }
    }
  });

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdd;
  private javax.swing.JButton btnAddPhoto;
  private javax.swing.JButton btnNew;
  private javax.swing.JComboBox<String> comboAddress;
  private javax.swing.JComboBox<String> comboDay;
  private javax.swing.JComboBox<String> comboGender;
  private javax.swing.JComboBox<String> comboMonth;
  private javax.swing.JComboBox<String> comboYear;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JLabel lbDate;
  private javax.swing.JLabel lbImage;
  private javax.swing.JPanel pHeader;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JTextField txtID;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtPhone;
  // End of variables declaration//GEN-END:variables
}

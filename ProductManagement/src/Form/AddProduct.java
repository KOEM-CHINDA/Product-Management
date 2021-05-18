
package Form;

import Class.ProductDB;
import Class.ProductShopCls;
import PlugIn.MyInput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//E:\\Java\\ProductManagement\\src\
public class AddProduct extends javax.swing.JPanel {
  private JFileChooser fc = new JFileChooser();
  private ProductDB db;
  private String category[] = { "Beer", "Drink", "Food", "Snack", "Wine" };
  public AddProduct() {
    initComponents();
    th.start();
    setCalendar();
    setCombo(comboCategories, category);
  }
  public void setDB(ProductDB db){
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
    comboCategories = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    txtQty = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    txtPriceIn = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    txtPriceOut = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    comboDay = new javax.swing.JComboBox<>();
    comboMonth = new javax.swing.JComboBox<>();
    comboYear = new javax.swing.JComboBox<>();
    btnNew = new javax.swing.JButton();
    btnAdd = new javax.swing.JButton();
    jSeparator2 = new javax.swing.JSeparator();
    jPanel1 = new javax.swing.JPanel();
    lbImage = new javax.swing.JLabel();
    btnAddPhoto = new javax.swing.JButton();

    setBackground(new java.awt.Color(204, 204, 255));
    setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

    pHeader.setBackground(new java.awt.Color(0, 102, 102));
    pHeader.setPreferredSize(new java.awt.Dimension(207, 50));

    lbDate.setFont(new java.awt.Font("AKbalthom KhmerGothic", 1, 14)); // NOI18N
    lbDate.setForeground(new java.awt.Color(255, 255, 255));
    lbDate.setText("Mon,12/Apil/2000 12:12:12 AM");

    javax.swing.GroupLayout pHeaderLayout = new javax.swing.GroupLayout(pHeader);
    pHeader.setLayout(pHeaderLayout);
    pHeaderLayout.setHorizontalGroup(
      pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHeaderLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    jLabel1.setText("Product Information");

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
    jLabel4.setText("Category");

    comboCategories.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    comboCategories.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        comboCategoriesKeyTyped(evt);
      }
    });

    jLabel5.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel5.setText("Qty");

    txtQty.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtQtyKeyTyped(evt);
      }
    });

    jLabel6.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel6.setText("Price In");

    txtPriceIn.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtPriceIn.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPriceInKeyTyped(evt);
      }
    });

    jLabel7.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel7.setText("Price Out");

    txtPriceOut.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtPriceOut.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPriceOutKeyTyped(evt);
      }
    });

    jLabel8.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel8.setText("Date");

    comboDay.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N

    comboMonth.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    comboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
    comboMonth.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboMonthActionPerformed(evt);
      }
    });

    comboYear.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    comboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
    comboYear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboYearActionPerformed(evt);
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

    jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

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
    btnAddPhoto.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        btnAddPhotoKeyPressed(evt);
      }
    });
    jPanel1.add(btnAddPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
      .addComponent(jSeparator2)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(comboCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtPriceIn, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtPriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addComponent(comboDay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(comboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(104, 104, 104)
            .addComponent(btnNew)
            .addGap(87, 87, 87)
            .addComponent(btnAdd)))
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(6, 6, 6)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(17, 17, 17)
                .addComponent(jLabel8))
              .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(comboCategories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtPriceIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtPriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(comboDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(comboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(btnNew)
              .addComponent(btnAdd)))
          .addGroup(layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(6, 6, 6)
        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(24, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents
  
  private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
    MyInput.inputCharacter(evt);
    enter(comboCategories, evt);
  }//GEN-LAST:event_txtNameKeyTyped

  private void txtQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyTyped
    MyInput.inputInteger(evt);
    enter(txtPriceIn, evt);
  }//GEN-LAST:event_txtQtyKeyTyped

  private void txtPriceInKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceInKeyTyped
    MyInput.inputFloat(evt, txtPriceIn, 4);
    enter(btnAddPhoto, evt);
  }//GEN-LAST:event_txtPriceInKeyTyped

  private void txtPriceOutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceOutKeyTyped
    MyInput.inputFloat(evt, txtPriceOut, 4);
    if(evt.getKeyChar()==10)
      if(checkText(txtID,txtName,txtQty,txtPriceIn,txtPriceOut)){
      addElement(db.getAll());
      clearText(txtID,txtName,txtQty,txtPriceIn,txtPriceOut);
      setCombo(comboCategories, category);
      }
  }//GEN-LAST:event_txtPriceOutKeyTyped

  private void comboMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMonthActionPerformed
    setDay();
  }//GEN-LAST:event_comboMonthActionPerformed

  private void comboYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboYearActionPerformed
    setDay();
  }//GEN-LAST:event_comboYearActionPerformed

  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    if(checkText(txtID,txtName,txtQty,txtPriceIn,txtPriceOut)){
      addElement(db.getAll());
      btnNewActionPerformed(evt);
    }
  }//GEN-LAST:event_btnAddActionPerformed

  private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    clearText(txtID,txtName,txtQty,txtPriceIn,txtPriceOut);
    setCombo(comboCategories, category);
  }//GEN-LAST:event_btnNewActionPerformed

  private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
    MyInput.inputInteger(evt);
    enter(txtName, evt);
  }//GEN-LAST:event_txtIDKeyTyped

  private void comboCategoriesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboCategoriesKeyTyped
    enter(txtQty, evt);
  }//GEN-LAST:event_comboCategoriesKeyTyped
  private String nameImage;
  private void btnAddPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhotoActionPerformed
    int click = fc.showOpenDialog(this);
    if(click == fc.APPROVE_OPTION){
      File f = fc.getSelectedFile();
      lbImage.setIcon(new ImageIcon(f.getPath()));
      nameImage = f.getPath();
    }
  }//GEN-LAST:event_btnAddPhotoActionPerformed

  private void btnAddPhotoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddPhotoKeyPressed
    enter(txtPriceOut, evt);
  }//GEN-LAST:event_btnAddPhotoKeyPressed
  private void enter(JComboBox combo,KeyEvent evt){
    if(evt.getKeyChar()==10){
      combo.requestFocus();
    }
  }
  private void enter(JButton btn,KeyEvent evt){
    if(evt.getKeyChar()==10){
      btn.requestFocus();
    }
  }
  private void enter(JTextField txt,KeyEvent evt){
    if(evt.getKeyChar()==10){
      txt.requestFocus();
    }
  }
  private void addElement(ArrayList<ProductShopCls> ls){
      int id = Integer.parseInt(txtID.getText());
      String name = txtName.getText();
      String categories = comboCategories.getSelectedItem().toString();
      int qty = Integer.parseInt(txtQty.getText());
      double priceIn = Double.parseDouble(txtPriceIn.getText());
      double priceOut = Double.parseDouble(txtPriceOut.getText());
      ProductShopCls pro = new ProductShopCls(id, name, categories, nameImage, qty,0, priceIn, priceOut, date());
      ls.add(pro);
      for(int i=0; i<ls.size(); i++)
        for(int j=0; j<i; j++)
          if(ls.get(i).getId()==ls.get(j).getId()){
            ls.remove(i);
            JOptionPane.showMessageDialog(this, "ID is duplicate");
            return;
          }
      JOptionPane.showMessageDialog(this, "Save");
  }
  private void clearText(JTextField...txt){
    for(JTextField temp:txt)
      temp.setText("");
    txt[0].requestFocus();
  }
  private boolean checkText(JTextField ...txt){
    for(JTextField temp:txt){
      String str = temp.getText();
      if(str.equals("")){
        temp.requestFocus();
        return false;
      }
    }
    return true;
  }
  private void setCombo(JComboBox combo,String str[]){
    combo.removeAllItems();
    for(String temp:str)
      combo.addItem(temp);
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
    comboYear.setSelectedItem(year+"");
    int day = calen.get(Calendar.DATE);
    int month = calen.get(calen.MONTH);
    comboDay.setSelectedItem(""+day);
    comboMonth.setSelectedIndex(month);
    
  }
  private Thread th = new Thread(new Runnable(){
    @Override
    public void run() {
      try {
        while(true){
          Date date = new Date();
          SimpleDateFormat sdf = new SimpleDateFormat("EEE,dd/MMMM/yyyy hh:mm:ss a");
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
  private javax.swing.JComboBox<String> comboCategories;
  private javax.swing.JComboBox<String> comboDay;
  private javax.swing.JComboBox<String> comboMonth;
  private javax.swing.JComboBox<String> comboYear;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JLabel lbDate;
  private javax.swing.JLabel lbImage;
  private javax.swing.JPanel pHeader;
  private javax.swing.JTextField txtID;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtPriceIn;
  private javax.swing.JTextField txtPriceOut;
  private javax.swing.JTextField txtQty;
  // End of variables declaration//GEN-END:variables
}

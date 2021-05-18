
package Form;

import Class.BuyCls;
import Class.BuyProduct;
import Class.ProductDB;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author CHINDA
 */
public class ProductInfor extends javax.swing.JPanel {
  private BuyProduct db;
  private ProductDB proDB = new ProductDB();
  public Icon getImage() {
    return image;
  }
  public void setImage(Icon image) {
    lbImage.setIcon(image);
    this.image = image;
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    lbID.setText("ID: "+id);
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    lbName.setText("Name: "+name);
    this.name = name;
  }
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    lbCategory.setText("Category: "+category);
    this.category = category;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    lbPrice.setText("Price: $"+price);
    this.price = price;
  }
  public void setDB(BuyProduct db){
    this.db = db;
  }
  
  public ProductInfor() {
    initComponents();
    btnCacel.setVisible(false);
    db = new BuyProduct();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lbImage = new javax.swing.JLabel();
    lbID = new javax.swing.JLabel();
    lbName = new javax.swing.JLabel();
    lbCategory = new javax.swing.JLabel();
    lbPrice = new javax.swing.JLabel();
    btnCacel = new javax.swing.JButton();
    btnbuy = new javax.swing.JButton();

    setBackground(new java.awt.Color(153, 153, 255));
    setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Product JPEG/No-image-found.jpg"))); // NOI18N
    add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 220, 200));

    lbID.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    lbID.setText("ID:");
    add(lbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 220, 220, 30));

    lbName.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    lbName.setText("Name:");
    add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 250, 220, 30));

    lbCategory.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    lbCategory.setText("Category:");
    add(lbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 280, 220, 30));

    lbPrice.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    lbPrice.setText("Price: $");
    add(lbPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 310, 220, 30));

    btnCacel.setBackground(new java.awt.Color(255, 0, 0));
    btnCacel.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnCacel.setText("Cancel");
    btnCacel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCacelActionPerformed(evt);
      }
    });
    add(btnCacel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 90, -1));

    btnbuy.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnbuy.setText("Buy");
    btnbuy.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnbuyActionPerformed(evt);
      }
    });
    add(btnbuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 90, -1));
  }// </editor-fold>//GEN-END:initComponents

  private void btnbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuyActionPerformed
      int index = findId(id);
      qty++;
      if(qty==1){
        BuyCls buy = new BuyCls(id, name, category, qty, price);
        db.add(buy);
      }else{
        BuyCls buy = db.get(index);
        buy.setQty(qty);
        db.set(index, buy);
      }
      btnbuy.setText("Buy("+qty+")");
      btnCacel.setVisible(true);
    
  }//GEN-LAST:event_btnbuyActionPerformed

  private void btnCacelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCacelActionPerformed

    int index = findId(id);
    qty--;
    if(qty<=0){
      btnCacel.setVisible(false);
      db.remove(index);
      btnbuy.setText("Buy");
    }else{
      BuyCls buy = db.get(index);
      buy.setQty(qty);
      db.set(index, buy);
      btnbuy.setText("Buy("+qty+")");
    }
  }//GEN-LAST:event_btnCacelActionPerformed
  private int findId(int id){
    for(int i=0; i<db.size(); i++){
      if(id==db.get(i).getId()){
        qty = db.get(i).getQty();
        return i;
      }
    }
    return -1;
  }
  public void checkBotton(){
    for(int i=0; i<proDB.size(); i++){
          btnbuy.setVisible(false);
          btnCacel.setVisible(false);
    }
  }
  private int id;
  private String name;
  private String category;
  private double price;
  private Icon image;
  private int qty=0;
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCacel;
  private javax.swing.JButton btnbuy;
  private javax.swing.JLabel lbCategory;
  private javax.swing.JLabel lbID;
  private javax.swing.JLabel lbImage;
  private javax.swing.JLabel lbName;
  private javax.swing.JLabel lbPrice;
  // End of variables declaration//GEN-END:variables
}
